package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIResHeader;
import com.qinjun.autotest.tsapi.dao.IAPIResHeaderDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIResHeaderDaoImpl extends HibernateDaoSupport implements IAPIResHeaderDao {
    @Override
    public APIResHeader get(Long id) {
        return null;
    }

    @Override
    public Long save(APIResHeader apiResHeader) {
        return null;
    }

    @Override
    public void update(APIResHeader apiResHeader) {

    }

    @Override
    public void delete(APIResHeader apiResHeader) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<APIResHeader> findAll() {
        return null;
    }

    @Override
    public List<APIResHeader> findByAPI(API api) {
        return null;
    }

    @Override
    public List<APIResHeader> findByAPIId(Long id) {
        return null;
    }

    @Override
    public APIResHeader findUniqByAPI(API api) {
        return null;
    }

    @Override
    public APIResHeader findUniqByAPIId(Long id) {
        return null;
    }
}
