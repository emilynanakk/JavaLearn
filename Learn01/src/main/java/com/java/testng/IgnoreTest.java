package com.java.testng;

import org.testng.annotations.Test;

/**
 * @author wunan
 * @date 2020/6/22 17:14
 **/
public class IgnoreTest {

    @Test
    public void ignore1(){
        System.out.println("ignore1 执行！");
    }

    //忽略测试
    @Test(enabled = false)
    public void ignore2(){
        System.out.println("ignore2 执行！");
    }
}
