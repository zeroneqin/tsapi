package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.Project;
import com.qinjun.autotest.tsapi.dao.IProjectDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class ProjectDaoImpl extends HibernateDaoSupport implements IProjectDao {
    @Override
    public Project get(Long id) {
        return getHibernateTemplate().get(Project.class,id);
    }

    @Override
    public Long save(Project cs) {
        return (Long)  getHibernateTemplate().save(cs);
    }

    @Override
    public void update(Project cs) {
        getHibernateTemplate().update(cs);
    }

    @Override
    public void delete(Project cs) {
        getHibernateTemplate().delete(cs);
    }

    @Override
    public void delete(Long id) {
        getHibernateTemplate().delete(get(id));
    }

    @Override
    public List<Project> findAll() {
        return (List<Project>) getHibernateTemplate().find("from Project");
    }
}
