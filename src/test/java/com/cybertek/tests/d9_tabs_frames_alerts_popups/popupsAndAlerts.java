package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import com.cybertek.utilities.WebDriverFactory;

public class popupsAndAlerts {
    WebDriver driver;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");


    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(3000);
        driver.quit();
    }

    @Test
    public void htmlPopups(){
        driver.get("https://www.primefaces.org/showcase/ui/overlay/confirmDialog.xhtml");
        driver.findElement(By.xpath("//span[.='Destroy the World']")).click();
        driver.findElement(By.xpath("//span[.='Yes']")).click();


    }

    @Test
    public void jsAlerts(){
        driver.get("http://practice.cybertekschool.com/javascript_alerts");
        // trigger the alerts
        driver.findElement(By.xpath("//button[1]")).click();
        // accept alerts
        Alert alert = driver.switchTo().alert();
        // accept alert
        alert.accept();


        // trigger the second alert
        driver.findElement(By.xpath("//button[2]")).click();
        // switch to the new alert
        alert = driver.switchTo().alert();
        // dismiss --> clicking x to close, or selecting no or cancel
        alert.dismiss();


        // trigger for third alert
        driver.findElement(By.xpath("//button[3]")).click();
        // switch to the new alert
        alert = driver.switchTo().alert();
        //send keys to alert
        alert.sendKeys("red alert");
        // print text of the alert
        System.out.println(alert.getText());
        // dismiss the alert
        alert.accept();

    }



}
