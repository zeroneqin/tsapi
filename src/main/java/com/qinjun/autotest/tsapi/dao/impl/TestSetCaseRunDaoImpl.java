package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.TestSetCaseRun;
import com.qinjun.autotest.tsapi.dao.ITestSetCaseRunDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class TestSetCaseRunDaoImpl extends HibernateDaoSupport implements ITestSetCaseRunDao {
    @Override
    public TestSetCaseRun get(Long id) {
        return null;
    }

    @Override
    public Long save(TestSetCaseRun testSetCaseRun) {
        return null;
    }

    @Override
    public void update(TestSetCaseRun testSetCaseRun) {

    }

    @Override
    public void delete(TestSetCaseRun testSetCaseRun) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<TestSetCaseRun> findAll() {
        return null;
    }
}
