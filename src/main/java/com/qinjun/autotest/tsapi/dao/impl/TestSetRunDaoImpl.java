package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.TestSet;
import com.qinjun.autotest.tsapi.bean.TestSetRun;
import com.qinjun.autotest.tsapi.dao.ITestSetRunDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class TestSetRunDaoImpl extends HibernateDaoSupport implements ITestSetRunDao {
    @Override
    public TestSetRun get(Long id) {
        return null;
    }

    @Override
    public Long save(TestSetRun testSetRun) {
        return null;
    }

    @Override
    public void update(TestSetRun testSetRun) {

    }

    @Override
    public void delete(TestSetRun testSetRun) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<TestSetRun> findAll() {
        return null;
    }

    @Override
    public List<TestSetRun> findByTestSet(TestSet testSet) {
        return null;
    }

    @Override
    public List<TestSetRun> findByTestSetId(Long id) {
        return null;
    }

    @Override
    public TestSetRun findUniqByTestSet(TestSet testSet) {
        return null;
    }

    @Override
    public TestSetRun findUniqByTestSetId(Long id) {
        return null;
    }
}
