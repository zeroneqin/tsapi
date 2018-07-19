package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.Step;
import com.qinjun.autotest.tsapi.bean.StepExpect;

import java.util.List;

public interface IStepExpectDao {
    StepExpect get(Long id);
    Long save(StepExpect stepExpect);
    void update(StepExpect stepExpect);
    void delete(StepExpect stepExpect);
    void delete(Long id);

    List<StepExpect> findAll();
    StepExpect findUniqByStep(Step step);
}
