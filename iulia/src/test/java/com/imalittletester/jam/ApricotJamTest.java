package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

import java.util.Date;

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

    public ApricotJam apricotJam3 = new ApricotJam("sugar cane",1.5f, "kg",10, "kg", 30, 500,false );
    @Test
    void secondTest() {
        System.out.println(apricotJam);
        System.out.println(apricotJam2);
        System.out.println(apricotJam3);
        apricotJam3.makeJam();

    }

    @Test
    void firstTest() {
       // System.out.println(aPositiveValue);
       // System.out.println(aPositiveLong);
       // System.out.println(aFloat);
       // System.out.println(aDouble);
       // System.out.println(aBoolean);
        System.out.println(" -->" + aSweetener);
    }
}
