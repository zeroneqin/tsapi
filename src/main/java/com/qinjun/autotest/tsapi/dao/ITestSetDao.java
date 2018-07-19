package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.TestSet;

import java.util.List;

public interface ITestSetDao {
    TestSet get(Long id);
    Long save(TestSet testSet);
    void update(TestSet testSet);
    void delete(TestSet testSet);
    void delete(Long id);

    List<TestSet> findAll();

}
