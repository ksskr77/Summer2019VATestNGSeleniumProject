package com.cybertek.tests.d11_file_Upload_actions_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class JavascriptExcutorTest {
    WebDriver driver;


    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");

    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void click(){

        driver.get("https://practice-cybertekschool.herokuapp.com/");
        WebElement element = driver.findElement(By.linkText("Home"));
        // this is how the JavascriptExecutor object is created
        JavascriptExecutor jse = (JavascriptExecutor) driver;
        // executeScript ==> method used to pass js command
        // first string argument is the javascript code
        // second string argument is the web-element on which the action will be take
        jse.executeScript("arguments[0].click();", element);

    }

    @Test
    public void type(){
        driver.get("https://practice-cybertekschool.herokuapp.com/dynamic_controls");
        WebElement element = driver.findElement(By.cssSelector("input[disabled]"));
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        String str = "Hello";
        jse.executeScript("arguments[0].setAttribute('value','"+str+"')", element);
    }

    @Test
    public void scroll() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com/infinite_scroll");
        JavascriptExecutor jse = (JavascriptExecutor)driver;

        for(int i=0; i<5; i++) {

            Thread.sleep(1000);

            jse.executeScript("scroll(0,2550);");
        }
    }






}
