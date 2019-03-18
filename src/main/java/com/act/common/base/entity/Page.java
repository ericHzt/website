package com.act.common.base.entity;

import com.act.common.utils.CookieUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.util.List;

public class Page<T>  implements Serializable {

    //分页信息
    private PageInfo<T> pageInfo;

    private Integer pageNum;

    private Integer pageSize;

    private String funcName = "page"; // 设置点击页码调用的js函数名称，默认为page，在一页有多个分页对象时使用。

    private String funcParam = ""; // 函数的附加参数，第三个参数值。

    public Page(HttpServletRequest request, HttpServletResponse response) {
        //设置默认值
        this.setPageNum(1);
        this.setPageSize(2);
        //获取请求参数设置页码
        String no = request.getParameter("pageNum");
        if(StringUtils.isNumeric(no)){
            CookieUtils.setCookie(response, "pageNum", no);
            this.setPageNum(Integer.valueOf(no));
        }else if(request.getParameter("repage")!=null){
            no = CookieUtils.getCookie(request, "pageNum");
            if (StringUtils.isNumeric(no)){
                this.setPageNum(Integer.parseInt(no));
            }
        }
        // 设置页面大小参数（传递repage参数，来记住页码大小）
        String size = request.getParameter("pageSize");
        if (StringUtils.isNumeric(size)){
            CookieUtils.setCookie(response, "pageSize", size);
            this.setPageSize(Integer.parseInt(size));
        }else if (request.getParameter("repage")!=null){
            no = CookieUtils.getCookie(request, "pageSize");
            if (StringUtils.isNumeric(size)){
                this.setPageSize(Integer.parseInt(size));
            }
        }
        PageHelper.startPage(this.getPageNum(),this.getPageSize());

    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    /**
    * @param list 查询列表
     *@param navigatePages 导航显示页数
     * */
    public void setList(List<T> list,Integer navigatePages){
        if(navigatePages!=null) {
            pageInfo = new PageInfo<T>(list,navigatePages);
        }else{
            pageInfo = new PageInfo<T>(list);
        }
    }

    public PageInfo<T> getPageInfo(){
        if(pageInfo!=null){
            return pageInfo;
        }
        return null;
    }

    /**
     * 默认输出当前分页标签
     * <div class="page">${page}</div>
     */
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        if(pageInfo.isIsFirstPage()){
            sb.append("<li class=\"disabled\"><a th:href=\"javascript:\">&#171; 上一页</a></li>\n");
        }else{
            sb.append("<li><a href=\"javascript:\" onclick=\""+funcName+"("+pageInfo.getPrePage()+","+pageInfo.getPageSize()+",'"+funcParam+"');\">&#171; 上一页</a></li>\n");
        }
        //导航起始位置
        int start = pageInfo.getNavigateFirstPage();
        int end = pageInfo.getNavigateLastPage();
        int length = pageInfo.getNavigatepageNums().length;

        if(start == 1 && pageInfo.isIsLastPage()){
            sb.append("<li class=\"active\"><a href=\"javascript:\">1</a></li>\n");
        }

        if(start>1) {
            if (pageInfo.getNavigatePages() + 1 < start) {
                sb.append("<li class=\"disabled\"><a href=\"javascript:\">...</a></li>\n");
            }
        }

        if(!(start == 1 && pageInfo.isIsLastPage())){
            for(int i = 0 ; i < pageInfo.getNavigatepageNums().length ; i++){
                int no = pageInfo.getNavigatepageNums()[i];
                if(no == pageNum){
                    sb.append("<li class=\"active\"><a href=\"javascript:\">" + no
                            + "</a></li>\n");
                }
                else{
                    sb.append("<li><a href=\"javascript:\" onclick=\""+funcName+"("+no+","+pageInfo.getPageSize()+",'"+funcParam+"');\">"
                           + no + "</a></li>\n");
                }
            }

        }

        if(start+pageInfo.getNavigatePages() < pageInfo.getPages()){
            sb.append("<li class=\"disabled\"><a href=\"javascript:\">...</a></li>\n");
        }

        if(pageInfo.isIsLastPage()){
            sb.append("<li class=\"disabled\"><a href=\"javascript:\">下一页 &#187;</a></li>\n");
        }else{
            sb.append("<li><a href=\"javascript:\" onclick=\""+funcName+"("+pageInfo.getNextPage()+","+pageInfo.getPageSize()+",'"+funcParam+"');\">"
                    + "下一页 &#187;</a></li>\n");
        }
        sb.append("<li class=\"disabled controls\"><a href=\"javascript:\">当前 ");
        sb.append("<input type=\"text\" value=\""+pageInfo.getPageNum()+"\" onkeypress=\"var e=window.event||this;var c=e.keyCode||e.which;if(c==13)");
        sb.append("/> / ");
        sb.append("<input type=\"text\" value=\""+pageInfo.getPages()+"\" readonly='readonly' onkeypress=\"var e=window.event||this;var c=e.keyCode||e.which;if(c==13)");
        sb.append("/> 页，");
        sb.append("共 " + pageInfo.getTotal() + " 条</a></li>\n");

        sb.insert(0,"<ul>\n").append("</ul>\n");

        sb.append("<div style=\"clear:both;\"></div>");
        return sb.toString();
    }



}
