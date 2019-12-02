package com.cybertek.tests.d14_properties_driverclass_test_baseclass;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class SingltonTest {

    @Test
    public void test1(){

        String s1 = Singleton.getInstance();

        String s2 = Singleton.getInstance();

        System.out.println(s1);
        System.out.println(s2);
    }

    @Test
    public void test2(){
        // this is how we create webdriver object from now on
        // the type of the webdriver will comes from properties file

        //
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        System.out.println(Driver.get().getTitle());
        // to close the driver
        Driver.closeDriver();

    }

    @Test
    public void test3(){
        // this is how we create webdriver object from now on
        // the type of the webdriver will comes from properties file

        //
        String url = ConfigurationReader.get("url");
        Driver.get().get(url);

        System.out.println(Driver.get().getTitle());
        // to close the driver
        Driver.closeDriver();

    }
}
