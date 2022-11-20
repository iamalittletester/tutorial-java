package com.imalittletester.Assesment;

import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.List;
import java.util.Random;

public class AssesmentTests {
    public UserData userData1 = new UserData("Manuela", new Senzor(null, null), "22:00", "06:00");
    @Test
    void stepsForCurrentDay (){
     userData1.afisajTotal();

    }
}
