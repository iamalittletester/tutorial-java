package com.imalittletester.jam;

import org.junit.jupiter.api.Test;
//import java.io.File;
import java.util.Date;

public class AppricotJamTest {
    public int aPositiveInt = -10;
    public long aPositiveLong = -100000000;
    public float aFloat = 500;
    public double aDouble = -221211.556765746464564564564564645645632342435465564;
    public boolean aBoolean;
    public String aSweetener = "sugar cane";
    public Date new_Date;

    @Test
    void firstTest() {
        //sout+tab for print
        System.out.println(aPositiveInt);
//        System.out.println(aPositiveLong);
//        System.out.println(aFloat);
//        System.out.println(aDouble);
//        System.out.println(aBoolean);
        System.out.println(" --> " + aSweetener);
    }

}
