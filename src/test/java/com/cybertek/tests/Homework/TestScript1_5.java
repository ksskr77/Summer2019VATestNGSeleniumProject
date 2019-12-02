package com.cybertek.tests.Homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import com.cybertek.utilities.WebDriverFactory;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class TestScript1_5 {
    WebDriver driver;

    @BeforeMethod
    public void setup(){
    driver = WebDriverFactory.getDriver("chrome");
    driver.get("https://practice-cybertekschool.herokuapp.com/");
    WebElement register = driver.findElement(By.xpath("//a[.='Registration Form']"));
    register.click();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @AfterMethod
    public void close() throws InterruptedException {
        Thread.sleep(2000);
        driver.close();
    }

    @Test
    public void Test1 (){

    driver.findElement(By.name("birthday")).sendKeys("wrong_dob");
    String error = driver.findElement(By.xpath("//small[.='The date of birth is not valid']")).getText();

        Assert.assertEquals(error, "The date of birth is not valid");

    }
    @Test
    public void Test2(){

     String C = driver.findElement(By.xpath("//label[.='C++']")).getText();
     Assert.assertEquals(C, "C++");

     String java = driver.findElement(By.xpath("//*[.='Java']")).getText();
     Assert.assertEquals(java, "Java");

     String javascript = driver.findElement(By.xpath("//*[.='JavaScript']")).getText();
     Assert.assertEquals(javascript, "JavaScript");


    }

    @Test
    public void Test3(){
        driver.findElement(By.name("firstname")).sendKeys("f");
        String error = driver.findElement(By.xpath("//*[.='first name must be more than 2 and less than 64 characters long']")).getText();
        Assert.assertEquals(error, "first name must be more than 2 and less than 64 characters long");

    }
    @Test
    public void Test4(){
        driver.findElement(By.name("lastname")).sendKeys("l");
        String error2 = driver.findElement(By.xpath("//small[.='The last name must be more than 2 and less than 64 characters long']")).getText();
        Assert.assertEquals(error2, "The last name must be more than 2 and less than 64 characters long");

    }

    @Test
    public void Test5() throws InterruptedException {
        driver.findElement(By.name("firstname")).sendKeys("Yoonjin");
        driver.findElement(By.name("lastname")).sendKeys("Im");
        driver.findElement(By.name("username")).sendKeys("Sunsoo");
        driver.findElement(By.name("password")).sendKeys("12345678");
        driver.findElement(By.name("phone")).sendKeys("703-123-1234");
        driver.findElement(By.name("email")).sendKeys("ksskr77@gmail.com");
        driver.findElement(By.name("gender")).click();
        driver.findElement(By.name("birthday")).sendKeys("12/18/1991");

        //
        WebElement department = driver.findElement(By.name("department"));
        Select departmentList = new Select(department);
        List<WebElement> options = departmentList.getOptions();
        departmentList.selectByVisibleText("Tourism Office");

        //
        WebElement jobtitle = driver.findElement(By.name("job_title"));
        Select titleList = new Select((jobtitle));
        List<WebElement> titleOption = titleList.getOptions();
        titleList.selectByVisibleText("SDET");

        driver.findElement(By.id("inlineCheckbox2")).click();

        Thread.sleep(2000);

        driver.findElement(By.id("wooden_spoon")).click();

        Thread.sleep(2000);

        String success = driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/p")).getText();

        Assert.assertEquals(success, "You've successfully completed registration!");


    }














    }
