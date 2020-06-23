package com.java.testng;

import org.testng.annotations.Test;

/**
 * @author wunan
 * @date 2020/6/23 10:46
 **/
public class DependTest {
    //依赖测试，先执行test1，再执行test2；若test1抛出异常，test2会被ignore
    @Test
    public void test1(){
        System.out.println("test1 run");
        throw new RuntimeException();
    }

    @Test(dependsOnMethods = {"test1"})
    public void test2(){
        System.out.println("test2 run");
    }
}
