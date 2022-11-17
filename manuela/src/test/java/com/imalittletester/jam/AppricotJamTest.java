package com.imalittletester.jam;

import com.imalittletester.utils.UnitOfMeasureConverter;
import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;
//import java.io.File;
import java.sql.SQLOutput;
import java.util.*;

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
    public AppricotJam appricotJam3 = new AppricotJam("sugar cane", 1.5f, "kg", new ArrayList<>(), new Jar(30, 500));
    public AppricotJam appricotJamStevia = new AppricotJam("stevia", 1.5f, "kg", new ArrayList<>(), new Jar(30, 500));
    public AppricotJam appricotJamSucralose = new AppricotJam("sucralose", 1.5f, "kg", new ArrayList<>(), new Jar(30, 500));
    //initialized a new object of melonJam
    public MelonJam melonJam = new MelonJam("plain sugar", 10, "kg", new ArrayList<>(), new Bottle(20, 100));

    //homework with MAP
 List<Fruits> fruits = List.of();
public AppricotJam appricotJamTest = new AppricotJam ("sugar cane", 1.5f, "kg", List.of(new Fruits("appricot", 10, "kg")), new Jar(30, 500));
            //("sugar cane", 1.5f, "kg",  List<Fruits> fruits, new Jar(30, 500));

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

    //@Order(2)
//    @Test
//    void secondTest() {
//        appricotJam3.makeJam();
//        System.out.println(appricotJam3.sweetener);
//
//        appricotJam3.sweetener.contains("sugar");
//
//        melonJam.makeJam();
//
//    }

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

    @Order(4)
    @Test
    void fourthTest() {

        appricotJam3.makeJam();
        System.out.println("----------------------------------");
        appricotJamStevia.makeJam();
        System.out.println("----------------------------------");
        appricotJamSucralose.makeJam();
    }

    @Test
    void fiveTest() {
        //apelezi clasa UnitOfMeasureConverter
        // UnitOfMeasureConverter unitOfMeasureConverter = new UnitOfMeasureConverter();
        // System.out.println(unitOfMeasureConverter.qtyInGramsUsingIf2(appricotJam3.sweetenerUom, appricotJam3.sweetenerQty));

        System.out.println(appricotJam3.qtyInGramsUsingIf("kg", 2.5f));
        System.out.println(appricotJam3.qtyInGramsUsingIf("micrograms", 1000));
        double appricotJam3SweetenerQtyInGrams = appricotJam3.qtyInGramsUsingIf(appricotJam3.sweetenerUom, appricotJam3.sweetenerQty);
        System.out.println(appricotJam3SweetenerQtyInGrams);
        System.out.println((appricotJam3.qtyInGramsUsingIf("grams", 125)));

        int position = 789;
        if (position > 0) {
            System.out.println("Element found on position: " + position);
        } else {
            System.out.println("There is no element!!!");
        }

        //using simplified if
        System.out.println(position > 0 ? "Element found on position: " + position : "THERE IS NO ELEMENT!"); // e la fel ca if de sus
        String theMessage = position > 0 ? "Element found on position: " + position : "THERE IS NO ELEMENT!";
        System.out.println(theMessage);
        //last simplified if is equivalent to:
        String theMessage2 = "";
        if (position > 0) {
            theMessage2 = "Element found on position: " + position;
        } else theMessage2 = "THERE IS NO ELEMENT!";
        System.out.println(theMessage2);

        System.out.println("--------------------------");
        System.out.println(appricotJam3.qtyInGramsUsingIfSimple("micrograms", 2500));
        System.out.println(appricotJam3.qtyInGramsUsingIfSimple(appricotJam3.sweetenerUom, appricotJam3.sweetenerQty));
        System.out.println(appricotJam3.qtyInGramsUsingIfSimple("grams", 78));
        System.out.println(appricotJam3.qtyInGramsUsingSwitchSimple("gfgdfgfg", 12));
        System.out.println(appricotJam3.qtyInGramsUsingSwitch("grams", 23));
        System.out.println("--------------------------");
    }

    @Test
    void sixTest() {
//        for(int i = 0; i < 1; i++){
//            System.out.println(i);
//        }

        //numere divizibile cu 3 intre 0 si 21 (exclusiv)
        for (int i = 1; i < 21; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("-----------------");
        //pt for in for e nevoie ca contorul (variabila) sa fie diferita de cea din primul for
        for (int i = 21; i > 0; i--) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("--------------------------");
        for (int i = 3; i < 20; i += 3) {
            System.out.println(i);
        }

        System.out.println("-----------------------");

        int i = 7;
        while (i < 21) {
            if (i % 3 == 0) {
                System.out.println(i);
                break; //te scoate din while
            }
            i++;
        }

        System.out.println(("---------------------------"));
        int j = 1;
        do {
            if (j % 3 == 0) {
                System.out.println(j);
            }
            j++;
        }
        while (j < 21);

    }

    @Test
    void mapOfFruit() {
        //Nu am stiut cum sa adaug in initializarea unui obiect o lista ca sa pot testa "Create a new ApricotJam and calculate in the test class the cost of the fruit used for the jam"
        Map<String, Double> fruitPricePerKg = Map.of("appricot", 5.0, "peach", 3.5, "melon", 7.0);
       // List<Fruits> fruits = new ArrayList<>();
        //fruits.add(new Fruits("appricot", 25, "kg"));
        System.out.println(appricotJamTest.fruits.get(0).fruitsQty * fruitPricePerKg.get("appricot"));
    }


}
