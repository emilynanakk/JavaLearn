package com.java.testng;

import org.testng.annotations.Test;

/**
 * @author wunan
 * @date 2020/6/23 14:46
 **/
public class TimeOutTest {

    @Test(timeOut = 3000)   //单位是毫秒
    public void testSuccess() throws InterruptedException{
        Thread.sleep(2000);
    }

    @Test(timeOut = 2000)
    public void testFailed() throws InterruptedException{
        Thread.sleep(3000);
    }
}
