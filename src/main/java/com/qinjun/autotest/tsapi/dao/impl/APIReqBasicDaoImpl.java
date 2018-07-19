package com.qinjun.autotest.tsapi.dao.impl;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.APIReqBasic;
import com.qinjun.autotest.tsapi.dao.IAPIReqBasicDao;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import java.util.List;

public class APIReqBasicDaoImpl extends HibernateDaoSupport implements IAPIReqBasicDao {
    @Override
    public APIReqBasic get(Long id) {
        return null;
    }

    @Override
    public Long save(APIReqBasic apiReqBasic) {
        return null;
    }

    @Override
    public void update(APIReqBasic apiReqBasic) {

    }

    @Override
    public void delete(APIReqBasic apiReqBasic) {

    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<APIReqBasic> findAll() {
        return null;
    }

    @Override
    public List<APIReqBasic> findByAPI(API api) {
        return null;
    }

    @Override
    public List<APIReqBasic> findByAPIId(Long id) {
        return null;
    }

    @Override
    public APIReqBasic findUniqByAPI(API api) {
        return null;
    }

    @Override
    public APIReqBasic findUidByAPIId(Long id) {
        return null;
    }
}
