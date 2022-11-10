package com.imalittletester.homework;

public class Homework {

    public boolean isLastDayOfMonth(String month, int day) {
        switch (month) {
            case "january", "march", "may", "july", "august", "october", "december" -> {
                return day == 31;
            }
            case "april", "june", "september", "november" -> {
                return day == 30;
            }
            case "february" -> {
                return day == 28;
            }
            default -> {return false;}
        }
    }


    public int getNumberOfNumbers(int max){
        int count = 0;
        //numere divizibile cu 7
        for (int i = 1; i <= max; i++) {
            if (i % 7 == 0)
                count++;
        }
        return count;
    }


}
