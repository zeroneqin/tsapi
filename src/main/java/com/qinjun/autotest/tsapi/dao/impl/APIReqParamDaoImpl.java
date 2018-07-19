package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqParam;
import com.qinjun.autotest.tsapi.dao.IAPIReqParamDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIReqParamDaoImpl extends HibernateDaoSupport implements IAPIReqParamDao {
    @Override
    public APIReqParam get(Long id) {
        return null;
    }

    @Override
    public Long save(APIReqParam apiReqParam) {
        return null;
    }

    @Override
    public void update(APIReqParam apiReqParam) {

    }

    @Override
    public void delete(APIReqParam apiReqParam) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<APIReqParam> findAll() {
        return null;
    }

    @Override
    public List<APIReqParam> findByAPI(API api) {
        return null;
    }

    @Override
    public List<APIReqParam> findByAPIId(Long id) {
        return null;
    }

    @Override
    public APIReqParam findUniqByAPI(API api) {
        return null;
    }

    @Override
    public APIReqParam findUniqByAPIId(Long id) {
        return null;
    }
}
