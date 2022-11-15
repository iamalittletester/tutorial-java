package com.imalittletester.jam;

import org.junit.jupiter.api.Order;
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

    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f, "kg", 10, "kg", new Jar(30, 500));

    public ApricotJam apricotJam4 = new ApricotJam("sucralose", 1.5f, "kg", 10, "kg", new Jar(30, 500));
    public MelonJam melonJam = new MelonJam("plain sugar", 10, "kg", 10, "kg", new Bottle(20, 1000), false);

    @Order(1)
    @Test
   void thirdTest(){
       apricotJam3.makeJam();
       System.out.println("-----------------");
       melonJam.makeJam();

       System.out.println(apricotJam3.howManyFullJars(2300));
       System.out.println(apricotJam3.remainderJam(2300));

        System.out.println(apricotJam3.equals(apricotJam4));

        System.out.println("-----------------");

        System.out.println("Is this jam dietetic: " + apricotJam3.isDietetic);
        System.out.println("Is this jam dietetic: " + apricotJam4.isDietetic);
   }

    @Order(2)
    @Test

    void secondTest() {
        System.out.println(apricotJam);

        System.out.println(apricotJam2);

        System.out.println(apricotJam3);

        apricotJam3.makeJam();

        System.out.println(apricotJam3.sweetener);

        melonJam.makeJam();
    }
    @Order(3)
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
