package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.Step;
import com.qinjun.autotest.tsapi.bean.StepAPIBody;

import java.util.List;

public interface IStepAPIBodyDao {
    StepAPIBody get(Long id);
    Long save(StepAPIBody stepAPIBody);
    void update(StepAPIBody stepAPIBody);
    void delete(StepAPIBody stepAPIBody);
    void delete(Long id);

    List<StepAPIBody> findAll();
    List<StepAPIBody> findByStep(Step step);
    StepAPIBody findUniqByStep(Step step);
}
