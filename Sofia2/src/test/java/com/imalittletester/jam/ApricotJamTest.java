package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class ApricotJamTest {
    public int aPositiveInt = 10;
    public long aPositiveLong = -10000000;
    public float aFloat = 500;
    public double aDouble = -1.5697777777777700000000000000000000000000000000005668;
    public boolean aBoolean;
    public String aSweetner = "sugar\\cane";

    public ApricotJam apricotJam = new ApricotJam("");
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");
    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f, "kg", 10, "kg", new Jar(30, 500), false);

    public MelonJam melonJam = new MelonJam("plain sugar", 10, "kg", 10, "kg", new Bottle(20, 100), false);

    @Test
    void thirdTest(){
        apricotJam3.makeJam();
        melonJam.makeJam();
    }

    @Test
    void secondTest() {
        System.out.println(apricotJam);
                System.out.println(apricotJam2);
                System.out.println(apricotJam3);
                apricotJam3.makeJam();
    }

    @Test
    void firstTest() {
 //      System.out.println(aPositiveInt);
  //      System.out.println(aPositiveLong);
  //      System.out.println(aFloat);
  //      System.out.println(aDouble);
   //     System.out.println(aBoolean);
        System.out.println(" --> " + aSweetner);
            System.out.println(apricotJam2);




    }
}
