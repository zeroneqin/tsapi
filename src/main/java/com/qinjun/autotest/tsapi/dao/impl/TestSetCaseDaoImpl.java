package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.TestSet;
import com.qinjun.autotest.tsapi.bean.TestSetCase;
import com.qinjun.autotest.tsapi.dao.ITestSetCaseDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class TestSetCaseDaoImpl extends HibernateDaoSupport implements ITestSetCaseDao {
    @Override
    public TestSetCase get(Long id) {
        return null;
    }

    @Override
    public Long save(TestSetCase testSetCase) {
        return null;
    }

    @Override
    public void update(TestSetCase testSetCase) {

    }

    @Override
    public void delete(TestSetCase testSetCase) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<TestSetCase> findAll() {
        return null;
    }

    @Override
    public List<TestSetCase> findByTestSet(TestSet testSet) {
        return null;
    }
}
