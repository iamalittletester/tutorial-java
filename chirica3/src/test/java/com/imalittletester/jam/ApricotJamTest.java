package com.imalittletester.jam;

import com.imalittletester.jam.ApricotJam;
import com.imalittletester.jam.Bottle;
import com.imalittletester.jam.Jar;
import com.imalittletester.jam.MelonJam;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApricotJamTest {
   // ArrayList
    public String text = "vata de zahar";

    public ApricotJam apricotJam = new ApricotJam("");
    public ApricotJam apricotJam2 = new ApricotJam("sugar");
    public ApricotJam apricotJam3 = new ApricotJam("stevia", 0.5f, "kg",  new Fruit("apricot", 10, "kg"), new Jar(30, 500));
    public ApricotJam apricotJam4 = new ApricotJam("sugar cane", 1.5f,"kg", new Fruit("apricot", 15,"kg"), new Jar(30, 500));
    public MelonJam melonJam = new MelonJam("plain sugar", 10, "kg", new Fruit("melon", 10, "kg"), new Bottle(20, 1000));
    public ApricotJam testJam = new ApricotJam("sucralose", 0.5f, "kg", new Fruit("apricot", 15, "kg"), new Jar(30, 500));

    @Test
    void homeworkTest(){
        Map<String, Double> fruitPricePerKg = Map.of("apple", 5.0, "peach", 3.5, "melon", 7.0, "apricot", 6.5);
        float price = 0;
        for (Map.Entry<String, Double> entry : fruitPricePerKg.entrySet()) {
            if (entry.getKey() == "apricot") {
                price = (float) (entry.getValue() * testJam.fruit.quantity);
            }
        }
        System.out.println("Pretul fructelor pentru gem este de " + price + " lei");
    }

    @Order(1)
    @Test
    void thirdTest(){
       apricotJam3.makeJam();
       System.out.println("+++++++++++++++++++");
       melonJam.makeJam();
      /*  System.out.println("avem " + apricotJam3.howManyFullJars(2300) + " borcane pline.");
        System.out.println("mai raman " + apricotJam3.remainderJam(2300) + "g.");
        System.out.println(apricotJam3.equals(apricotJam4));
        System.out.println("is jam3 dietetic? " + apricotJam3.isDietetic);
        System.out.println("is jam4 dietetic? " + apricotJam4.isDietetic);*/
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
