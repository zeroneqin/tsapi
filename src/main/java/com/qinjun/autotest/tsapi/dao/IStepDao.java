package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.Case;
import com.qinjun.autotest.tsapi.bean.Step;

import java.util.List;

public interface IStepDao   {
    Step get(Long id);
    Long save(Step step);
    void update(Step step);
    void delete(Step step);
    void delete(Long id);

    List<Step> findAll();
    List<Step> findByAPI(API api);
    List<Step> findByAPIId(Long id);
    Step findUniqByAPI(API api);
    Step findUniqByAPIId(Long id);

    List<Step> findByCase(Case cs);
    List<Step> findByCaseId(Long id);
    Step findUniqByCase(Case cs);
    Step findUniqByCaseId(Long id);
}
