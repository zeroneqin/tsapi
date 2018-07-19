package com.qinjun.autotest.tsapi.dao.factory;

import com.qinjun.autotest.tsapi.dao.IAPIDao;
import com.qinjun.autotest.tsapi.dao.IProjectDao;
import com.qinjun.autotest.tsapi.util.DaoUtil;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DaoFactory {
    static ApplicationContext ctx;
    static {
        ctx = new ClassPathXmlApplicationContext("ApplicationContext.xml");
    }

    public static DaoUtil getDaoUtil() {
        return (DaoUtil) ctx.getBean("DaoUtil");
    }

    public static IProjectDao getProjectDao() {
        return (IProjectDao) ctx.getBean("ProjectDao");
    }

    public static IAPIDao getAPIDao() {
        return (IAPIDao) ctx.getBean("APIDao");
    }



}
