package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

import java.util.Date;

public class ApricotJamTest {

    public int aPositiveInt = 10;
    public float aFloat = 1.5F;
    public boolean aBoolean;
    public String aSweetener = "sugar cane";
    public Date new_Date;

    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");
    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f, "kg", 10, "kg", 30, 500, false);

    public MelonJam melonJamRaureni = new MelonJam ("plain sugar", 10, "kg", 10, "kg", new Bottle(20, 1000), false);

    @Test
    void fourthTest (){
        apricotJam3.makeJam ();
        System.out.println("-----------");
        melonJamRaureni.makeJam();
    }

    @Test
    void secondTest () {
        System.out.println(apricotJam);
        System.out.println(apricotJam2);
        System.out.println(apricotJam3);
        apricotJam3.makeJam();
        System.out.println(apricotJam3.sweetener);
        apricotJam3.sweetener.contains("sugar");
        melonJamRaureni.makeJam();
    }

    @Test
    void firstTest() {

     //   System.out.println(aPositiveInt);
     //   System.out.println(aFloat);
     //   System.out.println(aBoolean);
        System.out.println("-" + aSweetener);
    }
}
