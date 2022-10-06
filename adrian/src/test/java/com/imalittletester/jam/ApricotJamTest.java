package com.imalittletester.jam;


import org.junit.jupiter.api.Test;

public class ApricotJamTest {
public int aPositiveInt = 1;
public long aPositiveLong = 10000000;
public float aFloat = 500;
public double aDouble = 1.5;
public boolean aBoolean;
public String aSweetener = "";

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
