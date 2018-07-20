package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqHeader;
import com.qinjun.autotest.tsapi.dao.IAPIReqHeaderDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIReqHeaderDaoImpl extends HibernateDaoSupport implements IAPIReqHeaderDao {

    @Override
    public APIReqHeader get(Long id) {
        return getHibernateTemplate().get(APIReqHeader.class,id);
    }

    @Override
    public Long save(APIReqHeader apiReqHeader) {
        return (Long)  getHibernateTemplate().save(apiReqHeader);
    }

    @Override
    public void update(APIReqHeader apiReqHeader) {
        getHibernateTemplate().update(apiReqHeader);
    }

    @Override
    public void delete(APIReqHeader apiReqHeader) {
        getHibernateTemplate().delete(apiReqHeader);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<APIReqHeader> findAll() {
        return (List<APIReqHeader>) getHibernateTemplate().find("from APIReqHeader");
    }

    @Override
    public List<APIReqHeader> findByAPI(API api) {
        return (List<APIReqHeader>) getHibernateTemplate().findByNamedParam("from APIReqHeader a where a.api=:api","api",api);
    }

    @Override
    public List<APIReqHeader> findByAPIId(Long id) {
        return (List<APIReqHeader>) getHibernateTemplate().findByNamedParam("from APIReqHeader a where a.api.id=:id","id",id);
    }

    @Override
    public APIReqHeader findUniqByAPI(API api) {
        List<APIReqHeader> apiReqHeaderList = (List<APIReqHeader>) getHibernateTemplate().findByNamedParam("from APIReqHeader a where a.api=:api","api",api);
        if (apiReqHeaderList.size()==0) {
            return null;
        }
        else {
            return apiReqHeaderList.get(0);
        }
    }

    @Override
    public APIReqHeader findUniqByAPIId(Long id) {
        List<APIReqHeader> apiReqHeaderList = (List<APIReqHeader>) getHibernateTemplate().findByNamedParam("from APIReqHeader a where a.api.id=:id","id",id);
        if (apiReqHeaderList.size()==0) {
            return null;
        }
        else {
            return apiReqHeaderList.get(0);
        }
    }
}
