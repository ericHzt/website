package com.act.test.service;

import com.act.test.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    UserDao userDao;

    public String getUserName(String id){
        return userDao.getUserName(id);
    }
}
