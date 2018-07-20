package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.Step;
import com.qinjun.autotest.tsapi.bean.TestSetStepRun;
import com.qinjun.autotest.tsapi.dao.ITestSetStepRunDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class TestSetStepRunDaoImpl extends HibernateDaoSupport implements ITestSetStepRunDao {
    @Override
    public TestSetStepRun get(Long id) {
        return getHibernateTemplate().get(TestSetStepRun.class,id);
    }

    @Override
    public Long save(TestSetStepRun testSetStepRun) {
        return (Long)  getHibernateTemplate().save(testSetStepRun);
    }

    @Override
    public void update(TestSetStepRun testSetStepRun) {
        getHibernateTemplate().update(testSetStepRun);
    }

    @Override
    public void delete(TestSetStepRun testSetStepRun) {
        getHibernateTemplate().delete(testSetStepRun);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<TestSetStepRun> findAll() {
        return (List<TestSetStepRun>) getHibernateTemplate().find("from TestSetStepRun");
    }

    @Override
    public List<TestSetStepRun> findByStep(Step step) {
        return (List<TestSetStepRun>) getHibernateTemplate().findByNamedParam("from TestSetStepRun a where a.step=:step","step",step);
    }

    @Override
    public List<TestSetStepRun> findByStepId(Long id) {
        return (List<TestSetStepRun>) getHibernateTemplate().findByNamedParam("from TestSetStepRun a where a.step.id=:id","id",id);
    }

    @Override
    public TestSetStepRun findUniqByStep(Step step) {
        List<TestSetStepRun> testSetStepRunList = (List<TestSetStepRun>) getHibernateTemplate().findByNamedParam("from TestSetStepRun a where a.step=:step","step",step);
        if (testSetStepRunList.size()==0) {
            return null;
        }
        else {
            return testSetStepRunList.get(0);
        }
    }

    @Override
    public TestSetStepRun findUniqByStepId(Long id) {
        List<TestSetStepRun> testSetStepRunList = (List<TestSetStepRun>) getHibernateTemplate().findByNamedParam("from TestSetStepRun a where a.step.id=:id","id",id);
        if (testSetStepRunList.size()==0) {
            return null;
        }
        else {
            return testSetStepRunList.get(0);
        }
    }
}
