package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

public class OperatorsTest {

    @Test
    void firstTest() {

        int int1 = 0;
        int int2 = 55;
        double double1 = 0.0, double2 = 125.5;
        String string1 = "";
        // ctrl + alt + L

//        System.out.println("int1 = " + int1);
        int1 = 100;
//        System.out.println("int1 = " + int1);
        int2 = int1;
//        System.out.println("int2 = " + int2);
        int1 = int1 + 5;
//        System.out.println("int1 = " + int1);
        int1 = int2 + 10;
//        System.out.println("int1 = " + int1);

        double1 = 10.5 - 2.3;
//        System.out.println("double1 = " + double1);
        double1 = double2 - 1;
//        System.out.println("double1 = " + double1);
        double1 = double1 - double2;
/*
        System.out.println("double1 = " + double1);
        System.out.println(1 + 2);
        System.out.println("1" + "2");
        System.out.println(1 + "2");
*/

        System.out.println("String equals: " + string1.equals("This is the second string"));

    }

    @Test
    void secondTest() {
        int int1 = 1;
        int int2 = 0;
        boolean bool1 = true, bool2 = false;
        int2 = int1++;
        System.out.println("int2 = " + int2);
        int2 = ++int1;
        System.out.println("int2 = " + int2);

        System.out.println(!bool1);
        System.out.println(!bool2);

        System.out.println(int1 > int2);
        System.out.println(int2 > int1);
    }
    
    @Test 
    void thirdTest(){
        int int1 = 1;
//        int1 = int1 + 10;
        int1 += 10;
        int1 -= 10;
//        soutv tab
        System.out.println("int1 = " + int1);
//        int1 = int1 + -100000;
        int1 += -100000;
        System.out.println("int1 = " + int1);

        System.out.println(1 == 2);
        System.out.println(1 != 2);


    }
}

