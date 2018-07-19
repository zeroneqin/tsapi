package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.Step;
import com.qinjun.autotest.tsapi.bean.StepExpect;
import com.qinjun.autotest.tsapi.dao.IStepExpectDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;


public class StepExpectDaoImpl extends HibernateDaoSupport implements IStepExpectDao {

    @Override
    public StepExpect get(Long id) {
        return null;
    }

    @Override
    public Long save(StepExpect stepExpect) {
        return null;
    }

    @Override
    public void update(StepExpect stepExpect) {

    }

    @Override
    public void delete(StepExpect stepExpect) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<StepExpect> findAll() {
        return null;
    }

    @Override
    public StepExpect findUniqByStep(Step step) {
        return null;
    }
}
