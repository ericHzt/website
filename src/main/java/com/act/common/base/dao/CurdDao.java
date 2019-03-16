package com.act.common.base.dao;

import java.util.List;

/**
* dao公用接口
* */
public interface CurdDao<T> {

    /*
    * 查找列表
    * */
    public List<T> findlist(T entity);


    /*
    * 更新实体
    * */
    public int update(T entity);

    /**
    * 添加实体
    * */
    public void add(T entity);


    /*
    * 删除实体
    * */
    public int delete(T entity);
}
