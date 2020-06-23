package com.java.testng;

import org.testng.annotations.Test;

/**
 * @author wunan
 * @date 2020/6/22 17:44
 **/
public class ExpectedException {
    /**
     * 异常测试使用场景：在我们期望结果为某一个异常的时候
     * 比如：传入某些不合法的参数，程序抛出异常；一般用于异常用例
     */

    //这是一个测试结果会失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试case");
    }

    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionSuccess(){
        System.out.println("抛异常获取到了");
        throw new RuntimeException();
    }
}
