package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.Case;
import com.qinjun.autotest.tsapi.bean.TestSet;
import com.qinjun.autotest.tsapi.bean.TestSetCaseRun;

import java.util.List;

public interface ITestSetCaseRunDao {
    TestSetCaseRun get(Long id);
    Long save(TestSetCaseRun testSetCaseRun);
    void update(TestSetCaseRun testSetCaseRun);
    void delete(TestSetCaseRun testSetCaseRun);
    void delete(Long id);

    List<TestSetCaseRun> findAll();

}
