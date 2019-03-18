package com.act.modules.sys.dao;

import com.act.common.base.dao.CurdDao;
import com.act.modules.sys.entity.SysMenu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface SysMenuDao extends CurdDao<SysMenu> {


}
