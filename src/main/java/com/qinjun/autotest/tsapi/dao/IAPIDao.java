package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.Project;

import java.util.List;

public interface IAPIDao {
    API get(Long id);
    Long save(API api);
    void update(API api);
    void delete(API api);
    void delete(Long id);
    List<API> findAll();

}
