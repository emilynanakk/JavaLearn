package com.java.testng.groups;

import org.testng.annotations.Test;

/**
 * @author wunan
 * @date 2020/6/22 17:32
 **/

@Test(groups = "stu")
public class GroupsOnClass1 {
    public void stu1(){
        System.out.println("GroupsOnClass1中的stu1方法运行");
    }

    public void stu2(){
        System.out.println("GroupsOnClass1中的stu2方法运行");
    }
}
