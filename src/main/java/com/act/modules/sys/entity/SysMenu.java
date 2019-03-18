package com.act.modules.sys.entity;

import com.act.common.base.entity.BaesEntity;
import com.act.common.base.entity.DataEntity;

/**
 * 系统菜单
 *  @author Eric
* */
public class SysMenu extends DataEntity<SysMenu> {

    private SysMenu parent;	// 父级菜单
    private String parentIds; // 所有父级编号
    private String name; 	// 名称
    private String href; 	// 链接
    /*private String target; 	// 目标（ mainFrame、_blank、_self、_parent、_top）*/
    private String icon; 	// 图标
    private Integer sort; 	// 排序
    private String isShow; 	// 是否在菜单中显示（1：显示；0：不显示）
    private String permission; // 权限标识

    public SysMenu getParent() {
        return parent;
    }

    public void setParent(SysMenu parent) {
        this.parent = parent;
    }

    public String getParentIds() {
        return parentIds;
    }

    public void setParentIds(String parentIds) {
        this.parentIds = parentIds;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHref() {
        return href;
    }

    public void setHref(String href) {
        this.href = href;
    }

    /*public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }*/

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public String getIsShow() {
        return isShow;
    }

    public void setIsShow(String isShow) {
        this.isShow = isShow;
    }

    public String getPermission() {
        return permission;
    }

    public void setPermission(String permission) {
        this.permission = permission;
    }
}
