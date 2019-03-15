package com.act.test.dao;

import org.springframework.stereotype.Repository;

@Repository
public interface UserDao {

    public String getUserName(String id);

}
