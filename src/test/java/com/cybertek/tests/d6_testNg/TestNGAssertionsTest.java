package com.cybertek.tests.d6_testNg;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class TestNGAssertionsTest {

    @Test
    public void test1(){
        System.out.println("first assertion");
        Assert.assertEquals("one", "one");

        System.out.println("second assertion");
        Assert.assertEquals(1,1);

    }

    @Test
    public void test2(){
        Assert.assertNotEquals("one", "two");
    }

    @Test
    public void test3(){
        String expected = "Cbt";
        String actual = "Cbt";


        Assert.assertTrue(expected.startsWith("C"));
    }

    @AfterMethod
    public void teardownMethod(){
        System.out.println("CLOSE CHROME");
    }


}
