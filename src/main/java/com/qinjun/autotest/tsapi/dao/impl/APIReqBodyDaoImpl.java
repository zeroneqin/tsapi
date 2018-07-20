package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqBody;
import com.qinjun.autotest.tsapi.dao.IAPIReqBodyDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIReqBodyDaoImpl extends HibernateDaoSupport implements IAPIReqBodyDao {
    @Override
    public APIReqBody get(Long id) {
        return getHibernateTemplate().get(APIReqBody.class,id);
    }

    @Override
    public Long save(APIReqBody apiReqBody) {
        return (Long)  getHibernateTemplate().save(apiReqBody);
    }

    @Override
    public void update(APIReqBody apiReqBody) {
        getHibernateTemplate().update(apiReqBody);
    }

    @Override
    public void delete(APIReqBody apiReqBody) {
        getHibernateTemplate().delete(apiReqBody);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<APIReqBody> findAll() {
        return (List<APIReqBody>) getHibernateTemplate().find("from APIReqBody");
    }

    @Override
    public List<APIReqBody> findByAPI(API api) {
        return (List<APIReqBody>) getHibernateTemplate().findByNamedParam("from APIReqBody a where a.api=:api","api",api);
    }

    @Override
    public List<APIReqBody> findByAPIId(Long id) {
        return (List<APIReqBody>) getHibernateTemplate().findByNamedParam("from APIReqBody a where a.api.id=:id","id",id);
    }

    @Override
    public APIReqBody findUniqByAPI(API api) {
        List<APIReqBody> apiReqBodyList = (List<APIReqBody>) getHibernateTemplate().findByNamedParam("from APIReqBody a where a.api=:api","api",api);
        if (apiReqBodyList.size()==0) {
            return null;
        }
        else {
            return apiReqBodyList.get(0);
        }
    }

    @Override
    public APIReqBody findUniqByAPIId(Long id) {
        List<APIReqBody> apiReqBodyList = (List<APIReqBody>) getHibernateTemplate().findByNamedParam("from APIReqBody a where a.api.id=:id","id",id);
        if (apiReqBodyList.size()==0) {
            return null;
        }
        else {
            return apiReqBodyList.get(0);
        }
    }
}
