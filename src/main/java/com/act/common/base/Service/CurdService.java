package com.act.common.base.service;

import com.act.common.base.dao.CurdDao;
import com.act.common.base.entity.DataEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Transactional(
        readOnly = true
)
public abstract class CurdService<D extends CurdDao<T>, T extends DataEntity<?>> {

    protected Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    protected D dao;
    /*
    * 增删查改
    * */
    public List<T> findlist(T entity){
        return dao.findlist(entity);
    }

    public void add(T entity){
        dao.add(entity);
    }

    public int update(T entity){
        return dao.update(entity);
    }

    public int delete(T eneity){
        return dao.delete(eneity);
    }
}
