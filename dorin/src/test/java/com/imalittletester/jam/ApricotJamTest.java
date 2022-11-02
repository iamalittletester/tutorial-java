package com.imalittletester.jam;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.File;
import java.util.Date;
@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApricotJamTest {

    public int aPositiveInt = -10;
    public long aPositiveLong = -1000000000;
    public float aFloat = 500;
    public double aDouble = 1.5;
    public boolean aBoolean;
    public String aSweetener = "sugar\ncane";
    public Date newDate;

    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");
    public ApricotJam apricotJam3 = new ApricotJam(new Jam("sugar", 10, "kg", true,  "Apricot", 10, "KG"), new Jar(10, 690));
    public ApricotJam apricotJam4 = new ApricotJam(new Jam("Sugar", 10, "kg", false, "Apricot",10, "KG"), new Jar(10, 690));

    public MelonJam melonJam = new MelonJam("plain sugar", 10, "kg", 10, "kg",
            new Bottle(20,1000));

   @Test
    void jarTest(){
        System.out.println(apricotJam3);
        apricotJam3.makeJam();
    }

    @Order(1)
    void thirdTest(){
        apricotJam3.makeJam();
        System.out.println("---------------");
        melonJam.makeJam();
        System.out.println(apricotJam3.equals(apricotJam4));


    }
    @Order(2)
    @Test
    void secondTest(){
        System.out.println(apricotJam);

        System.out.println(apricotJam2);

        System.out.println(apricotJam3);
        apricotJam3.makeJam();
        melonJam.makeJam();
    }
    @Order(3)
    @Test
    void firstTest(){
        System.out.println(aPositiveInt);
        System.out.println(aPositiveLong);
        System.out.println(aFloat);
        System.out.println(aDouble);
        System.out.println(aBoolean);
        System.out.println("--> " + aSweetener);
        System.out.println(apricotJam3.howManyFullJars(2300));
    }
}
