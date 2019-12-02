package com.cybertek.tests.d5_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebElement;

public class XpathTestDemoClass {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        WebElement link = driver.findElement(By.xpath("/html/body/nav/ul/li/a"));
        WebElement link2 = driver.findElement(By.xpath("//button[@onclick='button1()']"));

        System.out.println(link2.getText());
        System.out.println(link.getText());
    }
}
