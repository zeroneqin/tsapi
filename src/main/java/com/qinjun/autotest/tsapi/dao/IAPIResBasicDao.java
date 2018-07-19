package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIResBasic;

import java.util.List;

public interface IAPIResBasicDao {
    APIResBasic get(Long id);
    Long save(APIResBasic apiResBasic);
    void update(APIResBasic apiResBasic);
    void delete(APIResBasic apiResBasic);
    void delete(Long id);

    List<APIResBasic> findAll();
    List<APIResBasic> findByAPI(API api);
    List<APIResBasic> findByAPIId(Long id);
    APIResBasic findUniqByAPI(API api);
    APIResBasic findUniqByAPIId(Long id);
}
