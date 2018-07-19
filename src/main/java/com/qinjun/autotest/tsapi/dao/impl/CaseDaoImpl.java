package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.Case;
import com.qinjun.autotest.tsapi.dao.ICaseDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class CaseDaoImpl extends HibernateDaoSupport implements ICaseDao {
    @Override
    public Case get(Long id) {
        return null;
    }

    @Override
    public Long save(Case cs) {
        return null;
    }

    @Override
    public void update(Case cs) {

    }

    @Override
    public void delete(Case cs) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Case> findAll() {
        return null;
    }
}
