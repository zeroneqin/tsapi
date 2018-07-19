package com.qinjun.autotest.tsapi.bean;

import com.qinjun.autotest.tsapi.constant.EnumContentType;

public class APIReqBody {
    Long id;
    API api;
    EnumContentType contentType;
    String body;
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

    public EnumContentType getContentType() {
        return contentType;
    }

    public void setContentType(EnumContentType contentType) {
        this.contentType = contentType;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
