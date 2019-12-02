package com.cybertek.tests.d8_List;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class SelectClassTest {

    @Test
    public void test1() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //Locate the element with the select tag
        WebElement element = driver.findElement(By.id("state"));

        // Create Select object by pass the element from step 2 as constructor
        Select stateList = new Select(element);

        //return available options from drop down
        List<WebElement> options = stateList.getOptions();

        for (WebElement option: options) {
            System.out.println(option.getText());
        }
    }

    @Test
    public void selectAndVerifySelected() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        //create a select object
        //1 locate the webelement with the select tag
        // create Select class object by passing that wenelement as a constructor

        Select stateList = new Select(driver.findElement(By.id("state")));
        // verify that by default Select a State selected
        //getFirstSelectedOption ==> returns what is currently selected, returns WEB ELEMENT
        //getFirstSelectedOption().getText(); ==> returns the text of selected element

        String actualSelection = stateList.getFirstSelectedOption().getText();
        System.out.println("actualSelection = "+actualSelection);

        Assert.assertEquals("Select a State", actualSelection);

        //Select
        Thread.sleep(1000);

        //SELECT USING VISIBLE TEXT
        //selectByValue() ==> selects using visible text
        stateList.selectByVisibleText("Virginia");
        actualSelection = stateList.getFirstSelectedOption().getText();


        Assert.assertEquals("Virginia", actualSelection);


        //Select Using Index
        //selectByIndex(); ==> select using the index number of the options
        stateList.selectByIndex(51);
        actualSelection = stateList.getFirstSelectedOption().getText();

        Assert.assertEquals("Wyoming", actualSelection);


        // Select By Value
        // selectByValue()==> selects by the value of the value attribute
        stateList.selectByValue("VA");
        actualSelection = stateList.getFirstSelectedOption().getText();

        Assert.assertEquals("Virginia", actualSelection);
    }
}
