package com.cybertek.tests.d10_synchronization;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitTests {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void test1(){
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        // click on start
        driver.findElement(By.tagName("button")).click();
        // enter username
        WebElement username = driver.findElement(By.id("username"));

        // Create explicit wait object
        WebDriverWait wait  = new WebDriverWait(driver, 10);

        // actually
        wait.until(ExpectedConditions.visibilityOf(username));

        // click on the element that is visible
        username.sendKeys("Yoonjin");
    }

    @Test
    public void test2(){
        driver.get("http://practice.cybertekschool.com/dynamic_controls");
        // click enable
        driver.findElement(By.xpath("//*[@id=\"input-example\"]/button")).click();
        // find input field
        WebElement username = driver.findElement(By.xpath("//*[@id=\"input-example\"]/input"));

        WebDriverWait wait = new WebDriverWait(driver, 9);

        // wait for element to be clickable/ enabled
        wait.until(ExpectedConditions.elementToBeClickable(username));

        username.sendKeys("Yoonjin");
    }










}
