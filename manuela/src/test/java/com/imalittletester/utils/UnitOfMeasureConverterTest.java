package com.imalittletester.utils;

import com.imalittletester.jam.AppricotJam;
import org.junit.jupiter.api.Test;

public class UnitOfMeasureConverterTest {

    public UnitOfMeasureConverter lastDayOfMonth = new UnitOfMeasureConverter(1);
    @Test
            public void firstTest(){

        System.out.println(lastDayOfMonth.lastDayOfProvidedMonth("Noiembrie", 31, 2022));
        System.out.println("-------------------------");
        System.out.println(lastDayOfMonth.lastDayOfProvidedMonth("Noiembrie", 30, 2022));
        System.out.println("-------------------------");
        System.out.println(lastDayOfMonth.lastDayOfProvidedMonth("Februarie", 28, 2022));
        System.out.println("-------------------------");
        System.out.println(lastDayOfMonth.lastDayOfProvidedMonth("Februarie", 29, 2022));
        System.out.println("-------------------------");
        System.out.println(lastDayOfMonth.divideBySeven(21));
        System.out.println(lastDayOfMonth.divideBySeven(14));
    }

}
