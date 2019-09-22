package com.gy.pojo;

import java.util.List;

/**
 * @ClassName Navigation
 * @Author gaoyang
 * @Date 2019/9/1916:53
 * @Version 1.0
 **/
public class Navigation {
    private int id;
    private String navName;
    private String navLevel;
    private String navUrl;
    private String parentId;
    private List<Navigation> childNav;


    public List<Navigation> getChildNav() {
        return childNav;
    }

    public void setChildNav(List<Navigation> childNav) {
        this.childNav = childNav;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNavName() {
        return navName;
    }

    public void setNavName(String navName) {
        this.navName = navName;
    }

    public String getNavLevel() {
        return navLevel;
    }

    public void setNavLevel(String navLevel) {
        this.navLevel = navLevel;
    }

    public String getNavUrl() {
        return navUrl;
    }

    public void setNavUrl(String navUrl) {
        this.navUrl = navUrl;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }
}
