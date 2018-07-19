package com.qinjun.autotest.tsapi.bean;

public class StepExpect {
    private Long id;
    private Step step;
    private Integer status;
    private Boolean empty;
    private String expectRegex;
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

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Boolean getEmpty() {
        return empty;
    }

    public void setEmpty(Boolean empty) {
        this.empty = empty;
    }

    public String getExpectRegex() {
        return expectRegex;
    }

    public void setExpectRegex(String expectRegex) {
        this.expectRegex = expectRegex;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
