package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

import java.util.Date;


public class ApricotJamTest {

    public int aPositiveInt = -10;
   public long aPositiveLong = -1000000000;
   public float aFloat = 500;
  public double aDouble = 1.5;
   public boolean aBoolean;
    public String aSweetener = "sugar\'cane";
    public Date newDate;


    @Test
    void firstTest() {
        //System.out.println(aPositiveInt);
       // System.out.println(aPositiveLong);
       // System.out.println(aFloat);
       // System.out.println(aDouble);
       // System.out.printlnaBoolean);
        System.out.println(" --> " + aSweetener);
    }
}
