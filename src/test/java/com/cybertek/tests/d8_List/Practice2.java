package com.cybertek.tests.d8_List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import com.cybertek.utilities.WebDriverFactory;

import java.util.List;

public class Practice2 {


    @Test
    public void Test1(){

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        Select states = new Select(driver.findElement(By.id("year")));

        List<WebElement> years = states.getOptions();

        // Select by index, values, test
        // Select Year
        System.out.println(states.getOptions().size());

        states.selectByVisibleText("1991");

        System.out.println(states.getFirstSelectedOption().getText());

        // Select month by using index number
        Select months = new Select(driver.findElement(By.id("month")));

        List<WebElement> number = months.getOptions();

        System.out.println(months.getOptions().size());

        months.selectByIndex(11);

        Select days = new Select(driver.findElement( By.id("day")));

        System.out.println(days.getOptions().size());
        System.out.println(days.getFirstSelectedOption().getText());
        days.selectByValue("18");




    }

}
