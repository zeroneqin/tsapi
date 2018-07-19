package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqBody;
import com.qinjun.autotest.tsapi.dao.IAPIReqBodyDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIReqBodyDaoImpl extends HibernateDaoSupport implements IAPIReqBodyDao {
    @Override
    public APIReqBody get(Long id) {
        return null;
    }

    @Override
    public Long save(APIReqBody apiReqBody) {
        return null;
    }

    @Override
    public void update(APIReqBody apiReqBody) {

    }

    @Override
    public void delete(APIReqBody apiReqBody) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<APIReqBody> findAll() {
        return null;
    }

    @Override
    public List<APIReqBody> findByAPI(API api) {
        return null;
    }

    @Override
    public List<APIReqBody> findByAPIId(Long id) {
        return null;
    }

    @Override
    public APIReqBody findUniqByAPI(API api) {
        return null;
    }

    @Override
    public APIReqBody findUniqByAPIId(Long id) {
        return null;
    }
}
