package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.TestSet;
import com.qinjun.autotest.tsapi.bean.TestSetRun;
import com.qinjun.autotest.tsapi.dao.ITestSetRunDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class TestSetRunDaoImpl extends HibernateDaoSupport implements ITestSetRunDao {
    @Override
    public TestSetRun get(Long id) {
        return getHibernateTemplate().get(TestSetRun.class,id);
    }

    @Override
    public Long save(TestSetRun testSetRun) {
        return (Long)  getHibernateTemplate().save(testSetRun);
    }

    @Override
    public void update(TestSetRun testSetRun) {
        getHibernateTemplate().update(testSetRun);
    }

    @Override
    public void delete(TestSetRun testSetRun) {
        getHibernateTemplate().delete(testSetRun);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<TestSetRun> findAll() {
        return (List<TestSetRun>) getHibernateTemplate().find("from TestSetRun");
    }

    @Override
    public List<TestSetRun> findByTestSet(TestSet testSet) {
        return (List<TestSetRun>) getHibernateTemplate().findByNamedParam("from TestSetRun a where a.testSet=:testSet","testSet",testSet);
    }

    @Override
    public List<TestSetRun> findByTestSetId(Long id) {
        return (List<TestSetRun>) getHibernateTemplate().findByNamedParam("from TestSetRun a where a.testSet.id=:id","id",id);
    }

    @Override
    public TestSetRun findUniqByTestSet(TestSet testSet) {
        List<TestSetRun> testSetRunList = (List<TestSetRun>) getHibernateTemplate().findByNamedParam("from TestSetRun a where a.testSet=:testSet","testSet",testSet);
        if (testSetRunList.size()==0) {
            return null;
        }
        else {
            return testSetRunList.get(0);
        }
    }

    @Override
    public TestSetRun findUniqByTestSetId(Long id) {
        List<TestSetRun> testSetRunList = (List<TestSetRun>) getHibernateTemplate().findByNamedParam("from TestSetRun a where a.testSet.id=:id","id",id);
        if (testSetRunList.size()==0) {
            return null;
        }
        else {
            return testSetRunList.get(0);
        }
    }
}
