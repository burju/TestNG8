package com.syntax.class1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void openAndNavigate(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\rucha\\eclipse-workspace\\TestNG_Batch8\\drivers\\chromedriver.exe" );
        //setting prerequisites before real tests:
        driver= new ChromeDriver();
        String url= "http://hrmstest.syntaxtechs.net/humanresources/symfony/web/index.php/auth/login";
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
    }

    @Test
    public void test1(){
        driver.findElement(By.id("txtUsername")).sendKeys("Admin");
        driver.findElement(By.id("txtPassword")).sendKeys("Hum@nhrm123");
        driver.findElement(By.id("btnLogin")).click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebElement welcomeMessage= driver.findElement(By.xpath("//h1[text()= 'Dashboard']"));
        if( welcomeMessage.isDisplayed()){
            System.out.println("user name and password entered, loggoed in sucessfully");
        }
        else {
            System.out.println("login failed");
        }

    }

    @Test
    //verify that the HRM title is" Human Management System"
    public void test2(){
        String expectedTitle="Human Management System";
        String actualTitle= driver.getTitle();
        if( expectedTitle.equals(actualTitle)){
            System.out.println("Test passed. Title is displayed as expected");
        }
        else {
            System.out.println("Test2 failed. Title is not as expected.");
        }
    }

    @Test
    //very the syntax logo is displayed
    public void test3(){
        if( driver.findElement(By.cssSelector("img[src]")).isDisplayed()){
            System.out.println("Logo displayed.Test passed.");
        }
        else{
            System.out.println("Logo is not present. Test Failed.");
        }
    }
    @AfterMethod
    public void closeBrowser(){
        driver.quit();
    }


}
