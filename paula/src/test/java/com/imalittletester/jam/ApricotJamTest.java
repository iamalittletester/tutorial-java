package com.imalittletester.jam;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApricotJamTest {
    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");  // ctrl P
    public ApricotJam apricotJam3 = new ApricotJam("brown sugar", 1.5f, "kg", new Jar(30, 500), false, 10, "kg");
    public MelonJam melonJam = new MelonJam("plain sugar", 10, "kg", new Bottle(20, 1000), false, 10, "kg");

    @Order(1)
    @Test
    void firstTest() {
        System.out.println(apricotJam);     //sout tab
        System.out.println(apricotJam2);
        System.out.println(apricotJam3);

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
}