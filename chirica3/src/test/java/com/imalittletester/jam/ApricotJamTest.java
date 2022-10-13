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

    public ApricotJam apricotJam = new ApricotJam("");
    public ApricotJam apricotJam2 = new ApricotJam("sugar");
    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f,"kg", 10, "kg", 30, 500, false);

    @Test
    void secondTest() {
      // System.out.println(apricotJam);
      //  System.out.println(apricotJam2);
      //  System.out.println(apricotJam3);
        apricotJam3.makeJam();
       // System.out.println(apricotJam3.sweetener);
    }

    @Test
    void firstTest() {
       // System.out.println(pozInt);
        //System.out.println(pozLong);
        //System.out.println(aDouble);
        //System.out.println(aBool);
        System.out.println("==>" + text +"<==");
    }
}
