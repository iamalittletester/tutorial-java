package com.imalittletester;

import org.junit.jupiter.api.Test;

public class ControlStatementTest {

    public ControlStatements lastDay = new ControlStatements ();
    public ControlStatements numberOfSevens = new ControlStatements();

    @Test
    void monthTest (){
        System.out.println(lastDay.lastDayOfMonth("martie", 15, 2002));
        System.out.println("------------------------------------------------------------");
        System.out.println(lastDay.lastDayOfMonth("februarie", 28, 2021));
        System.out.println("------------------------------------------------------------");
        System.out.println("nr de zile divizibile cu 7 este " + numberOfSevens.numberOfNumbers(36));
    }
}
