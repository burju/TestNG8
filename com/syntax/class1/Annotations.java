package com.syntax.class1;

import org.testng.annotations.*;

public class Annotations {

    @Test
    public void test1(){
        System.out.println("first test");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("this will be executed before class starts");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("this will be executed after class");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("this will be executed before every Test method starts");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("this will be executed after every Test method executed");
    }
}
