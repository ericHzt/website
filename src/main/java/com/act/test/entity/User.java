package com.act.test.entity;

import org.apache.ibatis.type.Alias;

import java.io.Serializable;

@Alias("tUser")
public class User implements Serializable {
    public String userName;
    public String password;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
