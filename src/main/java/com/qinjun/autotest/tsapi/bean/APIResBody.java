package com.qinjun.autotest.tsapi.bean;

import com.qinjun.autotest.tsapi.constant.EnumBodyFormat;

public class APIResBody {
    private  Long id;
    private API api;
    private EnumBodyFormat bodyFormat;
    private String bodySchema;
    private String description;

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

    public EnumBodyFormat getBodyFormat() {
        return bodyFormat;
    }

    public void setBodyFormat(EnumBodyFormat bodyFormat) {
        this.bodyFormat = bodyFormat;
    }

    public String getBodySchema() {
        return bodySchema;
    }

    public void setBodySchema(String bodySchema) {
        this.bodySchema = bodySchema;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
