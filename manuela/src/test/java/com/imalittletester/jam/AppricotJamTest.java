package com.imalittletester.jam;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
//import java.io.File;
import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class) //set order on run tests
public class AppricotJamTest {
    public int aPositiveInt = -10;
    public long aPositiveLong = -100000000;
    public float aFloat = 500;
    public double aDouble = -221211.556765746464564564564564645645632342435465564;
    public boolean aBoolean;
    public String aSweetener = "sugar cane";
    public Date new_Date;

    //stocam un nou appricotJam
    public AppricotJam appricotJam = new AppricotJam();
    public AppricotJam appricotJam2 = new AppricotJam("white sugar");
    public AppricotJam appricotJam3 = new AppricotJam("sugar cane", 1.5f, "kg", 10, "kg", new Jar(30, 500), true);
    //initialized a new object of melonJam
    public MelonJam melonJam = new MelonJam("plain sugar", 10, "kg", 10, "kg", new Bottle(20, 100), false);

    @Order(1) //sa fie rulate in ordine
    @Test
    void thirdTest() {
//        appricotJam3.makeJam();
//        System.out.println(appricotJam3.getSweetener());
//        appricotJam3.setSweetener(aSweetener);
//        System.out.println(appricotJam3.getSweetener());
//        System.out.println("-------------------------");
//        melonJam.makeJam();
        System.out.println(appricotJam3.howManyFullJars(2300));
        System.out.println(appricotJam3.remainderJam(2300));
        System.out.println(appricotJam3.equals(appricotJam2));
    }

    @Order(2)
    @Test
    void secondTest() {
        System.out.println(appricotJam);

        System.out.println(appricotJam2);

        System.out.println(appricotJam3);

        appricotJam3.makeJam();
        System.out.println(appricotJam3.sweetener);

        appricotJam3.sweetener.contains("sugar");

        melonJam.makeJam();

    }

    @Order(3)
    @Test
    void firstTest() {
        //sout+tab for print
        System.out.println(aPositiveInt);
//        System.out.println(aPositiveLong);
//        System.out.println(aFloat);
//        System.out.println(aDouble);
//        System.out.println(aBoolean);
        System.out.println(" --> " + aSweetener);
        //   asertEquals (api.login("username1","passwoard1") + getResponse "Success");
    }

    @Order(3)
    @Test
    void fourthTest() {
        appricotJam3.makeJam();
    }

}
