package com.imalittletester;

import org.junit.jupiter.api.Test;

public class ControlStatementTest {

    public ControlStatements lastDay = new ControlStatements ();
    public ControlStatements numberOfSevens = new ControlStatements();

    @Test
    void monthTest (){
        System.out.println(lastDay.lastDayOfMonth("martie", 15));
        System.out.println("nr de zile divizibile cu 7 este " + numberOfSevens.numberOfNumbers(36));
    }
}
