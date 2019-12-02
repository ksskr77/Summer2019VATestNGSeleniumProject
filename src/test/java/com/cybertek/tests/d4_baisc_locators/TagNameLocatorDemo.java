package com.cybertek.tests.d4_baisc_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebElement;

public class TagNameLocatorDemo {

    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.tagName("input"));
        fullName.sendKeys("Yoonjin Im");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("MissYi@gmail.com");

        WebElement button = driver.findElement(By.tagName("button"));
        button.click();


    }
}
