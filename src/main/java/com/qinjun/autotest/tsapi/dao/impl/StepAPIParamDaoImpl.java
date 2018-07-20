package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.Step;
import com.qinjun.autotest.tsapi.bean.StepAPIParam;
import com.qinjun.autotest.tsapi.dao.IStepAPIParamDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class StepAPIParamDaoImpl extends HibernateDaoSupport implements IStepAPIParamDao {
    @Override
    public StepAPIParam get(Long id) {
        return getHibernateTemplate().get(StepAPIParam.class,id);
    }

    @Override
    public Long save(StepAPIParam stepAPIParam) {
        return (Long)  getHibernateTemplate().save(stepAPIParam);
    }

    @Override
    public void update(StepAPIParam stepAPIParam) {
        getHibernateTemplate().update(stepAPIParam);
    }

    @Override
    public void delete(StepAPIParam stepAPIParam) {
        getHibernateTemplate().delete(stepAPIParam);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<StepAPIParam> findAll() {
        return (List<StepAPIParam>) getHibernateTemplate().find("from StepAPIParam");
    }

    @Override
    public List<StepAPIParam> findByStep(Step step) {
        return (List<StepAPIParam>) getHibernateTemplate().findByNamedParam("from StepAPIParam a where a.step=:step","step",step);
    }


}
