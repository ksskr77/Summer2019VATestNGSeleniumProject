package com.cybertek.tests.d12._review;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.cybertek.utilities.WebDriverFactory;
import org.testng.annotations.Test;

public class TestCase6Homework {

    WebDriver driver;

    @BeforeMethod
    public void setup(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
    }

    @Test
    public void test1(){
        // go to google 1st time
        WebElement input = driver.findElement(By.name("q"));
        input.sendKeys("Yoonjin Im"+ Keys.ENTER);
        Assert.assertTrue(driver.findElement(By.id("resultStats")).isDisplayed());

        // go to google 2nd time
        driver.navigate().back();
        input = driver.findElement(By.name("q"));
        input.sendKeys("Yerim Jeong"+Keys.ENTER);
    }


    @AfterMethod
    public void teardown() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

}
