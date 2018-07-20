package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqAuth;
import com.qinjun.autotest.tsapi.dao.IAPIReqAuthDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIReqAuthDaoImpl extends HibernateDaoSupport implements IAPIReqAuthDao {
    @Override
    public APIReqAuth get(Long id) {
        return getHibernateTemplate().get(APIReqAuth.class,id);
    }

    @Override
    public Long save(APIReqAuth apiReqAuth) {
        return (Long) getHibernateTemplate().save(apiReqAuth);
    }

    @Override
    public void update(APIReqAuth apiReqAuth) {
        getHibernateTemplate().update(apiReqAuth);
    }

    @Override
    public void delete(APIReqAuth apiReqAuth) {
        getHibernateTemplate().delete(apiReqAuth);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<APIReqAuth> findAll() {
        return (List<APIReqAuth>) getHibernateTemplate().find("from APIReqAuth");
    }

    @Override
    public List<APIReqAuth> findByAPI(API api) {
        return (List<APIReqAuth>)  getHibernateTemplate().findByNamedParam("from APIReqAuth as a where a.api=:api","api",api);
    }

    @Override
    public List<APIReqAuth> findByAPIId(Long id) {
        return (List<APIReqAuth>) getHibernateTemplate().findByNamedParam("from APIReqAuth as a where a.api.id=:id","id",id);
    }
}
