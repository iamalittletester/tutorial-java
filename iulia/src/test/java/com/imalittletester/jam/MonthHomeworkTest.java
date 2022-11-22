package com.imalittletester.jam;

import com.imalittletester.homeworks.MonthHomework;
import org.junit.jupiter.api.Test;

import java.sql.SQLOutput;

public class MonthHomeworkTest {

    @Test
    void LastDayOfTheMonth() {
        MonthHomework monthHomework = new MonthHomework();
        System.out.println(monthHomework.checkIfLastDayOfMonth("April", 28));
        System.out.println(monthHomework.checkIfLastDayOfMonth("September", 30));
        System.out.println(monthHomework.checkIfLastDayOfMonth("July", 31));
        System.out.println(monthHomework.checkIfLastDayOfMonth("August", 26));
        System.out.println(monthHomework.checkIfLastDayOfMonth("February", 28));
        System.out.println(monthHomework.checkIfLastDayOfMonth("February", 24));

    }

    @Test
    void numbersDivideBy7() {
        for (int n = 1; n < 222; n++) {
            if (n % 7 == 0)
                System.out.println(n);
        }
    }

    @Test
    void numbersDivide() {
        for (int i = 1; i <= 222; i++) {
            if (i / 7 == 1)
                System.out.println(i);
        }
    }

    //@Test
    //void numbersDivideSeven(){
    //for (int totalNumber = 222; totalNumber < 0; totalNumber++) {
    //if (totalNumber % 7==0)
    @Test
    void testTen (){
            MonthHomework monthHomework = new MonthHomework();
        System.out.println(monthHomework.countNumbersDivided(35));
        }


    }







