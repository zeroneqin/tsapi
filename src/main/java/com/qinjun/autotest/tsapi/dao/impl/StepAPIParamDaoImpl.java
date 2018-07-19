package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.Step;
import com.qinjun.autotest.tsapi.bean.StepAPIParam;
import com.qinjun.autotest.tsapi.dao.IStepAPIParamDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class StepAPIParamDaoImpl extends HibernateDaoSupport implements IStepAPIParamDao {
    @Override
    public StepAPIParam get(Long id) {
        return null;
    }

    @Override
    public Long save(StepAPIParam stepAPIParam) {
        return null;
    }

    @Override
    public void update(StepAPIParam stepAPIParam) {

    }

    @Override
    public void delete(StepAPIParam stepAPIParam) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<StepAPIParam> findAll() {
        return null;
    }

    @Override
    public List<StepAPIParam> findByStep(Step step) {
        return null;
    }
}
