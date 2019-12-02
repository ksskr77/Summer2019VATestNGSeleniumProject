package com.cybertek.tests;

import org.openqa.selenium.WebDriver;
import com.cybertek.utilities.WebDriverFactory;

public class NavigationTests {

    public static void methodChrome() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.get("https://google.com");
        String title = driver.getTitle();

        Thread.sleep(2000);


        driver.get("https://etsy.com");
        String title2 = driver.getTitle();

        Thread.sleep(2000);

        driver.navigate().back();
        String title3 = driver.getTitle();

        Thread.sleep(2000);

        driver.navigate().forward();
        String title4 = driver.getTitle();

        Thread.sleep(2000);

        if (title.equals(title3) && title2.equals(title4)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        Thread.sleep(2000);

        driver.quit();

    }

    public static void methodFirefox() throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("firefox");
        driver.manage().window().maximize();

        driver.get("https://google.com");
        String title = driver.getTitle();

        Thread.sleep(2000);


        driver.get("https://etsy.com");
        String title2 = driver.getTitle();

        Thread.sleep(2000);

        driver.navigate().back();
        String title3 = driver.getTitle();

        Thread.sleep(2000);

        driver.navigate().forward();
        String title4 = driver.getTitle();

        Thread.sleep(2000);

        if (title.equals(title3) && title2.equals(title4)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        Thread.sleep(2000);

        driver.quit();
    }

    public static void methodEdge() throws  InterruptedException{

        WebDriver driver = WebDriverFactory.getDriver("edge");
        driver.manage().window().maximize();

        driver.get("https://google.com");
        String title = driver.getTitle();

        Thread.sleep(2000);


        driver.get("https://etsy.com");
        String title2 = driver.getTitle();

        Thread.sleep(2000);

        driver.navigate().back();
        String title3 = driver.getTitle();

        Thread.sleep(2000);

        driver.navigate().forward();
        String title4 = driver.getTitle();

        Thread.sleep(2000);

        if (title.equals(title3) && title2.equals(title4)) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
        }

        Thread.sleep(2000);

    }

    public static void main(String[] args) throws InterruptedException {

        methodChrome();
        methodEdge();







    }
}
