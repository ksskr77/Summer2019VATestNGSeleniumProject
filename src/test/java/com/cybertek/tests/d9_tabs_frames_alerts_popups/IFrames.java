package com.cybertek.tests.d9_tabs_frames_alerts_popups;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IFrames {
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
    public void test1(){
        driver.get("http://practice.cybertekschool.com/iframe");

        // switch to iframe
        // 1.  Using ID or NAME
        //switchTo().frame() ==> switch to frame
        driver.switchTo().frame("mce_0_ifr");
        driver.findElement(By.id("tinymce")).sendKeys("Hello");

        // go back to first frame
        // useful when we have switched multiple frames and want to come to main content
        driver.switchTo().defaultContent();

        // 2. INDEX
        driver.switchTo().frame(0);
        driver.findElement(By.id("tinymce")).sendKeys("Helloooooooo");

        // go back to parent frame
        driver.switchTo().parentFrame();

        // 3.  WebElement --> locate the iframe element and pass as argument
        WebElement frame = driver.findElement(By.tagName("iframe"));
        driver.switchTo().frame(frame);
        driver.findElement(By.id("tinymce")).sendKeys("Hiiiiiiiiii");
        driver.findElement(By.id("tinymce")).clear(); // delete text

    }

    @Test
    public void manyManyFrames(){
        driver.get("http://practice.cybertekschool.com/nested_frames");
        // top frame
        driver.switchTo().frame("frame-top");

        // switch to mid frame
        driver.switchTo().frame("frame-middle");

        // switch to right frame
        driver.switchTo().parentFrame().switchTo().frame("frame-right");

        // go back to original frame
        driver.switchTo().defaultContent();

    }


}