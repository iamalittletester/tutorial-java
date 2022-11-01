package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

public class OperatorsTest {
    public int numele;

    @Test
    void firstTest() {
        int int1 = 0;
        int int2 = 55;

        double double1 = 0.0, double2 = 125.5;

        boolean bool1 = true, bool2 = false;

        String string1 = "", string2 = "This is the second string";

        System.out.println("int1 = " + int1);
        int1 = 100;
        System.out.println("int1 = " + int1);
        int2 = int1;
        System.out.println("int2 = " + int2);
        int1 = int1 + 5;
        System.out.println("int1 = " + int1);
        int1 = int2 + 10;
        System.out.println("int1 = " + int1);

        double1 = 10.5 - 2.3;
        System.out.println("double1 = " + double1);
        double1 = double2 - 1;
        System.out.println("double1 = " + double1);
        double1 = double1 - double2;
        System.out.println(double1);

        System.out.println(1 + 2);
        System.out.println("1" + "2");
        System.out.println(1 + "2");

        System.out.println(!bool1);
        System.out.println(!bool2);
        boolean e = !"eeee".contains("e");
        System.out.println("String equals " + string1.equals(string2));

    }
    @Test
    void secondTest() {
        int int1 = 1;
        int cuiAsignamValoarea = 0;
        cuiAsignamValoarea = int1++;
        System.out.println("cuiAsignamValoarea = " + cuiAsignamValoarea);
        // int1 e 2 deja
        cuiAsignamValoarea = ++int1;
        // int1 e 3
        System.out.println("cuiAsignamValoarea = " + cuiAsignamValoarea);
        ++int1;
        //int1 e 4
        System.out.println("int1 = " + int1);

        boolean int1MaiMareSauNu = int1 > cuiAsignamValoarea;
        System.out.println("Int1 mai mare ca celalalt? " + (int1 > cuiAsignamValoarea));
        System.out.println("Int1 mai mic ca celalalt? " + (int1 < cuiAsignamValoarea));
    }
@Test
        void thirdTest(){
    int int1 = 1;
    // int1 = int1 + 10;
    int1 += 10;
    System.out.println("int1 = " +int1); //avem val 11
//    int1 = int1 - 10
    System.out.println("int1 = " + int1); //avem val 1
//    int1 = int1 + -100000;
    int1+= -100000;
    System.out.println("int1 = " + int1);

    System.out.println(1 == 2);
    System.out.println(1 != 2);
    }


}
