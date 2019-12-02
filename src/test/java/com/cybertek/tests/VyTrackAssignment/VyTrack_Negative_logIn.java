package com.cybertek.tests.VyTrackAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebElement;

public class VyTrack_Negative_logIn {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");

        WebElement userName = driver.findElement(By.xpath("//*[@id=\"prependedInput\"]"));

        String actualEmail = "fwfwefw";
        userName.sendKeys(actualEmail);

        WebElement password = driver.findElement(By.xpath("//*[@id=\"prependedInput2\"]"));

        String actualPassword = "efwfwe";
        password.sendKeys(actualPassword);

        WebElement login = driver.findElement(By.id("_submit"));
        login.click();

        WebElement errorMessage = driver.findElement(By.xpath("//*[@id=\"login-form\"]/fieldset/div[1]/div"));
        String error = errorMessage.getText();

        if(error.equals("Invalid user name or password.")){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


    }
}
