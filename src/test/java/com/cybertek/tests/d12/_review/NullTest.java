package com.cybertek.tests.d12._review;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NullTest {

    String str;

    @BeforeMethod
    public void setup(){
        str="AAA";
    }

    @Test
    public void test1(){

        System.out.println(str.toLowerCase());
    }
}

