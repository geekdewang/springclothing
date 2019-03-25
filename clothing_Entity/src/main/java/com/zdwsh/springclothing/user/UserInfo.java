package com.zdwsh.springclothing.user;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    private Integer id;

    private Integer uid;

    private String infoName;

    private String headimg;

    private String signs;

    private Date birthday;

    private Short sex;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getInfoName() {
        return infoName;
    }

    public void setInfoName(String infoName) {
        this.infoName = infoName == null ? null : infoName.trim();
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg == null ? null : headimg.trim();
    }

    public String getSigns() {
        return signs;
    }

    public void setSigns(String signs) {
        this.signs = signs == null ? null : signs.trim();
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Short getSex() {
        return sex;
    }

    public void setSex(Short sex) {
        this.sex = sex;
    }
}