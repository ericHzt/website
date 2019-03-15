package com.act.common.base.entity;

import java.io.Serializable;

public class BaesEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;

    protected String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
