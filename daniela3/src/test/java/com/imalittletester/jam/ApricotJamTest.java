package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class ApricotJamTest {
    //fields
    public int aPositiveInt = 10;
    public long aPositiveLong = 100000000;
    public float aFloat = 500;
    public double aDouble = 1.5;
    public boolean aBoolean;
    public String aSweetener = "cane\\sugar";
    public Date new_Date;
    public ApricotJam apricotJam =  new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");
    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f, "kg", 10, "kg", 30, 500, false);

    @Test
    void secondTest(){
        System.out.println(apricotJam);
        System.out.println(apricotJam2);
        System.out.println(apricotJam3);
        apricotJam3.makeJam();
        System.out.println(apricotJam3.sweetener);
    }

   @Test
    void firstTest() {
        System.out.println(aPositiveInt);
        System.out.println(aPositiveLong);
        System.out.println(aFloat);
        System.out.println(aDouble);
        System.out.println(aBoolean);
        System.out.println(" --> " + aSweetener);
    }
    }

