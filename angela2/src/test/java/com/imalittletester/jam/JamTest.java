package com.imalittletester.jam;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.Date;
import java.util.List;
import java.util.Map;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class JamTest {

    public int aPositiveInt = 10;
    public float aFloat = 1.5F;
    public boolean aBoolean;
    public String aSweetener = "sugar cane";
    public Date new_Date;

    public Jam apricotJam = new Jam();
    public Jam apricotJam2 = new Jam("white sugar");
    public Jam apricotJam3 = new Jam("sugar cane", 1.5f, "kg", new Fruit("apricot", 10, "kg"), new Recipient("jar", 10, 800), false);

    public Jam melonJamRaureni = new Jam ("plain sugar", 10, "kg", new Fruit("melon", 8, "kg"), new Recipient ("bottle", 20, 1000), false);
    public Jam apricotJam4 = new Jam ("xylitol", 7, "kg", new Fruit("apricot", 8, "kg"), new Recipient ("jar", 15, 800), true);


  @Order(1)
    @Test
    void mapCostTest (){
      float fruitQty = 8;
      Jam jam1 = new Jam (fruitQty, List.of("apple", "peach", "melon"));
        Map<String, Double> fruitPricePerKg = Map.of("apple", 5.0, "peach", 3.5, "melon", 7.0);
        System.out.println("Cost of apples is " + fruitQty * fruitPricePerKg.get("apple"));
        }


    @Order(2)
    @Test
    void fourthTest (){
        apricotJam3.makeJam ();
        System.out.println("-----------");
        melonJamRaureni.makeJam();
    }
@Order(3)
    @Test
    void thirdTest () {
        System.out.println(apricotJam);
        System.out.println(apricotJam2);
        System.out.println(apricotJam3);
        apricotJam3.makeJam();
        System.out.println(apricotJam3.sweetener);
        apricotJam3.sweetener.contains("sugar");
        melonJamRaureni.makeJam();

    }
@Order(4)
    @Test
    void secondTest() {

     //   System.out.println(aPositiveInt);
     //   System.out.println(aFloat);
     //   System.out.println(aBoolean);
        System.out.println("-" + aSweetener);
    }

    @Order(5)
    @Test
    void firstTest (){
        //System.out.println(apricotJam4);
       // apricotJam4.makeJam();
        melonJamRaureni.makeJam();
    }
}
