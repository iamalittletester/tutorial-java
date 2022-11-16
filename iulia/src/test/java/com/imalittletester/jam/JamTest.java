package com.imalittletester.jam;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Date;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JamTest {

    public int aPositiveValue = 10;
    public long aPositiveLong = -1001001;
    public float aFloat = 500;
    public double aDouble = 29292.29292929229;
    public boolean aBoolean;
    public String aSweetener = "sugar\ncane";
    public Date new_Date;

    public Jam apricotJam = new Jam();
    public Jam apricotJam2 = new Jam("stevia",1.5f,"kg",true,new Jar(50,400));
    public Jam apricotJam3 = new Jam("sugar cane",1,"kg",false,new Jar(800,40));
    public Jam melonJam = new Jam("plain sugar",2,"kg",false,new Jar(500,20));


    @Order(1)
    @Test
    void thirdTest() {
        apricotJam3.makeJam();
        System.out.println("------------------");
        melonJam.makeJam();

        System.out.println("avem " + apricotJam3.howManyFullJars(2300) + " borcane pline.");
        System.out.println("mai raman " + apricotJam3.remainderJam(2300) + "g.");
        System.out.println(apricotJam3.equals(apricotJam2));
    }

    @Test
    void forthTest() {
        apricotJam3.makeJam();
        System.out.println("Is jam made with stevia dietetic? " + apricotJam3.isDietetic);
        System.out.println("Is jam made with sugar cane dietetic? " + apricotJam2.isDietetic);
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

    }
}

