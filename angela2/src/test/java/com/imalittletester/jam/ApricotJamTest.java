package com.imalittletester.jam;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApricotJamTest {

    public int aPositiveInt = 10;
    public float aFloat = 1.5F;
    public boolean aBoolean;
    public String aSweetener = "sugar cane";
    public Date new_Date;

    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");
    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f, "kg", 10, "kg", false);

    public MelonJam melonJamRaureni = new MelonJam ("plain sugar", 10, "kg", 10, "kg", new Bottle(20, 1000), false);
    public ApricotJam apricotJam4 = new ApricotJam ("xylitol", 7, "kg", 9, "kg", new Jar(15, 800), true);

   @Order(1)
    @Test
    void fourthTest (){
        apricotJam3.makeJam ();
        System.out.println("-----------");
        melonJamRaureni.makeJam();
    }
@Order(2)
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
@Order(3)
    @Test
    void firstTest() {

     //   System.out.println(aPositiveInt);
     //   System.out.println(aFloat);
     //   System.out.println(aBoolean);
        System.out.println("-" + aSweetener);
    }

    @Order(4)
    @Test
    void fifthTest (){
        System.out.println(apricotJam4);
        apricotJam4.makeJam();
    }
}
