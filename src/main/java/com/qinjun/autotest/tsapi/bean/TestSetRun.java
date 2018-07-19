package com.qinjun.autotest.tsapi.bean;

import com.qinjun.autotest.tsapi.constant.EnumTestSetState;

import java.util.Date;

public class TestSetRun {
    private Long id;
    private TestSet testSet;
    private Integer progress;
    private EnumTestSetState testSetState;
    private Date startTime;
    private Date endTime;
    private String description;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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

    public EnumTestSetState getTestSetState() {
        return testSetState;
    }

    public void setTestSetState(EnumTestSetState testSetState) {
        this.testSetState = testSetState;
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
