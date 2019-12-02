package com.cybertek.tests.d11_file_Upload_actions_class;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ActionsExampleTest {
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

    // https://practice-cybertekschool.herokuapp.com/hovers
    //

    @Test
    public void test() throws InterruptedException {
        driver.get("https://practice-cybertekschool.herokuapp.com/hovers");

        WebElement img1 = driver.findElement(By.tagName("img"));

        // Actions ==> class that contains all the user interactions
        Actions actions = new Actions(driver);
        Thread.sleep(2000);
        // moveToElement() --> moves the mouse on top of the given element
        // perform() ==> complete the action
        actions.moveToElement(img1).perform();

        Assert.assertTrue(driver.findElement(By.linkText("View profile")).isDisplayed());

    }
    @Test
    public void dragAndDrop() throws InterruptedException {
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        // source --> we will drag this element
        WebElement source = driver.findElement(By.id("draggable"));
        // target --> we drop here
        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);

        Thread.sleep(1000);

        // dragAndDrop --> drags the source to target
        actions.dragAndDrop(source, target).perform();

    }

    @Test
    public void dragAdnDropByChainingTest(){
        driver.get("https://demos.telerik.com/kendo-ui/dragdrop/index");
        // source --> we will drag this element
        WebElement source = driver.findElement(By.id("draggable"));
        // target --> we drop here
        WebElement target = driver.findElement(By.id("droptarget"));

        Actions actions = new Actions(driver);

        actions.moveToElement(source).clickAndHold().moveToElement(target).release().perform();

    }
}
