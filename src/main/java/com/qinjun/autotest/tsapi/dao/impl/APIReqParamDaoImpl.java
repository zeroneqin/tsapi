package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqParam;
import com.qinjun.autotest.tsapi.dao.IAPIReqParamDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIReqParamDaoImpl extends HibernateDaoSupport implements IAPIReqParamDao {
    @Override
    public APIReqParam get(Long id) {
        return getHibernateTemplate().get(APIReqParam.class,id);
    }

    @Override
    public Long save(APIReqParam apiReqParam) {
        return (Long)  getHibernateTemplate().save(apiReqParam);
    }

    @Override
    public void update(APIReqParam apiReqParam) {
        getHibernateTemplate().update(apiReqParam);
    }

    @Override
    public void delete(APIReqParam apiReqParam) {
        getHibernateTemplate().delete(apiReqParam);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<APIReqParam> findAll() {
        return (List<APIReqParam>) getHibernateTemplate().find("from APIReqParam");
    }

    @Override
    public List<APIReqParam> findByAPI(API api) {
        return (List<APIReqParam>) getHibernateTemplate().findByNamedParam("from APIReqParam a where a.api=:api","api",api);
    }

    @Override
    public List<APIReqParam> findByAPIId(Long id) {
        return (List<APIReqParam>) getHibernateTemplate().findByNamedParam("from APIReqParam a where a.api.id=:id","id",id);
    }

    @Override
    public APIReqParam findUniqByAPI(API api) {
        List<APIReqParam> apiReqParamList = (List<APIReqParam>) getHibernateTemplate().findByNamedParam("from APIReqParam a where a.api=:api","api",api);
        if (apiReqParamList.size()==0) {
            return null;
        }
        else {
            return apiReqParamList.get(0);
        }
    }

    @Override
    public APIReqParam findUniqByAPIId(Long id) {
        List<APIReqParam> apiReqParamList = (List<APIReqParam>) getHibernateTemplate().findByNamedParam("from APIReqParam a where a.api.id=:id","id",id);
        if (apiReqParamList.size()==0) {
            return null;
        }
        else {
            return apiReqParamList.get(0);
        }
    }
}
