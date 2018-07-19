package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.Project;
import com.qinjun.autotest.tsapi.dao.IProjectDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class ProjectDaoImpl extends HibernateDaoSupport implements IProjectDao {
    @Override
    public Project get(Long id) {
        return null;
    }

    @Override
    public Long save(Project project) {
        return null;
    }

    @Override
    public void update(Project project) {

    }

    @Override
    public void delete(Project project) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Project> findAll() {
        return null;
    }
}
