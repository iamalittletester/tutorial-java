package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.util.Date;

public class ApricotJamTest {

    public int aPositiveValue = 10;
    public long aPositiveLong = -1001001;
    public float aFloat = 500;
    public double aDouble = 29292.29292929229;
    public boolean aBoolean;
    public String aSweetener = "sugar\ncane";
    public Date new_Date;

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
