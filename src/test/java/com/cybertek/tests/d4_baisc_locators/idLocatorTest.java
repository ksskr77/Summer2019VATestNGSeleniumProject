package com.cybertek.tests.d4_baisc_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebElement;

public class idLocatorTest {
    public static void main(String[] args) {
        WebDriver driver =  WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement button3 = driver.findElement(By.id("disappearing_button"));

        String txt = button3.getText();
        System.out.println("txt = " + txt);
        button3.click();


    }
}
