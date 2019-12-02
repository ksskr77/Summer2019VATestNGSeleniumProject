package com.cybertek.tests.d3_webelement_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebElement;

/**
 pen browser
 go to http://practice.cybertekschool.com/forgot_password
 enter any email
 click on Retrieve password
 verify that url changed to http://practice.cybertekschool.com/email_sent
 */
public class VerifyURLChanged {
    public static void main(String[] args) {


        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");
        // enter any email

        WebElement emailInput = driver.findElement(By.name("email"));

        // sendKeys --> enters given text
        emailInput.sendKeys("fwefsf@email.com");

        WebElement retrievePassword = driver.findElement(By.id("format_submit"));
        retrievePassword.click();

        String expected = "http://practice.cybertekschool.com/email_sent";
        String actual = driver.getCurrentUrl();

        if(expected.equals(actual)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

        driver.close();

    }
}
