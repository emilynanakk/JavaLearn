package com.java.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

/**
 * @author wunan
 * @date 2020/6/22 17:20
 **/
public class GroupsOnMethod {

    //方法分组测试
    @Test(groups = "server")
    public void test1(){
        System.out.println("这是server组的测试方法1");
    }

    @Test(groups = "server")
    public void test2(){
        System.out.println("这是server组的测试方法2");
    }

    @Test(groups = "client")
    public void test3(){
        System.out.println("这是client组的测试方法3");
    }

    @Test(groups = "client")
    public void test4(){
        System.out.println("这是client组的测试方法4");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer(){
        System.out.println("这是server组运行之前运行的方法=========");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer(){
        System.out.println("这是server组运行之后运行的方法=========");
    }

    @BeforeGroups("client")
    public void beforeGroupsOnClient(){
        System.out.println("这是client组运行之前运行的方法=========");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient(){
        System.out.println("这是client组运行之后运行的方法=========");
    }
}
