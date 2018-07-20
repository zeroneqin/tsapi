package com.qinjun.autotest.tsapi.util;

import org.hibernate.Session;
import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

public class DaoUtil extends HibernateDaoSupport {
    public void truncateTable(String table) {
        Session session = getSession();
        String sql = "truncate table "+table+" cascade";
        session.createSQLQuery(sql).executeUpdate();
        session.flush();
    }

    public void deleteTableByDesc(String table, String description) {
        Session session = getSession();
        String sql = "truncate table "+table+"  where description='"+description+"'";
        session.createSQLQuery(sql).executeUpdate();
        session.flush();
    }
}
