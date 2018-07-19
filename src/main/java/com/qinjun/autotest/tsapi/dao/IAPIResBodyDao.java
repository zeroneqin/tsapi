package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIResBody;

import java.util.List;

public interface IAPIResBodyDao {
    APIResBody get(Long id);
    Long save(APIResBody apiResBody);
    void update(APIResBody apiResBody);
    void delete(APIResBody apiResBody);
    void delete(Long id);

    List<APIResBody> findAll();
    List<APIResBody> findByAPI(API api);
    List<APIResBody> findByAPIId(Long id);
    APIResBody findUniqByAPI(API api);
    APIResBody findUniqByAPIId(Long id);
}
