package com.imalittletester;

public class ControlStatements {

    public boolean lastDayOfMonth(String month, int day, int year) {
        switch (month) {
            case "ianuarie", "martie", "mai", "iulie", "august", "octombrie", "decembrie" -> {
                if (day == 31) {
                    return true;
                }
            }
            case "aprilie", "iunie", "septembrie", "noiembrie" -> {
                if (day == 30) {
                    return true;
                }
            }
            // ma mai gandesc penru februarie :)
            case "februarie" -> {
                if (year % 4 ==0) {
                    if (day == 29) {
                        return true;
                    }
                }
                else {
                    if (day == 28){
                        return true;
                    }
                }

            }
            default -> {return false;}
        }
        return false;
    }

    public double numberOfNumbers (int max){
        int j = 0;
        for (int i = 1; i < max; i++){
            if (i % 7 == 0) {
                j++;
            }
        }
        return j;
    }
}


