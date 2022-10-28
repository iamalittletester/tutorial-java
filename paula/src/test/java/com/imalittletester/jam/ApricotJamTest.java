package com.imalittletester.jam;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApricotJamTest {
    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");  // ctrl P
    public ApricotJam apricotJam3 = new ApricotJam("brown sugar", 1.5f, "kg", new Jar(30, 500), 10, "kg");
    public ApricotJam apricotJam4 = new ApricotJam("brown sugar", 1.5f, "kg", new Jar(30, 500), 10, "kg");
    public ApricotJam apricotJam5 = new ApricotJam("stevia", 1.5f, "kg", new Jar(30, 500), 10, "kg");
    public ApricotJam apricotJam6 = new ApricotJam("Stevia", 1.5f, "kg", new Jar(30, 500), 10, "kg");
    public MelonJam melonJam = new MelonJam("sucralose", 10, "kg", new Bottle(20, 1000), 10, "kg");
    public MelonJam melonJam2 = new MelonJam("SUCRALOSE", 10, "kg", new Bottle(20, 1000), 10, "kg");

    @Order(1)
    @Test
    void firstTest() {
        System.out.println(apricotJam);
        System.out.println("---");
        System.out.println(apricotJam2);
        System.out.println("---");

        apricotJam3.makeJam();
        melonJam.makeJam();
        //System.out.println(apricotJam3.sweetener);
        //apricotJam3.sweetener.contains("sugar");
    }

    @Order(2)
    @Test
    void secondTest(){
        apricotJam3.makeJam();
        System.out.println("-----");
        melonJam.makeJam();

        System.out.println(apricotJam3.getSweetener());
        apricotJam3.setSweetener("stevia");
        System.out.println(apricotJam3.getSweetener());

    }

    @Test
    void thirdTest(){
        // test Homework 3
        apricotJam3.makeJam();
        System.out.println();
        melonJam.makeJam();
    }

    @Test
    void testCourse4(){
        System.out.println(apricotJam3.howManyFullJars(2300));
        System.out.println(apricotJam3.remainderJam(2300));
        System.out.println(apricotJam3.equals(apricotJam4));
    }

    @Test
    void testHomework4(){
        System.out.println("sweetener: " + apricotJam4.sweetener + ", is dietetic? " + apricotJam4.isDietetic);
        System.out.println("sweetener: " + apricotJam5.sweetener + ", is dietetic? " + apricotJam5.isDietetic);
        System.out.println("sweetener: " + apricotJam6.sweetener + ", is dietetic? " + apricotJam6.isDietetic);
        System.out.println("sweetener: " + melonJam.sweetener + ", is dietetic? " + melonJam.isDietetic);
        System.out.println("sweetener: " + melonJam2.sweetener + ", is dietetic? " + melonJam2.isDietetic);
    }
}