package com.qinjun.autotest.tsapi.bean;

public class StepAPIParam {
    private Long id;
    private Step step;
    private APIReqParam apiReqParam;
    private String value;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Step getStep() {
        return step;
    }

    public void setStep(Step step) {
        this.step = step;
    }

    public APIReqParam getApiReqParam() {
        return apiReqParam;
    }

    public void setApiReqParam(APIReqParam apiReqParam) {
        this.apiReqParam = apiReqParam;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
