package com.cybertek.tests.d4_baisc_locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebElement;

public class NameLocatorTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement fullName = driver.findElement(By.name("full_name"));
        fullName.sendKeys("Sunsoo Kim");

        WebElement email = driver.findElement(By.name("email"));
        email.sendKeys("missYoonjin@gmail.com");

        WebElement signUp = driver.findElement(By.name("wooden_spoon"));
        signUp.click();

    }
}
