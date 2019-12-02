package com.cybertek.tests.d12._review;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;

public class HoverTest {

    // create new variable
    // to open browser
    WebDriver driver;
    Actions actions;

    @BeforeMethod
    public void setupMethod(){
        driver = WebDriverFactory.getDriver("chrome");
        actions = new Actions(driver);
        driver.get("http://practice.cybertekschool.com/hovers");
    }

    @AfterMethod
    public void teardownMethod() throws InterruptedException {
        Thread.sleep(2000);
        driver.quit();
    }

    @Test
    public void Test(){
        //find all images outside the loop
        List<WebElement> images = driver.findElements(By.tagName("img"));
        // hover to each image
        // verify text user1, user2, and user3
        for (int i = 0; i < 3; i++) {
            // hover to each image
            // verify text user1, user2, and user3
            System.out.println(i);

            WebElement image = images.get(i);

            actions.moveToElement(image).perform();


            // this is like calling Thread.sleep
            actions.pause(2000);
            String xpath = "//h5[.='name: user"+(i+1)+"']";
            //h5[.='name: user1']
            //h5[.='name: user2']
            //h5[.='name: user3']
            WebElement text1 = driver.findElement(By.xpath(xpath));
            System.out.println("Verify element: "+i);
            Assert.assertTrue(text1.isDisplayed());



        }

    }



}
