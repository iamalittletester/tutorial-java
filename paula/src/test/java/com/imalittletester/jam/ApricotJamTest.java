package com.imalittletester.jam;

import com.imalittletester.utils.UnitOfMeasureConverter;
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
    void secondTest() {
        apricotJam3.makeJam();
        System.out.println("-----");
        melonJam.makeJam();

        System.out.println(apricotJam3.getSweetener());
        apricotJam3.setSweetener("stevia");
        System.out.println(apricotJam3.getSweetener());

    }

    @Test
    void thirdTest() {
        // test Homework 5
        apricotJam3.makeJam();
        System.out.println();
        melonJam.makeJam();
    }

    @Test
    void testCourse4() {
        System.out.println(apricotJam3.howManyFullJars(2300));
        System.out.println(apricotJam3.remainderJam(2300));
        System.out.println(apricotJam3.equals(apricotJam4));
    }

    @Test
    void testHomework4() {
        System.out.println("sweetener: " + apricotJam4.sweetener + ", is dietetic? " + apricotJam4.isDietetic);
        System.out.println("sweetener: " + apricotJam5.sweetener + ", is dietetic? " + apricotJam5.isDietetic);
        System.out.println("sweetener: " + apricotJam6.sweetener + ", is dietetic? " + apricotJam6.isDietetic);
        System.out.println("sweetener: " + melonJam.sweetener + ", is dietetic? " + melonJam.isDietetic);
        System.out.println("sweetener: " + melonJam2.sweetener + ", is dietetic? " + melonJam2.isDietetic);
    }

    @Test
    void fourthTest() {
        UnitOfMeasureConverter unitOfMeasureConverter = new UnitOfMeasureConverter();
        System.out.println(unitOfMeasureConverter.qtyInGramsUsingIf("kg", 1234));
        System.out.println(unitOfMeasureConverter.qtyInGramsUsingIf(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty));

        System.out.println(apricotJam3.qtyInGramsUsingIf("kg", 2.5f));
        System.out.println(apricotJam3.qtyInGramsUsingIf("micrograms", 1500));
        double apricotJam4SweetenerQtyInGrams = apricotJam3.qtyInGramsUsingIf(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty);

        System.out.println("---------------------------------------");
        System.out.println(apricotJam3.qtyInGramsUsingSwitch("micrograms", 2500));
        System.out.println(apricotJam3.qtyInGramsUsingSwitch(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty));
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("grams", 78));
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("skfow3u4pdskc", 78));
        System.out.println("---------------------------------------");


        int position = 789;
        if (position > 0)
            System.out.println("Element found on position:" + position);
        else System.out.println("There is no element");

        System.out.println(position > 0 ? "Element found on position: " + position : "There is no element");


        String theMessage = position > 0 ? "Element found on position: " + position : "There is no element";
        System.out.println("theMessage = " + theMessage);

        String theMessage2 = "";
        if (position > 0)
            theMessage2 = "Element found on position:" + position;
        else theMessage2 = "There is no element";
        System.out.println("theMessage2 = " + theMessage2);

    }

    @Test
    void fifthTest() {
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("--------------------------");

        for (int i = 1; i<21; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------------");

        for(int i = 20; i > 0; i--) {
            if (i % 3 == 0)
                System.out.println(i);
        }
        System.out.println("--------------------------");

        for (int i=3; i < 20; i+=3) {
            System.out.println(i);
        }
        System.out.println("-----------------");

        int i = 1;
        while (i < 21) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
            i++;
        }


    }

}