package com.act.common.base.entity;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.commons.lang3.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.util.List;

public class Page<T> extends PageInfo<T> implements Serializable {

    private Integer currentPage = 1;

    private Integer diyPageSize = 10;

    public Page(HttpServletRequest request, HttpServletResponse response) {
        String a = request.getParameter("currentPage");
        if(StringUtils.isNumeric(a)){
            this.currentPage = Integer.valueOf(a);
        }
        PageHelper.startPage(currentPage,diyPageSize);

    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getDiyPageSize() {
        return diyPageSize;
    }

    public void setDiyPageSize(Integer pageSize) {
        this.diyPageSize = pageSize;
    }

}
