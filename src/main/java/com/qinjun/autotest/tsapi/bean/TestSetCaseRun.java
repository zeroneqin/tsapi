package com.qinjun.autotest.tsapi.bean;

import com.qinjun.autotest.tsapi.constant.EnumCaseState;

import java.util.Date;

public class TestSetCaseRun {
    private Long id;
    private Case cs;
    private TestSet testSet;
    private Integer progress;
    private EnumCaseState caseState;
    private Date startTime;
    private Date endTime;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Case getCs() {
        return cs;
    }

    public void setCs(Case cs) {
        this.cs = cs;
    }

    public TestSet getTestSet() {
        return testSet;
    }

    public void setTestSet(TestSet testSet) {
        this.testSet = testSet;
    }

    public Integer getProgress() {
        return progress;
    }

    public void setProgress(Integer progress) {
        this.progress = progress;
    }

    public EnumCaseState getCaseState() {
        return caseState;
    }

    public void setCaseState(EnumCaseState caseState) {
        this.caseState = caseState;
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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
