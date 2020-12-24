package com.syntax.class1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumTest {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rucha\\eclipse-workspace\\TestNG_Batch8\\drivers\\chromedriver.exe");
        WebDriver driver= new ChromeDriver();
        String url= "http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        driver.get(url);
    }
}
