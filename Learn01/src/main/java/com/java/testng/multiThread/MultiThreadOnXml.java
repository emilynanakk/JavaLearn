package com.java.testng.multiThread;

import org.testng.annotations.Test;

/**
 * @author wunan
 * @date 2020/6/23 11:50
 **/
public class MultiThreadOnXml {

    @Test
    public void test1(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test2(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }

    @Test
    public void test3(){
        System.out.printf("Thread Id: %s%n",Thread.currentThread().getId());
    }
}
