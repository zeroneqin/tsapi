package com.qinjun.autotest.tsapi.bean;

public class Step {
    private Long id;
    private API api;
    private String name;
    private Case cs;
    private Integer stepOrder;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Case getCs() {
        return cs;
    }

    public void setCs(Case cs) {
        this.cs = cs;
    }

    public Integer getStepOrder() {
        return stepOrder;
    }

    public void setStepOrder(Integer stepOrder) {
        this.stepOrder = stepOrder;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
