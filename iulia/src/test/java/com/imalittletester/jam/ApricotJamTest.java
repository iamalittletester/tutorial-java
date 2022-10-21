package com.imalittletester.jam;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

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

    public ApricotJam apricotJam3 = new ApricotJam("sugar cane",1.5f, "kg",10, "kg",new Jar(500,30),true );

    public MelonJam melonJam = new MelonJam("plain sugar",10,"kg",10, "kg", new Bottle(20,1000),false);


    @Order(1)
    @Test
    void thirdTest() {
        apricotJam3.makeJam();
        System.out.println("------------------");
        melonJam.makeJam();
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
    }

    }

