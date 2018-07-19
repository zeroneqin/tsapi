package com.qinjun.autotest.tsapi.bean;

import com.qinjun.autotest.tsapi.constant.EnumAuthType;

public class APIReqAuth {
    Long id;
    API api;
    EnumAuthType authType;
    String userName;
    String passWord;
    String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public API getApi() {
        return api;
    }

    public void setApi(API api) {
        this.api = api;
    }

    public EnumAuthType getAuthType() {
        return authType;
    }

    public void setAuthType(EnumAuthType authType) {
        this.authType = authType;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
