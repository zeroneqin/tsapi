package com.qinjun.autotest.tsapi.service;

import com.qinjun.autotest.tsapi.bean.TestSet;

public interface ITestSetRunSO {
    void recordStateStart(TestSet testSet);
    void recordStateRun(TestSet testSet);
    void recordStateEnd(TestSet testSet);
}
