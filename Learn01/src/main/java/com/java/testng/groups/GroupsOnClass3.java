package com.java.testng.groups;

import org.testng.annotations.Test;

/**
 * @author wunan
 * @date 2020/6/22 17:32
 **/

@Test(groups = "teacher")
public class GroupsOnClass3 {
    public void teacher1(){
        System.out.println("GroupsOnClass3中的方法teacher1运行");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass3中的方法teacher2运行");
    }
}
