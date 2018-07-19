package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.TestSet;
import com.qinjun.autotest.tsapi.bean.TestSetRun;

import java.util.List;

public interface ITestSetRunDao {
    TestSetRun get(Long id);
    Long save(TestSetRun testSetRun);
    void update(TestSetRun testSetRun);
    void delete(TestSetRun testSetRun);
    void delete(Long id);

    List<TestSetRun> findAll();
    List<TestSetRun> findByTestSet(TestSet testSet);
    List<TestSetRun> findByTestSetId(Long id);
    TestSetRun findUniqByTestSet(TestSet testSet);
    TestSetRun findUniqByTestSetId(Long id);
}
