package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Date;

public class AppricotJamTest {

    public int aPositiveInt = 10;
    public long aPositiveLong = 1000000;
    public float aFloat = 500;
    public double aDouble = -221211.55676574647;
    public boolean aBoolean;
    public String aSweetener = "Sugar cane";
    public Date new_Date;

    public AppricotJam apricotJam = new AppricotJam();
    public AppricotJam apricotJam2 = new AppricotJam("white sugar");
    public AppricotJam apricotJam3 = new AppricotJam("sugar cane", 1.5f, "kg", 10, "kg", 30, 500, false);


    @Test
    void secondTest() {
        System.out.println(apricotJam);

        System.out.println(apricotJam2);

        System.out.println(apricotJam3);
        apricotJam3.makeJam();
        System.out.println(apricotJam3.sweetener);

        apricotJam3.sweetener.contains("sugar");
    }
    @Test
    void firstTest() {
//        System.out.println(aPositiveInt);
//        System.out.println(aPositiveLong);
//        System.out.println(aFloat);
//        System.out.println(aDouble);
//        System.out.println(aBoolean);
        System.out.println(" --> " + aSweetener);
    }
}
