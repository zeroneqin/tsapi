package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.TestSet;
import com.qinjun.autotest.tsapi.bean.TestSetCase;
import com.qinjun.autotest.tsapi.dao.ITestSetCaseDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class TestSetCaseDaoImpl extends HibernateDaoSupport implements ITestSetCaseDao {
    @Override
    public TestSetCase get(Long id) {
        return getHibernateTemplate().get(TestSetCase.class,id);
    }

    @Override
    public Long save(TestSetCase testSetCase) {
        return (Long)  getHibernateTemplate().save(testSetCase);
    }

    @Override
    public void update(TestSetCase testSetCase) {
        getHibernateTemplate().update(testSetCase);
    }

    @Override
    public void delete(TestSetCase testSetCase) {
        getHibernateTemplate().delete(testSetCase);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<TestSetCase> findAll() {
        return (List<TestSetCase>) getHibernateTemplate().find("from TestSetCase");
    }
    @Override
    public List<TestSetCase> findByTestSet(TestSet testSet) {
        return (List<TestSetCase>) getHibernateTemplate().findByNamedParam("from TestSetCase a where a.testSet=:testSet","testSet",testSet);
    }
}
