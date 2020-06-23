package com.java.testng.paramter;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

/**
 * @author wunan
 * @date 2020/6/23 10:52
 **/
public class ParamterTest {
    @Test
    @Parameters({"name","age"})
    public void paramterTest1(String name,int age){
        System.out.println("name = " + name + "; age = " + age);
    }
}
