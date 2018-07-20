package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.TestSet;
import com.qinjun.autotest.tsapi.dao.ITestSetDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class TestSetDaoImpl extends HibernateDaoSupport implements ITestSetDao {
    @Override
    public TestSet get(Long id) {
        return getHibernateTemplate().get(TestSet.class,id);
    }

    @Override
    public Long save(TestSet testSet) {
        return (Long)  getHibernateTemplate().save(testSet);
    }

    @Override
    public void update(TestSet testSet) {
        getHibernateTemplate().update(testSet);
    }

    @Override
    public void delete(TestSet testSet) {
        getHibernateTemplate().delete(testSet);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<TestSet> findAll() {
        return (List<TestSet>) getHibernateTemplate().find("from TestSet");
    }

}
