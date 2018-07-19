package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.TestSet;
import com.qinjun.autotest.tsapi.bean.TestSetCase;

import java.util.List;

public interface ITestSetCaseDao {
    TestSetCase get(Long id);
    Long save(TestSetCase testSetCase);
    void update(TestSetCase testSetCase);
    void delete(TestSetCase testSetCase);
    void delete(Long id);

    List<TestSetCase> findAll();
    List<TestSetCase> findByTestSet(TestSet testSet);

}
