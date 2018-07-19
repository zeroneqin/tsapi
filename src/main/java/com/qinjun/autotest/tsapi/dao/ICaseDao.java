package com.qinjun.autotest.tsapi.dao;

import com.qinjun.autotest.tsapi.bean.API;
import com.qinjun.autotest.tsapi.bean.Case;

import java.util.List;

public interface ICaseDao {
    Case get(Long id);
    Long save(Case cs);
    void update(Case cs);
    void delete(Case cs);
    void delete(Long id);

    List<Case> findAll();
}
