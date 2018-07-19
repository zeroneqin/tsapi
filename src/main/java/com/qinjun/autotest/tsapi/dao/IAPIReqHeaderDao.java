package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqHeader;

import java.util.List;

public interface IAPIReqHeaderDao {
    APIReqHeader get(Long id);
    Long save(APIReqHeader apiReqHeader);
    void update(APIReqHeader apiReqHeader);
    void delete(APIReqHeader apiReqHeader);
    void delete(Long id);
    List<APIReqHeader> findAll();
    List<APIReqHeader> findByAPI(API api);
    List<APIReqHeader> findByAPIId(Long id);
    APIReqHeader findUniqByAPI(API api);
    APIReqHeader findUniqByAPIId(Long id);

}
