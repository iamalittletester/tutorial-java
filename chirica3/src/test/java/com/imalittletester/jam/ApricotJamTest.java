package com.imalittletester.jam;

import com.imalittletester.jam.ApricotJam;
import com.imalittletester.jam.Bottle;
import com.imalittletester.jam.Jar;
import com.imalittletester.jam.MelonJam;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApricotJamTest {
    public String text = "vata de zahar";

    public ApricotJam apricotJam = new ApricotJam("");
    public ApricotJam apricotJam2 = new ApricotJam("sugar");
    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f,"kg", 10, "kg", new Jar(30, 500), true);
    public ApricotJam apricotJam4 = new ApricotJam("sugar cane", 1.5f,"kg", 10, "kg", new Jar(30, 500), true);
    public MelonJam melonJam = new MelonJam("plain sugar", 10, "kg", 10, "kg", new Bottle(20, 1000), false);


    @Order(1)
    @Test
    void thirdTest(){
     //   apricotJam3.makeJam();
     //   System.out.println("+++++++++++++++++++");
      //  melonJam.makeJam();
        System.out.println("avem " + apricotJam3.howManyFullJars(2300) + " borcane pline.");
        System.out.println("mai raman " + apricotJam3.remainderJam(2300) + "g.");
        System.out.println(apricotJam3.equals(apricotJam4));
    }

    @Order(2)
    @Test
    void secondTest() {
      // System.out.println(apricotJam);
      //  System.out.println(apricotJam2);
      //  System.out.println(apricotJam3);
        apricotJam3.makeJam();
        melonJam.makeJam();
       // System.out.println(apricotJam3.sweetener);
    }

    @Order(3)
    @Test
    void firstTest() {
       // System.out.println(pozInt);
        //System.out.println(pozLong);
        //System.out.println(aDouble);
        //System.out.println(aBool);
        System.out.println("==>" + text +"<==");
    }
}
