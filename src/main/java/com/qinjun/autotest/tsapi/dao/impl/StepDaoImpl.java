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
        return getHibernateTemplate().get(Step.class,id);
    }

    @Override
    public Long save(Step step) {
        return (Long)  getHibernateTemplate().save(step);
    }

    @Override
    public void update(Step step) {
        getHibernateTemplate().update(step);
    }

    @Override
    public void delete(Step step) {
        getHibernateTemplate().delete(step);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<Step> findAll() {
        return (List<Step>) getHibernateTemplate().find("from Step");
    }

    @Override
    public List<Step> findByAPI(API api) {
        return (List<Step>) getHibernateTemplate().findByNamedParam("from Step a where a.api=:api","api",api);
    }

    @Override
    public List<Step> findByAPIId(Long id) {
        return (List<Step>) getHibernateTemplate().findByNamedParam("from Step a where a.api.id=:id","id",id);
    }

    @Override
    public Step findUniqByAPI(API api) {
        List<Step> stepList = (List<Step>) getHibernateTemplate().findByNamedParam("from Step a where a.api=:api","api",api);
        if (stepList.size()==0) {
            return null;
        }
        else {
            return stepList.get(0);
        }
    }

    @Override
    public Step findUniqByAPIId(Long id) {
        List<Step> stepList = (List<Step>) getHibernateTemplate().findByNamedParam("from Step a where a.api.id=:id","id",id);
        if (stepList.size()==0) {
            return null;
        }
        else {
            return stepList.get(0);
        }
    }

    @Override
    public List<Step> findByCase(Case Case) {
        return (List<Step>) getHibernateTemplate().findByNamedParam("from Step a where a.Case=:Case","Case",Case);
    }

    @Override
    public List<Step> findByCaseId(Long id) {
        return (List<Step>) getHibernateTemplate().findByNamedParam("from Step a where a.Case.id=:id","id",id);
    }

    @Override
    public Step findUniqByCase(Case Case) {
        List<Step> stepList = (List<Step>) getHibernateTemplate().findByNamedParam("from Step a where a.Case=:Case","Case",Case);
        if (stepList.size()==0) {
            return null;
        }
        else {
            return stepList.get(0);
        }
    }

    @Override
    public Step findUniqByCaseId(Long id) {
        List<Step> stepList = (List<Step>) getHibernateTemplate().findByNamedParam("from Step a where a.Case.id=:id","id",id);
        if (stepList.size()==0) {
            return null;
        }
        else {
            return stepList.get(0);
        }
    }
}
