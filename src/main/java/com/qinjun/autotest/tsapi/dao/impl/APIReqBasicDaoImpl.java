package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqBasic;
import com.qinjun.autotest.tsapi.dao.IAPIReqBasicDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIReqBasicDaoImpl extends HibernateDaoSupport implements IAPIReqBasicDao {
    @Override
    public APIReqBasic get(Long id) {
        return getHibernateTemplate().get(APIReqBasic.class,id);
    }

    @Override
    public Long save(APIReqBasic apiReqBasic) {
        return (Long)  getHibernateTemplate().save(apiReqBasic);
    }

    @Override
    public void update(APIReqBasic apiReqBasic) {
        getHibernateTemplate().update(apiReqBasic);
    }

    @Override
    public void delete(APIReqBasic apiReqBasic) {
        getHibernateTemplate().delete(apiReqBasic);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<APIReqBasic> findAll() {
        return (List<APIReqBasic>) getHibernateTemplate().find("from APIReqBasic");
    }

    @Override
    public List<APIReqBasic> findByAPI(API api) {
        return (List<APIReqBasic>) getHibernateTemplate().findByNamedParam("from APIReqBasic a where a.api=:api","api",api);
    }

    @Override
    public List<APIReqBasic> findByAPIId(Long id) {
        return (List<APIReqBasic>) getHibernateTemplate().findByNamedParam("from APIReqBasic a where a.api.id=:id","id",id);
    }

    @Override
    public APIReqBasic findUniqByAPI(API api) {
        List<APIReqBasic> apiReqBasicList = (List<APIReqBasic>) getHibernateTemplate().findByNamedParam("from APIReqBasic a where a.api=:api","api",api);
        if (apiReqBasicList.size()==0) {
            return null;
        }
        else {
            return apiReqBasicList.get(0);
        }
    }

    @Override
    public APIReqBasic findUniqByAPIId(Long id) {
        List<APIReqBasic> apiReqBasicList = (List<APIReqBasic>) getHibernateTemplate().findByNamedParam("from APIReqBasic a where a.api.id=:id","id",id);
        if (apiReqBasicList.size()==0) {
            return null;
        }
        else {
            return apiReqBasicList.get(0);
        }
    }
}
