package com.cybertek.tests.VyTrackAssignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebElement;

public class VyTrack {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://qa2.vytrack.com/user/login");
//====================================================================================
        WebElement userName = driver.findElement(By.name("_username"));

        String expectedUserName = "storemanager73";
        userName.sendKeys(expectedUserName);
        String actualEmail = userName.getAttribute("value");
//====================================================================================
        WebElement passWord = driver.findElement(By.name("_password"));

        String expectedPassword = "UserUser123";
        passWord.sendKeys(expectedPassword);
        String actualPassword = passWord.getAttribute("value");
//====================================================================================
        WebElement login = driver.findElement(By.id("_submit"));
        login.click();
//====================================================================================
        String checkTitle = "Dashboard";
        String CurrentTitle = driver.getTitle();

        if(checkTitle.equals(CurrentTitle)){
            System.out.println("PASS");
        }else{
            System.out.println("FAIL");
        }


    }
}
