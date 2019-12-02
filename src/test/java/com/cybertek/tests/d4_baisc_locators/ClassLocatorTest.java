package com.cybertek.tests.d4_baisc_locators;

import org.openqa.selenium.By;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ClassLocatorTest {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/sign_up");

        WebElement home = driver.findElement(By.className("nav-link"));
        home.click();

        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement title = driver.findElement(By.className("h3"));


        System.out.println(title.getText());


        // NEXT LINE WILL FAIL. It is supposed to fail
        // if class has a pace in it, we cannot use it

        WebElement button1 = driver.findElement(By.className("btn btn-primary"));












    }
}
