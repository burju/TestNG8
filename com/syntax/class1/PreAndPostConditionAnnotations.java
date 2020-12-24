package com.syntax.class1;

import org.testng.annotations.*;

public class PreAndPostConditionAnnotations {
    @Test
    public void testMethod()
    {
        System.out.println("I am a test method");
    }

    @BeforeMethod
    public void beforeMethod(){
        System.out.println("I am a before method");
    }

    @AfterMethod
    public void afterMethod(){
        System.out.println("I am an after method");
    }
}
