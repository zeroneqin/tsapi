package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqHeader;
import com.qinjun.autotest.tsapi.dao.IAPIReqHeaderDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIReqHeaderDaoImpl extends HibernateDaoSupport implements IAPIReqHeaderDao {

    @Override
    public APIReqHeader get(Long id) {
        return null;
    }

    @Override
    public Long save(APIReqHeader apiReqHeader) {
        return null;
    }

    @Override
    public void update(APIReqHeader apiReqHeader) {

    }

    @Override
    public void delete(APIReqHeader apiReqHeader) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<APIReqHeader> findAll() {
        return null;
    }

    @Override
    public List<APIReqHeader> findByAPI(API api) {
        return null;
    }

    @Override
    public List<APIReqHeader> findByAPIId(Long id) {
        return null;
    }

    @Override
    public APIReqHeader findUniqByAPI(API api) {
        return null;
    }

    @Override
    public APIReqHeader findUniqByAPIId(Long id) {
        return null;
    }
}
