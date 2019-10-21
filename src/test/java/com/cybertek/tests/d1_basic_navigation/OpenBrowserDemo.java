package com.cybertek.tests.d1_basic_navigation;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class OpenBrowserDemo {

    public static void main(String[] args) {
        // import -> alt+enter

        // we have to enter this line very time we open CHROME
        // without we get any exception
        WebDriverManager.chromedriver().setup();

        // this par is selenium
        // WebDriver -> represents browser
        // this line opens chrome browser
        WebDriver driver = new ChromeDriver();


    }
}
