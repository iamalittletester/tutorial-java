package com.imalittletester.jam;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Date;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApricotJamTest {

    public int aPositiveValue = 10;
    public long aPositiveLong = -1001001;
    public float aFloat = 500;
    public double aDouble = 29292.29292929229;
    public boolean aBoolean;
    public String aSweetener = "sugar\ncane";
    public Date new_Date;

    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam();

    public ApricotJam apricotJam3 = new ApricotJam("stevia", 1.5f, "kg", 10, "kg", new Jar(30, 500));
    public ApricotJam apricotJam4 = new ApricotJam("sugar cane", 1.5f, "kg", 10, "kg", new Jar(30, 500));
    public MelonJam melonJam = new MelonJam("plain sugar", 10, "kg", 10, "kg", new Bottle(20, 1000), false);


    @Order(1)
    @Test
    void thirdTest() {
        apricotJam3.makeJam();
        System.out.println("------------------");
        melonJam.makeJam();

        System.out.println("avem " + apricotJam3.howManyFullJars(2300) + " borcane pline.");
        System.out.println("mai raman " + apricotJam3.remainderJam(2300) + "g.");
        System.out.println(apricotJam3.equals(apricotJam4));
    }

    @Test
    void forthTest() {
        apricotJam3.makeJam();
        System.out.println("Is jam made with stevia dietetic? " + apricotJam3.isDietetic);
        System.out.println("Is jam made with sugar cane dietetic? " + apricotJam4.isDietetic);
    }


    @Order(2)
    @Test
    void secondTest() {
        System.out.println("------------------");
        System.out.println(apricotJam);
        System.out.println(apricotJam2);
        System.out.println(apricotJam3);
        apricotJam3.makeJam();
        apricotJam3.sweetener.contains("sugar");
        melonJam.makeJam();

    }

    @Order(3)
    @Test
    void firstTest() {
        // System.out.println(aPositiveValue);
        // System.out.println(aPositiveLong);
        // System.out.println(aFloat);
        // System.out.println(aDouble);
        // System.out.println(aBoolean);
        //System.out.println(" -->" + aSweetener);

        System.out.println(apricotJam3.howManyFullJars(2300));
        System.out.println(apricotJam3.remainderJam(2300));
        System.out.println(apricotJam3.equals(apricotJam2));
    }

    @Test
    void fifthTest() {
        System.out.println(apricotJam3.qtyGramsUsingIf("kg", 2.5f));
        System.out.println(apricotJam3.qtyGramsUsingIf("micrograms", 1000));
        System.out.println(apricotJam3.qtyGramsUsingIf("grams", 125));

        System.out.println("----------------------------------------------");
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("micrograme", 2500));
        System.out.println("------------------------------------------------");
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("grams", 78));


        int position = 789;

        if (position > 0)
            System.out.println("Element found on position " + position);
        else System.out.println("THERE IS NO ELEMENT!!!!");


        // using simplified if
        System.out.println(position > 0 ? "Element found on position: " + position : "THERE IS NO ELEMENT!!!");

        String theMessage = position > 0 ? "Element found on position: " + position : "THERE IS NO ELEMENT!!!";
        String theMessage2 = "";
        if (position > 0)
            theMessage2 = "Eelement found on position: " + position;
        else theMessage2 = "THERE IS NO ELEMENT!";
        System.out.println(theMessage2);
    }

    @Test
    void sixthTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        System.out.println("---------------------");


        //numere divizibile cu 3 intre 0 si 21 (exclusiv)

        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }
        System.out.println("---------------------------");
        for (int i = 20; i > 0; i--) {
            if (i % 3 == 0)
                System.out.println(i);

            System.out.println("----------------------");
        }
        for (int i = 3; i < 20; i += 3) {
            System.out.println(i);
        }
        System.out.println("--------------");
        int i = 1;
        while (i < 21) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }

    }
}

