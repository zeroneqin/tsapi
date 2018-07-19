package com.qinjun.autotest.tsapi.bean;

import com.qinjun.autotest.tsapi.constant.EnumMethod;
import com.qinjun.autotest.tsapi.constant.EnumProtocol;

public class APIReqBasic {
    private Long id;
    private API api;
    private EnumMethod method;
    private EnumProtocol protocol;
    private String host;
    private String port;
    private String path;
    private Boolean urlEncode;
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

    public EnumMethod getMethod() {
        return method;
    }

    public void setMethod(EnumMethod method) {
        this.method = method;
    }

    public EnumProtocol getProtocol() {
        return protocol;
    }

    public void setProtocol(EnumProtocol protocol) {
        this.protocol = protocol;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getPort() {
        return port;
    }

    public void setPort(String port) {
        this.port = port;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public Boolean getUrlEncode() {
        return urlEncode;
    }

    public void setUrlEncode(Boolean urlEncode) {
        this.urlEncode = urlEncode;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
