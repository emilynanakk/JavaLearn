package com.java.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author wunan
 * @date 2020/6/23 11:39
 **/
public class MultiThreadOnAnnotion {

    //多线程测试-注解方式实现
    @Test(invocationCount = 10,threadPoolSize = 3)
    public void test(){
        System.out.println(1);
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
}
