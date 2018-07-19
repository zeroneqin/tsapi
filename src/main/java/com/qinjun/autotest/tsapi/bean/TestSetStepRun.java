package com.qinjun.autotest.tsapi.bean;

import com.qinjun.autotest.tsapi.constant.EnumMethod;
import com.qinjun.autotest.tsapi.constant.EnumStepErrorType;
import com.qinjun.autotest.tsapi.constant.EnumStepState;

import java.util.Date;

public class TestSetStepRun {
    private Long id;
    private Step step;
    private TestSetCaseRun testSetCaseRun;
    private EnumStepState stepState;
    private EnumMethod method;
    private String requestUrl;
    private String requestBody;
    private String responseCode;
    private String responseBody;
    private Date startTime;
    private Date endTime;
    private EnumStepErrorType stepErrorType;
    private String errorMsg;
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

    public TestSetCaseRun getTestSetCaseRun() {
        return testSetCaseRun;
    }

    public void setTestSetCaseRun(TestSetCaseRun testSetCaseRun) {
        this.testSetCaseRun = testSetCaseRun;
    }

    public EnumStepState getStepState() {
        return stepState;
    }

    public void setStepState(EnumStepState stepState) {
        this.stepState = stepState;
    }

    public EnumMethod getMethod() {
        return method;
    }

    public void setMethod(EnumMethod method) {
        this.method = method;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getRequestBody() {
        return requestBody;
    }

    public void setRequestBody(String requestBody) {
        this.requestBody = requestBody;
    }

    public String getResponseCode() {
        return responseCode;
    }

    public void setResponseCode(String responseCode) {
        this.responseCode = responseCode;
    }

    public String getResponseBody() {
        return responseBody;
    }

    public void setResponseBody(String responseBody) {
        this.responseBody = responseBody;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public EnumStepErrorType getStepErrorType() {
        return stepErrorType;
    }

    public void setStepErrorType(EnumStepErrorType stepErrorType) {
        this.stepErrorType = stepErrorType;
    }

    public String getErrorMsg() {
        return errorMsg;
    }

    public void setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
