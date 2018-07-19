package com.qinjun.autotest.tsapi.bean;

public class StepAPIBody {
    private Long id;
    private Step step;
    private APIReqBody apiReqBody;
    private String name;
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

    public APIReqBody getApiReqBody() {
        return apiReqBody;
    }

    public void setApiReqBody(APIReqBody apiReqBody) {
        this.apiReqBody = apiReqBody;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
