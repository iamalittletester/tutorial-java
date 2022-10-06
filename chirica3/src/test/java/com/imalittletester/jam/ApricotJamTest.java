package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class ApricotJamTest {
    public int pozInt = 10;
    public long pozLong = 1000000;
    public float aFloat = 500;
    public double aDouble = 1.5;
    public boolean aBool;
    public char litera;
    public String text = "vata\\de\\ zahar";
    public Date zi;

    @Test
    void firstTest() {
       // System.out.println(pozInt);
        //System.out.println(pozLong);
        //System.out.println(aDouble);
        //System.out.println(aBool);
        System.out.println("==>" + text +"<==");
    }
}
