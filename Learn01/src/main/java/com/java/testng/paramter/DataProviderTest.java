package com.java.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

/**
 * @author wunan
 * @date 2020/6/23 11:23
 **/
public class DataProviderTest {

    @Test(dataProvider = "data")
    public void testDataProvider(String name, int age) {
        System.out.println("name = " + name + ";  age = " + age);
    }

    @DataProvider(name = "data")
    public Object[][] providerData() {
        Object[][] o = new Object[][]{
                {"red", 8},
                {"black", 9},
                {"pink", 10}
        };
        return o;
    }

    @Test(dataProvider = "methodData")
    public void test1(String name, int age) {
        System.out.println("test1方法 name = " + name + " ;  age = " + age);
    }

    @Test(dataProvider = "methodData")
    public void test2(String name, int age) {
        System.out.println("test2方法 name = " + name + " ;  age = " + age);
    }

    @DataProvider(name = "methodData")
    public Object[][] methodDataTest(Method method){
        Object[][] result = null;
        if(method.getName().equals("test1")){
            result = new Object[][]{
                    {"yellow",11},
                    {"blue",12}
            };
        }else if (method.getName().equals("test2")){
            result = new Object[][]{
                    {"green",13},
                    {"purple",14}
            };
        }
        return result;
    }
}
