package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.Step;
import com.qinjun.autotest.tsapi.bean.TestSetStepRun;

import java.util.List;

public interface ITestSetStepRunDao {
    TestSetStepRun get(Long id);
    Long save(TestSetStepRun testSetStepRun);
    void update(TestSetStepRun testSetStepRun);
    void delete(TestSetStepRun testSetStepRun);
    void delete(Long id);

    List<TestSetStepRun> findAll();
    List<TestSetStepRun> findByStep(Step step);
    List<TestSetStepRun> findByStepId(Long id);
    TestSetStepRun findUniqByStep(Step step);
    TestSetStepRun findUniqByStepId(Long id);
}
