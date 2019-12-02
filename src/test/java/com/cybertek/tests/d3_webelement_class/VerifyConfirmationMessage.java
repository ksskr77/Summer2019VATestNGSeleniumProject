package com.cybertek.tests.d3_webelement_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
open browser
go to http://practice.cybertekschool.com/forgot_password
enter any email
click on Retrieve password
verify that url changed to http://practice.cybertekschool.com/email_sent
 */
public class VerifyConfirmationMessage {

    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("http://practice.cybertekschool.com/forgot_password");
        // enter any email

        WebElement emailInput = driver.findElement(By.name("email"));

        // sendKeys --> enters given text

        String expectedEmail = "ksskr77@hanmail.net";
        emailInput.sendKeys(expectedEmail);

        // verify that email is displayed in the input box
        //getAttribute --> get text from input box
        String actualEmail = emailInput.getAttribute("value");

        if (actualEmail.equals(expectedEmail)){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
            System.out.println("expectedEmail = " + expectedEmail);
            System.out.println("actualEmail = " + actualEmail);
        }

        WebElement retrievePassword = driver.findElement(By.id("form_submit"));
        retrievePassword.click();


        String expectedMessage = "Your e-mail's been sent!";
        WebElement messageElement = driver.findElement(By.name("confirmation_message"));

        String actualMessage =  messageElement.getText();
        if (expectedMessage.equals(actualMessage)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
            System.out.println("expectedMessage = " + expectedMessage);
            System.out.println("actualMessage = " + actualMessage);
        }





    }
}
