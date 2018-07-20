package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.Step;
import com.qinjun.autotest.tsapi.bean.StepAPIBody;
import com.qinjun.autotest.tsapi.dao.IStepAPIBodyDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class StepAPIBodyDaoImpl extends HibernateDaoSupport implements IStepAPIBodyDao {
    @Override
    public StepAPIBody get(Long id) {
        return getHibernateTemplate().get(StepAPIBody.class,id);
    }

    @Override
    public Long save(StepAPIBody stepAPIBody) {
        return (Long)  getHibernateTemplate().save(stepAPIBody);
    }

    @Override
    public void update(StepAPIBody stepAPIBody) {
        getHibernateTemplate().update(stepAPIBody);
    }

    @Override
    public void delete(StepAPIBody stepAPIBody) {
        getHibernateTemplate().delete(stepAPIBody);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<StepAPIBody> findAll() {
        return (List<StepAPIBody>) getHibernateTemplate().find("from StepAPIBody");
    }

    @Override
    public List<StepAPIBody> findByStep(Step step) {
        return (List<StepAPIBody>) getHibernateTemplate().findByNamedParam("from StepAPIBody a where a.step=:step","step",step);
    }

    @Override
    public StepAPIBody findUniqByStep(Step step) {
        List<StepAPIBody> stepAPIBodyList = (List<StepAPIBody>) getHibernateTemplate().findByNamedParam("from StepAPIBody a where a.step=:step","step",step);
        if (stepAPIBodyList.size()==0) {
            return null;
        }
        else {
            return stepAPIBodyList.get(0);
        }
    }




}
