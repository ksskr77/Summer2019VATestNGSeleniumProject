package com.cybertek.tests.d2_webDriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetUrlAndTitle {
    public static void main(String[] args) throws InterruptedException {


        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.jetbrains.com/idea/download/");

        String title = driver.getTitle();
        System.out.println("title is: "+title);

        String url = driver.getCurrentUrl();
        System.out.println("url is: "+url);

        System.out.println(driver.getPageSource());

        Thread.sleep(2000);
        driver.navigate().to("https://amazon.com");

    }
}
