package com.imalittletester.jam;


import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class ApricotJamTest {
    //fields
    public int aPositiveInt = -10;
    public long aPositiveLong = -1000000000;
    public float aFloat = 500;
    public double aDouble = 1.2;
    public boolean aBoolean;
    public String aSweetener = "sugar\ncane";
    public Date newDate;

    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");
    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f, "kg", 10,
            "kg", new Jar(30, 500), true);

    @Test
    void fifthTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //

        //numere divizibile cu 3 intre 0 si 21 (exclusiv)
        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }
        System.out.println("---------------------------------");
        for (int i = 21; i > 0; i--) {
            if (i % 3 == 0)
                System.out.println(i);
        }
        System.out.println("______________________________");
        for (int i = 3; i < 20; i += 3) {
            System.out.println(i);
        }
        System.out.println("---------------------------------");
        int i = 1;
        while (i < 21) {
            System.out.println(i);
            i++;
        }
    }

    @Test
    void fourthTest() {
        System.out.println(apricotJam3.qtyInGramsUsingIf("kg", 2.5f));
        System.out.println(apricotJam3.qtyInGramsUsingIf("micrograms", 1000));
        System.out.println(apricotJam3.qtyInGramsUsingIf(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty));
        System.out.println(apricotJam3.qtyInGramsUsingIf("grams", 125));

        System.out.println("---------------------");
        System.out.println(apricotJam3.qtyInGramsUsingSwitch("micrograms", 2500));
        System.out.println(apricotJam3.qtyInGramsUsingSwitch(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty));
        System.out.println(apricotJam3.qtyInGramsUsingSwitch("grams", 78));
        System.out.println(apricotJam3.qtyInGramsUsingSwitch("fkgdfgkfd", 74323));
        System.out.println("---------------------");

        int position = 789;

        if (position > 0)
            System.out.println("Element found on position " + position);
        else System.out.println("There is no element!");


        // using simplified if
        System.out.println(position > 0 ? "Element found on position: " + position : "There is no element!");

        String theMessage = position > 0 ? "Element found on position: " + position : "There is no element!";
        System.out.println("theMessage = " + theMessage);

        //last simplified if is equivalent to:
        String theMessage2 = "";
        if (position > 0)
            theMessage2 = "Element found on position: " + position;
        else theMessage2 = "There is no element!";
        System.out.println(theMessage2);
    }


    @Order(1)
    @Test
    void thirdTest() {
        //  apricotJam3.makeJam();
//        System.out.println("-------------");
//        melonJam.makeJam();
        System.out.println(apricotJam3.howManyFullJars(2300));
        System.out.println(apricotJam3.remainderJam(2300));
        System.out.println(apricotJam3.equals(apricotJam2));
    }

    @Order(2)
    @Test
    void secondTest() {

        System.out.println(apricotJam);
        System.out.println(apricotJam2);

        System.out.println(apricotJam3);
        apricotJam3.makeJam();
        System.out.println(apricotJam3.sweetener);

        apricotJam3.sweetener.contains("sugar");

        melonJam.makeJam();
    }

    @Order(3)
    @Test
    void firstTest() {
//        System.out.println(aPositiveInt);
//        System.out.println(aPositiveLong);
//        System.out.println(aFloat);
//        System.out.println(aDouble);
//        System.out.println(aBoolean);
//        System.out.println("->> " + aSweetener);
    }

}
