package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIResBody;
import com.qinjun.autotest.tsapi.dao.IAPIResBodyDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIResBodyDaoImpl extends HibernateDaoSupport implements IAPIResBodyDao {
    @Override
    public APIResBody get(Long id) {
        return null;
    }

    @Override
    public Long save(APIResBody apiResBody) {
        return null;
    }

    @Override
    public void update(APIResBody apiResBody) {

    }

    @Override
    public void delete(APIResBody apiResBody) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<APIResBody> findAll() {
        return null;
    }

    @Override
    public List<APIResBody> findByAPI(API api) {
        return null;
    }

    @Override
    public List<APIResBody> findByAPIId(Long id) {
        return null;
    }

    @Override
    public APIResBody findUniqByAPI(API api) {
        return null;
    }

    @Override
    public APIResBody findUniqByAPIId(Long id) {
        return null;
    }
}
