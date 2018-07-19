package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqParam;

import java.util.List;

public interface IAPIReqParamDao {
    APIReqParam get(Long id);
    Long save(APIReqParam apiReqParam);
    void update(APIReqParam apiReqParam);
    void delete(APIReqParam apiReqParam);
    void delete(Long id);

    List<APIReqParam> findAll();
    List<APIReqParam> findByAPI(API api);
    List<APIReqParam> findByAPIId(Long id);
    APIReqParam findUniqByAPI(API api);
    APIReqParam findUniqByAPIId(Long id);
}
