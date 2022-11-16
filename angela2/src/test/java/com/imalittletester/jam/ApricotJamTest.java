package com.imalittletester.jam;

import com.imalittletester.utils.UnitOfMeasureConverter;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.util.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApricotJamTest {

    public int aPositiveInt = 10;
    public float aFloat = 1.5F;
    public boolean aBoolean;
    public String aSweetener = "sugar cane";
    public Date new_Date;


    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");
    public ApricotJam apricotJam3 = new ApricotJam("sucralose", 1.5f, "kg", 10, "kg", false);

    public MelonJam melonJamRaureni = new MelonJam ("plain sugar", 10, "kg", 10, "kg", new Bottle(20, 1000), false);
    public ApricotJam apricotJam4 = new ApricotJam ("stevia", 7, "kg", 9, "kg", new Jar(15, 500));
    public ApricotJam apricotJam5 = new ApricotJam ("sucralose", 6, "kg", 8, "kg", new Jar (10, 800));
    public ApricotJam apricotJam6 = new ApricotJam ("white sugar", 6, "kg", 8, "kg", new Jar (10, 800));
   @Order(1)
    @Test
    void fourthTest (){
        //apricotJam3.makeJam ();
        //System.out.println("-----------");
        //melonJamRaureni.makeJam();
       System.out.println(apricotJam4.howManyFullJars(2300));
       System.out.println(apricotJam4.remainderJam(2300));
       System.out.println(apricotJam3.equals(apricotJam4));
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

    @Order (5)
    @Test
    void sixthTest () {
        //System.out.println("Is jam dietetic? " + apricotJam3.isDietetic);
       // System.out.println("Is jam dietetic? " + apricotJam4.isDietetic);
       // System.out.println("Is jam dietetic? " + apricotJam5.isDietetic);
       // System.out.println("Is jam dietetic? " + apricotJam6.isDietetic);
        apricotJam6.makeJam();
    }

    @Order(6)
    @Test
    void seventhTest (){
        UnitOfMeasureConverter unitOfMeasureConverter = new UnitOfMeasureConverter();

        System.out.println(apricotJam3.qtyInGramsUsingIf("kg", 2.5f));
        System.out.println(apricotJam3.qtyInGramsUsingIf("micrograms", 1000));
        System.out.println(apricotJam3.qtyInGramsUsingIf(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty));
        System.out.println(apricotJam3.qtyInGramsUsingIf("grams", 125));

        int position = 789;
        if (position > 0 )
            System.out.println("Element found on position: " + position);
        else System.out.println("THERE IS NO ELEMENT!!!!");

        //Using simplified if
        System.out.println(position > 0 ? "Element found on position: " + position : "THERE IS NO ELEMENT!");

        String theMesssage = position > 0 ? "Element found on position: " + position : "THERE IS NO ELEMENT!"; //this is equivalent with below if else

        String theMessage2 = "";
        if (position > 0)
            theMessage2 = "Element found on position: " + position;
        else
            theMessage2 = "THERE IS NO ELEMENT!";
        System.out.println(theMessage2);

            System.out.println("----------------");
        System.out.println(apricotJam3.qtyInGramsUsingIfSimple("micrograms", 2500));
        System.out.println(apricotJam3.qtyInGramsUsingIfSimple(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty));
        System.out.println(apricotJam3.qtyInGramsUsingIfSimple("grams", 78));
        System.out.println(apricotJam3.qtyInGramsUsingIfSimple("fdsfsf", 4324324));
        System.out.println("----------------");

        System.out.println("--------------------------------------------");
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("micrograms", 2500));
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty));
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("grams", 78));
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("kdsuhfjsdf", 74328));
        System.out.println("--------------------------------------------");
    }

    @Test
    void eightTest () {
       for (int i = 0; i < 10; i++) {
           System.out.println(i);
       }

        System.out.println("--------------------");

       // numere divizibile cu 3 intre 0 si 21 (exclusiv)
        for (int  i=1; i < 21; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }

        System.out.println("--------------------");

        for (int i = 20; i > 0; i--) {
            if (i % 3 == 0)
                System.out.println(i);
        }

        System.out.println("--------------------");

        for (int i=3; i < 20; i+=3) {
            System.out.println(i);
        }

        System.out.println("--------------------");
        int i = 1;
        while (i < 21) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }


}


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApricotJamTest that = (ApricotJamTest) o;
        return aPositiveInt == that.aPositiveInt && Float.compare(that.aFloat, aFloat) == 0 && aBoolean == that.aBoolean && Objects.equals(aSweetener, that.aSweetener) && Objects.equals(new_Date, that.new_Date) && Objects.equals(apricotJam, that.apricotJam) && Objects.equals(apricotJam2, that.apricotJam2) && Objects.equals(apricotJam3, that.apricotJam3) && Objects.equals(melonJamRaureni, that.melonJamRaureni) && Objects.equals(apricotJam4, that.apricotJam4);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aPositiveInt, aFloat, aBoolean, aSweetener, new_Date, apricotJam, apricotJam2, apricotJam3, melonJamRaureni, apricotJam4);
    }
}
