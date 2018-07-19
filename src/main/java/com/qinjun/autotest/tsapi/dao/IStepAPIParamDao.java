package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.Step;
import com.qinjun.autotest.tsapi.bean.StepAPIParam;

import java.util.List;

public interface IStepAPIParamDao {
    StepAPIParam get(Long id);
    Long save(StepAPIParam stepAPIParam);
    void update(StepAPIParam stepAPIParam);
    void delete(StepAPIParam stepAPIParam);
    void delete(Long id);

    List<StepAPIParam> findAll();
    List<StepAPIParam> findByStep(Step step);

}
