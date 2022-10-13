package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

public class ApricotJamTest {

    int aPositiveValue = 10;
    long aPositiveLong = 1000;
    float aFloat = 1.5F;
    double aDouble = 4556.9876587987675;
    boolean aBoolean;
    String aSweetener = "sugar\ncane";

    public ApricotJam apricotJam = new ApricotJam("");
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");

    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f, "kg", 10, "kg", 30, 500, false);

    @Test

    void secondTest() {
        System.out.println(apricotJam);

        System.out.println(apricotJam2);

        System.out.println(apricotJam3);

        apricotJam3.makeJam();

        System.out.println(apricotJam3.sweetener);
    }

    @Test
    void firstTest() {
        System.out.println(aPositiveValue);
        System.out.println(aPositiveLong);
        System.out.println(aFloat);
        System.out.println(aDouble);
        System.out.println(aBoolean);
        System.out.println(aSweetener);

    }
}
