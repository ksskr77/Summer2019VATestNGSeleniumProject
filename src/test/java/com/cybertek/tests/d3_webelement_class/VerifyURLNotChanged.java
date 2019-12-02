package com.cybertek.tests.d3_webelement_class;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebElement;

/**
 open browser
 go to http://practice.cybertekschool.com/forgot_password
 click on Retrieve password
 verify that url did not change
 */
public class VerifyURLNotChanged {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.navigate().to("http://practice.cybertekschool.com/forgot_password");

        // save the expected URL

        String expectedUrl = driver.getCurrentUrl();

        //  click on Retrieve password
// Webelement --> class that represents elements from the web page
        //findElement --> method used to find element on a page
        //return a webelement

        WebElement retrievePassword = driver.findElement(By.id("form_submit"));

        //click --> click element
        retrievePassword.click();

//        verify that url did not change
        String actualUrl = driver.getCurrentUrl();

        if (actualUrl.equals(expectedUrl)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }

    }
}
