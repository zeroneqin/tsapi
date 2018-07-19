package com.qinjun.autotest.tsapi.bean;

public class TestSetCase {
    private Long id;
    private TestSet testSet;
    private Case cs;
    private  String description;

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

    public Case getCs() {
        return cs;
    }

    public void setCs(Case cs) {
        this.cs = cs;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
