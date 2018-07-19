package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.Project;

import java.util.List;

public interface IProjectDao {
    Project get(Long id);
    Long save(Project project);
    void update(Project project);
    void delete(Project project);
    void delete(Long id);

    List<Project> findAll();
}
