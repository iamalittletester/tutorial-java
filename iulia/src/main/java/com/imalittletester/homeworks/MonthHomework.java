package com.imalittletester.homeworks;

public class MonthHomework {

    public boolean checkIfLastDayOfMonth(String monthName, int dayNumber) {
        boolean result;

        if (monthName.equals("April")|| monthName.equals("June")|| monthName.equals("September")|| monthName.equals("November")) {
            result = dayNumber ==30;
            return result;
        }
        if (monthName.equals("February")) {
            result = dayNumber==28;
        }
        else {
            result = dayNumber == 31;
        }
        return result;
    }
    public int countNumbersDivided(int maxLimit) {
        int count = 0;
        for (int i = 1; i <= maxLimit; i++) {
            if (i % 7 == 0)
            {
                count++;
            }
        }
        return count;
    }
    }


