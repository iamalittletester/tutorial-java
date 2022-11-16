package com.imalittletester.jam;

import com.imalittletester.utils.LastDayOfMonth;
import org.junit.jupiter.api.Test;

public class LastDayOfMonthTest {

    @Test
    void fourthTest() {
        System.out.println(LastDayOfMonth.isLastDayOfMonth("December", 30));

    }

    public static class HomeworkMethodsTest {
        LastDayOfMonth.HomeworkMethods h1 = new LastDayOfMonth.HomeworkMethods();

        @Test
        public void fifthTest() {
            System.out.println(h1.numberOfNumbersThatDivideBySeven(49));
        }
    }
}