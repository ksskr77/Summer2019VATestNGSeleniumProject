package com.cybertek.tests.d7_typesOf_Elements;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DisplayedTest {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dynamic_loading/1");

        //verify element is displayed

        WebElement home = driver.findElement(By.linkText("Home"));
        Assert.assertTrue(home.isDisplayed());

        // verifying element not displayed
        WebElement blue = driver.findElement(By.id("username"));

        //verify if element displayed on screen, verify if visible
        Assert.assertTrue(blue.isDisplayed());


    }
}
