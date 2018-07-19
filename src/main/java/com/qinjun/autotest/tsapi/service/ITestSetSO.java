package com.qinjun.autotest.tsapi.service;

import com.qinjun.autotest.tsapi.bean.TestSet;

import java.util.List;

public interface ITestSetSO {
    public boolean run();
    public List<TestSet> getAllTestSets();
}
