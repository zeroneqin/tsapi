package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.dao.IAPIDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIDaoImpl extends HibernateDaoSupport implements IAPIDao {
    @Override
    public API get(Long id) {
        return null;
    }

    @Override
    public Long save(API api) {
        return null;
    }

    @Override
    public void update(API api) {

    }

    @Override
    public void delete(API api) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<API> findAll() {
        return null;
    }
}
