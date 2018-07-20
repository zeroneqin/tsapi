package com.qinjun.autotest.tsapi.dao.factory;

import com.qinjun.autotest.tsapi.dao.*;
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

    public static IAPIReqAuthDao getAPIReqAuthDao() {
        return (IAPIReqAuthDao) ctx.getBean("APIReqAuthDao");
    }


    public static IAPIReqBasicDao getAPIReqBasicDao() {
        return (IAPIReqBasicDao) ctx.getBean("APIReqBasicDao");
    }

    public static IAPIReqBodyDao getAPIReqBodyDao() {
        return (IAPIReqBodyDao) ctx.getBean("APIReqBodyDao");
    }

    public static IAPIReqHeaderDao getAPIReqHeaderDao() {
        return (IAPIReqHeaderDao) ctx.getBean("APIReqHeaderDao");
    }

    public static IAPIReqParamDao getAPIReqParamDao() {
        return (IAPIReqParamDao) ctx.getBean("APIReqParamDao");
    }

    public static IAPIResBasicDao getAPIResBasicDao() {
        return (IAPIResBasicDao) ctx.getBean("APIResBasicDao");
    }

    public static IAPIResBodyDao getAPIResBodyDao() {
        return (IAPIResBodyDao) ctx.getBean("APIResBodyDao");
    }

    public static ICaseDao getCaseDao(){
        return (ICaseDao) ctx.getBean("CaseDao");
    }

    public static IStepAPIBodyDao getStepAPIBodyDao() {
        return (IStepAPIBodyDao) ctx.getBean("StepAPIBodyDao");
    }

    public static IStepAPIParamDao getStepAPIParamDao() {
        return (IStepAPIParamDao) ctx.getBean("StepAPIParamDao");
    }

    public static IStepDao getStepDao() {
        return (IStepDao) ctx.getBean("StepDao");
    }

    public static IStepExpectDao getStepExpectDao() {
        return (IStepExpectDao) ctx.getBean("StepExpectDao");
    }

    public static ITestSetCaseDao getTestSetCaseDao() {
        return (ITestSetCaseDao) ctx.getBean("TestSetCaseDao");
    }

    public static ITestSetCaseRunDao getTestSetCaseRunDao() {
        return (ITestSetCaseRunDao) ctx.getBean("TestSetCaseRunDao");
    }

    public static ITestSetDao getTestSetDao() {
        return (ITestSetDao) ctx.getBean("TestSetDao");
    }

    public static ITestSetRunDao getTestSetRunDao() {
        return (ITestSetRunDao) ctx.getBean("TestSetRun");
    }

    public static ITestSetStepRunDao getTestSetStepRunDao() {
        return (ITestSetStepRunDao) ctx.getBean("TestSetStepRunDao");
    }
}
