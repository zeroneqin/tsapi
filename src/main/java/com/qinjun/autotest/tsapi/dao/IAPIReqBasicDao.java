package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqBasic;
import com.qinjun.autotest.tsapi.bean.APIReqBody;

import java.util.List;

public interface IAPIReqBasicDao {
    APIReqBasic get(Long id);
    Long save(APIReqBasic apiReqBasic);
    void update(APIReqBasic apiReqBasic);
    void delete(APIReqBasic apiReqBasic);
    void delete(Long id);
    List<APIReqBasic> findAll();
    List<APIReqBasic> findByAPI(API api);
    List<APIReqBasic> findByAPIId(Long id);
    APIReqBasic findUniqByAPI(API api);
    APIReqBasic findUidByAPIId(Long id);
}
