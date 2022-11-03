package com.imalittletester.jam;

import com.imalittletester.utils.UnitOfMeasureConverter;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

import java.io.File;
import java.util.Date;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class ApricotJamTest {
    public int aPositiveInt = -10;
    public long aPositiveLong = -100000000;
    public float aFloat = 500;
    public double aDouble = -221211.556765746464564564564564645645632342435465564;
    public boolean aBoolean;
    public String aSweetener = "sugar cane";
    public Date new_Date;

    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");
    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f, "kg", 10, "kg", 30, 500, true);
    public ApricotJam apricotJam4 = new ApricotJam("sugar cane", 1.5f, "kg", 10, "kg", 30, 500, true);

    public MelonJam melonJam = new MelonJam("plain sugar", 10, "kg", 10, "kg", new Bottle(20, 1000), false);

    @Test
    void fifthTest() {
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        //
        System.out.println("--------------------------");

        //numere divizibile cu 3 intre 0 si 21 (exclusiv)
        for(int i=1; i < 21; i++) {
            if (i % 3 == 0)
                System.out.println(i);
        }

        System.out.println("-------------------------");
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
//            i++;
        }
    }

    @Test
    void fourthTest() {
        UnitOfMeasureConverter unitOfMeasureConverter = new UnitOfMeasureConverter();

        System.out.println(unitOfMeasureConverter.qtyInGramsUsingIf("kg", 1234));
        System.out.println(unitOfMeasureConverter.qtyInGramsUsingIf(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty));

        System.out.println(apricotJam3.qtyInGramsUsingIf("kg", 2.5f));
        System.out.println(apricotJam3.qtyInGramsUsingIf("micrograms", 1000));
        double apricotJam3SweeetenerQtyInGrams = apricotJam3.qtyInGramsUsingIf(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty);
        System.out.println(apricotJam3SweeetenerQtyInGrams);
        System.out.println(apricotJam3.qtyInGramsUsingIf("grams", 125));

        System.out.println("--------------------------------------------");
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("micrograms", 2500));
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty));
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("grams", 78));
        System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("kdsuhfjsdf", 74328));
        System.out.println("--------------------------------------------");

        int position = 789;

        if (position > 0)
            System.out.println("Element found on position: " + position);
        else System.out.println("THERE IS NO ELEMENT!!!!!");

        //using simplified if
        System.out.println(position > 0 ? "Element found on position: " + position : "THERE IS NO ELEMENT!");

        String theMessage = position > 0 ? "Element found on position: " + position : "THERE IS NO ELEMENT!";
        System.out.println("theMessage = " + theMessage);

        //last simplified if is equivalent to:
        String theMessage2 = "";
        if (position > 0)
            theMessage2 = "Element found on position: " + position;
        else theMessage2 = "THERE IS NO ELEMENT!";
        System.out.println(theMessage2);

    }

    @Order(1)
    @Test
    void thirdTest() {
//        apricotJam3.makeJam();
//        System.out.println(apricotJam3.getSweetener());
//        apricotJam3.setSweetener(aSweetener);
//        System.out.println(apricotJam3.getSweetener());
//        System.out.println("---------------------");
//        melonJam.makeJam();

        System.out.println(apricotJam3.howManyFullJars(2300));
        System.out.println(apricotJam3.remainderJam(2300));
        System.out.println(apricotJam3.equals(apricotJam2));
        System.out.println(apricotJam3.equals(apricotJam4));
    }

    @Order(2)
    @Test
    void secondTest() {
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
//        System.out.println(aPositiveInt);
//        System.out.println(aPositiveLong);
//        System.out.println(aFloat);
//        System.out.println(aDouble);
//        System.out.println(aBoolean);
        System.out.println(" --> " + aSweetener);
    }
}
