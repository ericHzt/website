package com.act.modules.sys.service;

import com.act.common.base.Service.CurdService;
import com.act.modules.sys.dao.SysMenuDao;
import com.act.modules.sys.entity.SysMenu;
import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class SysMenuService extends CurdService<SysMenuDao,SysMenu> {

    @Override
    public List<SysMenu> findlist(SysMenu entity) {
        PageHelper.startPage(1,5);
        List<SysMenu> testList= super.findlist(entity);
        if(testList instanceof Page){
            Page<SysMenu> page = (Page)testList;

            System.out.println("pageNum:"+page.getPageNum());
            System.out.println("pageSize:"+page.getPageSize());
            System.out.println("startRow:"+page.getStartRow());
            System.out.println("endRow:"+page.getEndRow());
            System.out.println("total:"+page.getTotal());
            System.out.println("pages:"+page.getPages());
            System.out.println("count:"+page.isCount());
        }
        return super.findlist(entity);
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
