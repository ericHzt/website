package com.act.modules.sys.service;

import com.act.common.base.entity.Page;
import com.act.common.base.service.*;
import com.act.modules.sys.dao.SysMenuDao;
import com.act.modules.sys.entity.SysMenu;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class SysMenuService extends CurdService<SysMenuDao,SysMenu> {

    public Page<SysMenu> findPage(Page<SysMenu> page, SysMenu entity) {
        List<SysMenu> testList= super.findlist(entity);
        if(testList instanceof com.github.pagehelper.Page){
            page.setList(testList,3);
            PageInfo<SysMenu> info = page.getPageInfo();
            System.out.println("pageNum:"+info.getPageNum());
            System.out.println("pageSize:"+info.getPageSize());
            System.out.println("startRow:"+info.getStartRow());
            System.out.println("endRow:"+info.getEndRow());
            System.out.println("total:"+info.getTotal());
            System.out.println("pages:"+info.getPages());
            /*System.out.println("count:"+info.isCount());*/

            System.out.println("是否第一页:"+info.isIsFirstPage());
            System.out.println("导航条上的第一页:"+info.getNavigateFirstPage());
            System.out.println("导航条上的最后一页:"+info.getNavigateLastPage());
            System.out.println("导航页码数:"+info.getNavigatePages());
            System.out.println("导航页号:");
            for(int i : info.getNavigatepageNums()){
                System.out.println(i);
            }
        }
        return page;
    }

    @Override
    public int delete(SysMenu eneity) {
        return super.delete(eneity);
    }

    @Override
    public void add(SysMenu entity) {
        super.add(entity);
    }

    @Override
    public int update(SysMenu entity) {
        return super.update(entity);
    }
}
