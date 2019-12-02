package com.cybertek.tests.d7_typesOf_Elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import com.cybertek.utilities.WebDriverFactory;

public class CheckBoxTest {

    @Test
    public void test1(){
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/checkboxes");

        WebElement one = driver.findElement(By.xpath("//input[1]"));
        WebElement two = driver.findElement(By.xpath("//input[2]"));

        System.out.println("One is selected: "+ one.isSelected());
        System.out.println("two is selected: "+ two.isSelected());

        //verify one is NOT selected
        Assert.assertFalse(one.isSelected());

        //verify two is selected
        Assert.assertTrue(two.isSelected());


        System.out.println("check the first one");
        one.click();

        System.out.println("One is selected: "+ one.isSelected());
        System.out.println("two is selected: "+ two.isSelected());

        // verify that one is selected
        Assert.assertTrue(one.isSelected());

        // verify that two is selected
        Assert.assertTrue(two.isSelected());

        System.out.println("uncheck the first one");
        one.click();

        System.out.println("One is selected: "+ one.isSelected());
        System.out.println("two is selected: "+ two.isSelected());

        //verify that one is NOT selected
        Assert.assertFalse(one.isSelected());

        //verify that two is selected
        Assert.assertTrue(two.isSelected());
    }
}
