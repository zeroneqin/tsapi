package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.Case;
import com.qinjun.autotest.tsapi.bean.Step;
import com.qinjun.autotest.tsapi.dao.IStepDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class StepDaoImpl extends HibernateDaoSupport implements IStepDao {
    @Override
    public Step get(Long id) {
        return null;
    }

    @Override
    public Long save(Step step) {
        return null;
    }

    @Override
    public void update(Step step) {

    }

    @Override
    public void delete(Step step) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Step> findAll() {
        return null;
    }

    @Override
    public List<Step> findByAPI(API api) {
        return null;
    }

    @Override
    public List<Step> findByAPIId(Long id) {
        return null;
    }

    @Override
    public Step findUniqByAPI(API api) {
        return null;
    }

    @Override
    public Step findUniqByAPIId(Long id) {
        return null;
    }

    @Override
    public List<Step> findByCase(Case cs) {
        return null;
    }

    @Override
    public List<Step> findByCaseId(Long id) {
        return null;
    }

    @Override
    public Step findUniqByCase(Case cs) {
        return null;
    }

    @Override
    public Step findUniqByCaseId(Long id) {
        return null;
    }
}
