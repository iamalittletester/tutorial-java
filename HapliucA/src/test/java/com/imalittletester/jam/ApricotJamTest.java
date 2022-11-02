package com.imalittletester.jam;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Date;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApricotJamTest {

    public int aPositiveInt = -10;
   public long aPositiveLong = -1000000000;
   public float aFloat = 500;
  public double aDouble = 1.5;
   public boolean aBoolean;
    public String aSweetener = "sugar\'cane";
    public Date newDate;


    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam ("white sugar");
    public ApricotJam apricotJam3 = new ApricotJam ("sugar cane", 1.5f, "kg", 10, "kg",new Jar(30, 500), false);

    public MelonJam melonJam = new MelonJam("plain sugar", 10, "kg", 10, "kg", new Bottle(20, 1000), false);


    @Order(1)
    @Test
    void thirdTest() {
        apricotJam3.makeJam();
        System.out.println(apricotJam3.getSweetener());
        apricotJam3.setSweetener("stevia");
        System.out.println(apricotJam3.getSweetener());
        System.out.println("--------------------");
        melonJam.makeJam();
    }

    @Order(2)
    @Test
    //metoda de test care executa ceva
    void secondTest(){
        System.out.println(apricotJam);

        System.out.println(apricotJam2);

        System.out.println(apricotJam3);
        apricotJam3.makeJam();
        System.out.println(apricotJam3.sweetener);

        apricotJam3.sweetener.contains("sugar");

        melonJam.makeJam();

    }



    @Order(3)
    @Test
    void firstTest() {

        //System.out.println(aPositiveInt);
       // System.out.println(aPositiveLong);
       // System.out.println(aFloat);
       // System.out.println(aDouble);
       // System.out.printlnaBoolean);
        //System.out.println(" --> " + aSweetener);
    }
}
