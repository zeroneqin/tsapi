package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqBody;

import java.util.List;

public interface IAPIReqBodyDao {
    APIReqBody get(Long id);
    Long save(APIReqBody apiReqBody);
    void update(APIReqBody apiReqBody);
    void delete(APIReqBody apiReqBody);
    void delete(Long id);
    List<APIReqBody> findAll();
    List<APIReqBody> findByAPI(API api);
    List<APIReqBody> findByAPIId(Long id);
    APIReqBody findUniqByAPI(API api);
    APIReqBody findUniqByAPIId(Long id);
}
