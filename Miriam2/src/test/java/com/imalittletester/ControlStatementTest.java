package com.imalittletester;

import com.imalittletester.jam.ApricotJam;
import com.imalittletester.jam.Jar;
import org.junit.jupiter.api.Test;

public class ControlStatementTest {

    public ControlStatements lastDay = new ControlStatements ();
    public ControlStatements numberOfSevens = new ControlStatements();
    public ApricotJam apricotJamDietetic = new ApricotJam("sugar cane", 1.5f, "kg", 10, "kg", new Jar(30, 500), true);

    @Test
    void monthTest (){
        System.out.println(lastDay.lastDayOfMonth("martie", 31, 2002));
        System.out.println("------------------------------------------------------------");
        System.out.println(lastDay.lastDayOfMonth("februarie", 28, 2021));
        System.out.println("------------------------------------------------------------");
        System.out.println("nr de zile divizibile cu 7 este " + numberOfSevens.numberOfNumbers(36));
        System.out.println("------------------------------------------------------------");
        apricotJamDietetic.makeJam();
    }
}
