package com.imalittletester.jam;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.util.StringUtils;

import java.io.File;
import java.sql.Date;
import java.sql.SQLOutput;

public class ApricotJamTest {

    public int aPositiveInt = 10;
    public long aPositiveLong = 1000000000;
    public float aFloat = 500;
    public double aDouble = 1.5;
    public boolean aBoolean;
    public String aSweetener = "sugar cane";
    public File newFile;
    public Date newDate;

    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");

    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f, "kg", 10, "kg", new Jar (30, 500), true);



    public MelonJam melonJam = new MelonJam("plain sugar ",10,"kg ",10, "kg ",new Bottle(20,1000), false);


    @Test
    void fifthTest(){
        for(int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        System.out.println("-----------------------------------------------------------------------------");
        // nr divizibile cu 3 intre 0 si 21 exclusiv

        for (int i = 1; i< 21; i++){
            if (i % 3 ==0)
                System.out.println(i);
        }


        System.out.println("-----------------------------------------------------------------------------");


        for (int i = 20; i>0; i--){
            if (i % 3 ==0)
                System.out.println(i);
        }
        System.out.println("-----------------------------------------------------------------------------");

        for (int i=3; i<20; i+=3){
            System.out.println(i);
        }
        System.out.println("---------WHILE------------------------------------------------------------");

        int i=1;
        while (i<21){
            if (i % 3 ==0){
                System.out.println(i);
            }
            i++;
        }

        System.out.println("---------WHILE------------------------------------------------------------");

        int j = 7;
        while(j<21){
            if (j % 3 ==0){
                System.out.println(j);

            }
            break; //pt ca vrem sa iesim dinloop cand gasim primul numar ce ne inereseaza
        }
    }


//@Test
//    void fourthTest(){
//    System.out.println(apricotJam3. qtyInGramsUsingIf("kg", 2.5f));
//    System.out.println(apricotJam3. qtyInGramsUsingIf("micrograms", 1000));
//    System.out.println(apricotJam3. qtyInGramsUsingIf(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty));
//    System.out.println("----------------------------------------------------------------");
//    System.out.println("----------------------------------------------------------------");
//    System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("micrograms", 2500));
//    System.out.println(apricotJam3. qtyInGramsUsingSwitchSimple(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty));
//    System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("grams", 78));
//    System.out.println(apricotJam3.qtyInGramsUsingSwitchSimple("swrfwsfs", 782352));
//    System.out.println("----------------------------------------------------------------");


//    int position = 789;
//    if (position > 0)
//        System.out.println("element found on position: "+ position);
//    else System.out.println("there is no element");
//
//    // using simplified if
//    System.out.println(position >0 ? "element found on position: "+ position : "there is no element!");
//
//    String theMessage = position > 0? "element found on position: "+ position: "there is no element:";
//
//    //last simplified if is equivalent to :
//
//    String theMessage2 = "";
//    if (position<0)
//        theMessage2 = "Element found on postion: "+ position;
//    else theMessage2 = "there is no element";
//    System.out.println(theMessage2);
}

//    @Test
//    void thirdTest (){
//        /*apricotJam3.makeJam();
//        System.out.println("--------------------------------");
//        melonJam.makeJam();*/
//
//        System.out.println(apricotJam3.howManyFullJars(2300));
//        System.out.println(apricotJam3.remainderJam(2300));
//
//
//        System.out.println(apricotJam3.equals(apricotJam2));
//    }
//
//
//
//    @Test
//    void secondTest () {
//        System.out.println(apricotJam);
//
//        System.out.println(apricotJam2);
//
//        System.out.println(apricotJam3);
//
//        apricotJam3.makeJam();
//
//        melonJam.makeJam();
//    }
//
//  @Test
//   void firstTest () {
//
////        System.out.println(aPositiveInt);
////        System.out.println(aPositiveLong);
////        System.out.println(aFloat);
////        System.out.println(aDouble);
////        System.out.println(aBoolean);
////        System.out.println(aSweetener);
//    }
//}