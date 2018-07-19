package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.Step;
import com.qinjun.autotest.tsapi.bean.TestSetStepRun;
import com.qinjun.autotest.tsapi.dao.ITestSetStepRunDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class TestSetStepRunDaoImpl extends HibernateDaoSupport implements ITestSetStepRunDao {
    @Override
    public TestSetStepRun get(Long id) {
        return null;
    }

    @Override
    public Long save(TestSetStepRun testSetStepRun) {
        return null;
    }

    @Override
    public void update(TestSetStepRun testSetStepRun) {

    }

    @Override
    public void delete(TestSetStepRun testSetStepRun) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<TestSetStepRun> findAll() {
        return null;
    }

    @Override
    public List<TestSetStepRun> findByStep(Step step) {
        return null;
    }

    @Override
    public List<TestSetStepRun> findByStepId(Long id) {
        return null;
    }

    @Override
    public TestSetStepRun findUniqByStep(Step step) {
        return null;
    }

    @Override
    public TestSetStepRun findUniqByStepId(Long id) {
        return null;
    }
}
