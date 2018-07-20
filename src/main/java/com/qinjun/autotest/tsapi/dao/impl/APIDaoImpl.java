package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.dao.IAPIDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIDaoImpl extends HibernateDaoSupport implements IAPIDao {
    @Override
    public API get(Long id) {
        return getHibernateTemplate().get(API.class,id);
    }

    @Override
    public Long save(API api) {
        return (Long) getHibernateTemplate().save(api);
    }

    @Override
    public void update(API api) {
        getHibernateTemplate().update(api);
    }

    @Override
    public void delete(API api) {
        getHibernateTemplate().delete(api);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<API> findAll() {
        return (List<API>)getHibernateTemplate().find("from API");
    }
}
