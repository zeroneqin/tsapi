package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIResBasic;
import com.qinjun.autotest.tsapi.dao.IAPIResBasicDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIResBasicDaoImpl extends HibernateDaoSupport implements IAPIResBasicDao {
    @Override
    public APIResBasic get(Long id) {
        return null;
    }

    @Override
    public Long save(APIResBasic apiResBasic) {
        return null;
    }

    @Override
    public void update(APIResBasic apiResBasic) {

    }

    @Override
    public void delete(APIResBasic apiResBasic) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<APIResBasic> findAll() {
        return null;
    }

    @Override
    public List<APIResBasic> findByAPI(API api) {
        return null;
    }

    @Override
    public List<APIResBasic> findByAPIId(Long id) {
        return null;
    }

    @Override
    public APIResBasic findUniqByAPI(API api) {
        return null;
    }

    @Override
    public APIResBasic findUniqByAPIId(Long id) {
        return null;
    }
}
