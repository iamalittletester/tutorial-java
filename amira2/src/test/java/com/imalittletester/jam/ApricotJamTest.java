package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

public class ApricotJamTest {

    int aPositiveValue = 10;
    long aPositiveLong = 1000;
    float aFloat = 1.5F;
    double aDouble = 4556.9876587987675;
    boolean aBoolean;
    String aSweetener = "sugar\ncane";

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
