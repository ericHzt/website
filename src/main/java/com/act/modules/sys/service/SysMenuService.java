package com.act.modules.sys.service;

import com.act.common.base.Service.CurdService;
import com.act.modules.sys.dao.SysMenuDao;
import com.act.modules.sys.entity.SysMenu;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional(readOnly = false)
public class SysMenuService extends CurdService<SysMenuDao,SysMenu> {

    @Override
    public List<SysMenu> findlist(SysMenu entity) {
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
