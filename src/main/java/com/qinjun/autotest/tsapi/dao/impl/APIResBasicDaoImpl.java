package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIResBasic;
import com.qinjun.autotest.tsapi.dao.IAPIResBasicDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIResBasicDaoImpl extends HibernateDaoSupport implements IAPIResBasicDao {
    @Override
    public APIResBasic get(Long id) {
        return getHibernateTemplate().get(APIResBasic.class,id);
    }

    @Override
    public Long save(APIResBasic apiResBasic) {
        return (Long)  getHibernateTemplate().save(apiResBasic);
    }

    @Override
    public void update(APIResBasic apiResBasic) {
        getHibernateTemplate().update(apiResBasic);
    }

    @Override
    public void delete(APIResBasic apiResBasic) {
        getHibernateTemplate().delete(apiResBasic);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<APIResBasic> findAll() {
        return (List<APIResBasic>) getHibernateTemplate().find("from APIResBasic");
    }

    @Override
    public List<APIResBasic> findByAPI(API api) {
        return (List<APIResBasic>) getHibernateTemplate().findByNamedParam("from APIResBasic a where a.api=:api","api",api);
    }

    @Override
    public List<APIResBasic> findByAPIId(Long id) {
        return (List<APIResBasic>) getHibernateTemplate().findByNamedParam("from APIResBasic a where a.api.id=:id","id",id);
    }

    @Override
    public APIResBasic findUniqByAPI(API api) {
        List<APIResBasic> apiResBasicList = (List<APIResBasic>) getHibernateTemplate().findByNamedParam("from APIResBasic a where a.api=:api","api",api);
        if (apiResBasicList.size()==0) {
            return null;
        }
        else {
            return apiResBasicList.get(0);
        }
    }

    @Override
    public APIResBasic findUniqByAPIId(Long id) {
        List<APIResBasic> apiResBasicList = (List<APIResBasic>) getHibernateTemplate().findByNamedParam("from APIResBasic a where a.api.id=:id","id",id);
        if (apiResBasicList.size()==0) {
            return null;
        }
        else {
            return apiResBasicList.get(0);
        }
    }
}
