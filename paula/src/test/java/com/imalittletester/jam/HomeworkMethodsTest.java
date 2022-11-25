package com.imalittletester.jam;

import org.junit.jupiter.api.Test;

public class HomeworkMethodsTest {
    HomeworkMethods h1 = new HomeworkMethods();

    @Test
    public void firstTest(){
        System.out.println(h1.isProvidedDateTheLastDayOfMonth("January",31));
        System.out.println(h1.isProvidedDateTheLastDayOfMonth("february", 28));
        System.out.println(h1.isProvidedDateTheLastDayOfMonth("mArCh",30));

        System.out.println("------------------------------------------------");

        System.out.println(h1.numberOfNumbersThatDivideBySeven(49));
    }
}
