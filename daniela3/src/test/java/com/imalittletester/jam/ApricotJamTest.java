package com.imalittletester.jam;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApricotJamTest {
    //fields
    public int aPositiveInt = 10;
    public long aPositiveLong = 100000000;
    public float aFloat = 500;
    public double aDouble = 1.5;
    public boolean aBoolean;
    public String aSweetener = "cane\\sugar";
    public Date new_Date;
    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");
    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f, "kg", new Jar(30, 500), true, 10, "kg");
    public ApricotJam apricotJam4 = new ApricotJam("sugar cane", 1.5f, "kg", new Jar(30, 500), true, 10, "kg");

    public MelonJam melonJam = new MelonJam("plain sugar", 10, "kg", new Bottle(20, 1000), false, 10, "kg");

    @Order(1)
    @Test
    void firstTest() {
        System.out.println(apricotJam);     //sout tab
        System.out.println(apricotJam2);
        System.out.println(apricotJam3);

        apricotJam3.makeJam();
        melonJam.makeJam();
        //System.out.println(apricotJam3.sweetener);
        //apricotJam3.sweetener.contains("sugar");
    }

    @Order(2)
    @Test
    void secondTest() {
        apricotJam3.makeJam();
        System.out.println("-----");
        melonJam.makeJam();

        System.out.println(apricotJam3.getSweetener());
        apricotJam3.setSweetener("stevia");
        System.out.println(apricotJam3.getSweetener());

    }

    @Test
    void thirdTest() {
        apricotJam3.makeJam();
        System.out.println();
        melonJam.makeJam();

        System.out.println(apricotJam3.howManyFullJars(2300));
        System.out.println(apricotJam3.remainderJam(2300));
        System.out.println(apricotJam3.equals(apricotJam4));
    }

    @Test
    void fourthTest() {
        System.out.println(apricotJam3.qtyInGramsUsingIf("kg", 2.5f));
        System.out.println(apricotJam3.qtyInGramsUsingIf("micrograms", 1000));

        System.out.println("----------------------------");
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("kg", 2500));
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty));
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("grams", 78));
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("adsf", 74328));
        System.out.println("----------------------------");

        int position = 789;
        if (position > 0)
            System.out.println("Element found on position: " + position);
        else System.out.println("There is no element");

        //using simplified if
        System.out.println(position > 0 ? "Element found on position: " + position : "There is no element");

        //last simplified if is equivalent to:
        String theMessage = position > 0 ? "Element found on position: " + position : "There is no element";
        String theMessage2 = "";
        if (position > 0)
            theMessage2 = "Element found on position: " + position;
        else theMessage2 = "There is no element";
        System.out.println(theMessage2);
    }

    @Test
    void
    fifthTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("---------------------------");

        //numere divizibile cu 3 intre 0 si 21 (exclusiv)
        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }
        System.out.println("---------------------------");
        for (int i = 20; i > 0; i--) {
            if (i % 3 == 0)
                System.out.println(i);
        }

        System.out.println("---------------------------");
        for (int i = 3; i < 20; i += 3) {
            System.out.println(i);
        }

        System.out.println("---------------------------");
        int i = 1;
        while (i < 21) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
}