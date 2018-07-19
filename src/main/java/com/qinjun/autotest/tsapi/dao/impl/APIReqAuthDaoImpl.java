package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqAuth;
import com.qinjun.autotest.tsapi.dao.IAPIReqAuthDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIReqAuthDaoImpl extends HibernateDaoSupport implements IAPIReqAuthDao {
    @Override
    public APIReqAuth get(Long id) {
        return null;
    }

    @Override
    public Long save(APIReqAuth apiReqAuth) {
        return null;
    }

    @Override
    public void update(APIReqAuth apiReqAuth) {

    }

    @Override
    public void delete(APIReqAuth apiReqAuth) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<APIReqAuth> findAll() {
        return null;
    }

    @Override
    public List<APIReqAuth> findByAPI(API api) {
        return null;
    }

    @Override
    public List<APIReqAuth> findByAPIId(Long id) {
        return null;
    }
}
