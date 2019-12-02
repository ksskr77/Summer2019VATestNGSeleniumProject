package com.cybertek.tests.d14_properties_driverclass_test_baseclass;

public class Singleton {

    //singleton class will have private constructor
    // it means other classes cannot create object of this class
    private Singleton(){

    }

    static String str;

    public static String getInstance(){
        // if String has no value, initialize it and return
        if (str == null){
            System.out.println("str is null. assigning value to it");
            str = "ice cream";
            // else
        }else {
            System.out.println("it already has a value");
        }
        return str;
    }


}
