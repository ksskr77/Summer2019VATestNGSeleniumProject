package com.cybertek.tests.d8_List;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class ListOfElement {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> button = driver.findElements(By.tagName("button"));

        System.out.println(button.size());

        Assert.assertEquals(button.size(),6);

        // we are iterating through the list of elements
        // print the text of each element
        for (WebElement buttons: button) {
            System.out.println(buttons.getText());
        }


    }

    @Test
    public void test2(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/multiple_buttons");

        List<WebElement> button = driver.findElements(By.tagName("utton"));
        System.out.println(button.size());

    }
}
