package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.TestSet;
import com.qinjun.autotest.tsapi.dao.ITestSetDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class TestSetDaoImpl extends HibernateDaoSupport implements ITestSetDao {
    @Override
    public TestSet get(Long id) {
        return null;
    }

    @Override
    public Long save(TestSet testSet) {
        return null;
    }

    @Override
    public void update(TestSet testSet) {

    }

    @Override
    public void delete(TestSet testSet) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<TestSet> findAll() {
        return null;
    }
}
