package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIResHeader;

import java.util.List;

public interface IAPIResHeaderDao {
    APIResHeader get(Long id);
    Long save(APIResHeader apiResHeader);
    void update(APIResHeader apiResHeader);
    void delete(APIResHeader apiResHeader);
    void delete(Long id);

    List<APIResHeader> findAll();
    List<APIResHeader> findByAPI(API api);
    List<APIResHeader> findByAPIId(Long id);
    APIResHeader findUniqByAPI(API api);
    APIResHeader findUniqByAPIId(Long id);
}
