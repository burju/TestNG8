package test;/*
1-Setup
2-login
3- close
 */

import org.testng.annotations.Test;

public class FirstTestCase {

    @Test(priority = 1)
    void setup(){
        System.out.println("Opening browser this is your test");
    }

    @Test(priority = 2)
    void login() {
        System.out.println("this is login test");
    }

    @Test(priority = 3)
    void close(){
        System.out.println("close browser");
    }

}
