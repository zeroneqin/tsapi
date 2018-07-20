package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.TestSetCaseRun;
import com.qinjun.autotest.tsapi.dao.ITestSetCaseRunDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class TestSetCaseRunDaoImpl extends HibernateDaoSupport implements ITestSetCaseRunDao {
    @Override
    public TestSetCaseRun get(Long id) {
        return getHibernateTemplate().get(TestSetCaseRun.class,id);
    }

    @Override
    public Long save(TestSetCaseRun testSetCaseRun) {
        return (Long)  getHibernateTemplate().save(testSetCaseRun);
    }

    @Override
    public void update(TestSetCaseRun testSetCaseRun) {
        getHibernateTemplate().update(testSetCaseRun);
    }

    @Override
    public void delete(TestSetCaseRun testSetCaseRun) {
        getHibernateTemplate().delete(testSetCaseRun);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<TestSetCaseRun> findAll() {
        return (List<TestSetCaseRun>) getHibernateTemplate().find("from TestSetCaseRun");
    }


}
