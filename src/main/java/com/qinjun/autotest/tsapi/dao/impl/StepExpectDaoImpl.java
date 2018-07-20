package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.Step;
import com.qinjun.autotest.tsapi.bean.StepExpect;
import com.qinjun.autotest.tsapi.dao.IStepExpectDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;


public class StepExpectDaoImpl extends HibernateDaoSupport implements IStepExpectDao {
    @Override
    public StepExpect get(Long id) {
        return getHibernateTemplate().get(StepExpect.class,id);
    }

    @Override
    public Long save(StepExpect stepExpect) {
        return (Long)  getHibernateTemplate().save(stepExpect);
    }

    @Override
    public void update(StepExpect stepExpect) {
        getHibernateTemplate().update(stepExpect);
    }

    @Override
    public void delete(StepExpect stepExpect) {
        getHibernateTemplate().delete(stepExpect);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<StepExpect> findAll() {
        return (List<StepExpect>) getHibernateTemplate().find("from StepExpect");
    }





    @Override
    public StepExpect findUniqByStep(Step step) {
        List<StepExpect> stepExpectList = (List<StepExpect>) getHibernateTemplate().findByNamedParam("from StepExpect a where a.step=:step","step",step);
        if (stepExpectList.size()==0) {
            return null;
        }
        else {
            return stepExpectList.get(0);
        }
    }

}
