package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.Case;
import com.qinjun.autotest.tsapi.dao.ICaseDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class CaseDaoImpl extends HibernateDaoSupport implements ICaseDao {
    @Override
    public Case get(Long id) {
        return getHibernateTemplate().get(Case.class,id);
    }

    @Override
    public Long save(Case cs) {
        return (Long)  getHibernateTemplate().save(cs);
    }

    @Override
    public void update(Case cs) {
        getHibernateTemplate().update(cs);
    }

    @Override
    public void delete(Case cs) {
        getHibernateTemplate().delete(cs);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<Case> findAll() {
        return (List<Case>) getHibernateTemplate().find("from Case");
    }


}
