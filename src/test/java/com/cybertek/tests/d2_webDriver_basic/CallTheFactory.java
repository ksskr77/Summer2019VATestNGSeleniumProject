package com.cybertek.tests.d2_webDriver_basic;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

public class CallTheFactory {
    public static void main(String[] args) {

      //  WebDriverManager.chromedriver().setup();
       // WebDriver driver = new ChromeDriver()

        WebDriver driver = WebDriverFactory.getDriver("chrome");

        WebDriver driver2 = WebDriverFactory.getDriver("firefox");

    }
}
