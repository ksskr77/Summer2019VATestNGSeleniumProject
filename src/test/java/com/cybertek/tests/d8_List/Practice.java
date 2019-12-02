package com.cybertek.tests.d8_List;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.List;

public class Practice {

    @Test
    public void test() {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("http://practice.cybertekschool.com/dropdown");

        WebElement listOfStates = driver.findElement(By.id("state"));

        Select lists = new Select(listOfStates);

        List<WebElement> options = lists.getOptions();


        for (WebElement list: options) {
            System.out.println(list.getText());
        }

        lists.selectByVisibleText("Virginia");
        lists.selectByValue("NY");
        lists.selectByIndex(23);

    }
}
