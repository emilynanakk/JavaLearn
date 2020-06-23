package com.java.testng.suite;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

/**
 * @author wunan
 * @date 2020/6/22 16:44
 **/
public class SuiteConfig {

    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before suite运行辣");
    }

    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite运行辣");
    }
}
