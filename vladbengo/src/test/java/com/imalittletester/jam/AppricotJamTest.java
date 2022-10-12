package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

public class AppricotJamTest {

    public int aPositiveInt = 10;
    public long aPositiveLong = 1000000;
    public float aFloat = 500;
    public double aDouble = -221211.55676574647;
    public boolean aBoolean;
    public String aSweetener = "Sugar cane";

    @Test
    void firstTest() {
        System.out.println(aPositiveInt);
        System.out.println(aPositiveLong);
        System.out.println(aFloat);
        System.out.println(aDouble);
        System.out.println(aBoolean);
        System.out.println(aSweetener);
    }
}
