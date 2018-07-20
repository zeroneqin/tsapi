package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIResHeader;
import com.qinjun.autotest.tsapi.dao.IAPIResHeaderDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIResHeaderDaoImpl extends HibernateDaoSupport implements IAPIResHeaderDao {
    @Override
    public APIResHeader get(Long id) {
        return getHibernateTemplate().get(APIResHeader.class,id);
    }

    @Override
    public Long save(APIResHeader apiResHeader) {
        return (Long)  getHibernateTemplate().save(apiResHeader);
    }

    @Override
    public void update(APIResHeader apiResHeader) {
        getHibernateTemplate().update(apiResHeader);
    }

    @Override
    public void delete(APIResHeader apiResHeader) {
        getHibernateTemplate().delete(apiResHeader);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<APIResHeader> findAll() {
        return (List<APIResHeader>) getHibernateTemplate().find("from APIResHeader");
    }

    @Override
    public List<APIResHeader> findByAPI(API api) {
        return (List<APIResHeader>) getHibernateTemplate().findByNamedParam("from APIResHeader a where a.api=:api","api",api);
    }

    @Override
    public List<APIResHeader> findByAPIId(Long id) {
        return (List<APIResHeader>) getHibernateTemplate().findByNamedParam("from APIResHeader a where a.api.id=:id","id",id);
    }

    @Override
    public APIResHeader findUniqByAPI(API api) {
        List<APIResHeader> apiResHeaderList = (List<APIResHeader>) getHibernateTemplate().findByNamedParam("from APIResHeader a where a.api=:api","api",api);
        if (apiResHeaderList.size()==0) {
            return null;
        }
        else {
            return apiResHeaderList.get(0);
        }
    }

    @Override
    public APIResHeader findUniqByAPIId(Long id) {
        List<APIResHeader> apiResHeaderList = (List<APIResHeader>) getHibernateTemplate().findByNamedParam("from APIResHeader a where a.api.id=:id","id",id);
        if (apiResHeaderList.size()==0) {
            return null;
        }
        else {
            return apiResHeaderList.get(0);
        }
    }
}
