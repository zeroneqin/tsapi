package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqAuth;

import java.util.List;

public interface IAPIReqAuthDao {
    APIReqAuth get(Long id);
    Long save(APIReqAuth apiReqAuth);
    void update(APIReqAuth apiReqAuth);
    void delete(APIReqAuth apiReqAuth);
    void delete(Long id);
    List<APIReqAuth> findAll();
    List<APIReqAuth> findByAPI(API api);
    List<APIReqAuth> findByAPIId(Long id);

}
