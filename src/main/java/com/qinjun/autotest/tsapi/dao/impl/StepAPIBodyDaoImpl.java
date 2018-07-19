package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.Step;
import com.qinjun.autotest.tsapi.bean.StepAPIBody;
import com.qinjun.autotest.tsapi.dao.IStepAPIBodyDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class StepAPIBodyDaoImpl extends HibernateDaoSupport implements IStepAPIBodyDao {
    @Override
    public StepAPIBody get(Long id) {
        return null;
    }

    @Override
    public Long save(StepAPIBody stepAPIBody) {
        return null;
    }

    @Override
    public void update(StepAPIBody stepAPIBody) {

    }

    @Override
    public void delete(StepAPIBody stepAPIBody) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<StepAPIBody> findAll() {
        return null;
    }

    @Override
    public List<StepAPIBody> findByStep(Step step) {
        return null;
    }

    @Override
    public StepAPIBody findUniqByStep(Step step) {
        return null;
    }
}
