package com.cybertek.tests.d2_webDriver_basic;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseAndQuit {
    public static void main(String[] args) throws InterruptedException {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        driver.get("https://www.jetbrains.com/idea/download/");
        Thread.sleep(2000);
        driver.close();



        driver.get("https://amazon.com");
        Thread.sleep(2000);
        driver.close();


        driver.quit();










    }
}
