package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIResBody;
import com.qinjun.autotest.tsapi.dao.IAPIResBodyDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIResBodyDaoImpl extends HibernateDaoSupport implements IAPIResBodyDao {
    @Override
    public APIResBody get(Long id) {
        return getHibernateTemplate().get(APIResBody.class,id);
    }

    @Override
    public Long save(APIResBody apiResBody) {
        return (Long)  getHibernateTemplate().save(apiResBody);
    }

    @Override
    public void update(APIResBody apiResBody) {
        getHibernateTemplate().update(apiResBody);
    }

    @Override
    public void delete(APIResBody apiResBody) {
        getHibernateTemplate().delete(apiResBody);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<APIResBody> findAll() {
        return (List<APIResBody>) getHibernateTemplate().find("from APIResBody");
    }

    @Override
    public List<APIResBody> findByAPI(API api) {
        return (List<APIResBody>) getHibernateTemplate().findByNamedParam("from APIResBody a where a.api=:api","api",api);
    }

    @Override
    public List<APIResBody> findByAPIId(Long id) {
        return (List<APIResBody>) getHibernateTemplate().findByNamedParam("from APIResBody a where a.api.id=:id","id",id);
    }

    @Override
    public APIResBody findUniqByAPI(API api) {
        List<APIResBody> apiResBodyList = (List<APIResBody>) getHibernateTemplate().findByNamedParam("from APIResBody a where a.api=:api","api",api);
        if (apiResBodyList.size()==0) {
            return null;
        }
        else {
            return apiResBodyList.get(0);
        }
    }

    @Override
    public APIResBody findUniqByAPIId(Long id) {
        List<APIResBody> apiResBodyList = (List<APIResBody>) getHibernateTemplate().findByNamedParam("from APIResBody a where a.api.id=:id","id",id);
        if (apiResBodyList.size()==0) {
            return null;
        }
        else {
            return apiResBodyList.get(0);
        }
    }
}
