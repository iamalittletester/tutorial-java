package com.imalittletester.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.spi.CalendarDataProvider;

public class UnitOfMeasureConverter {
    public int lastDayOfMonthDay;

    public UnitOfMeasureConverter(int lastDayOfMonthDay) {
        this.lastDayOfMonthDay = lastDayOfMonthDay;

    }

    public double qtyInGramsUsingIf2(String uom, double qty) {
        double mustMultipleBy = 1;
        //equalsIgnoreCase - nu tine cont de uppercase sau lowercase
        if (uom.equalsIgnoreCase("kg") || uom.equalsIgnoreCase("kilograms")) {
            mustMultipleBy = 1000;
        }
        if (uom.equalsIgnoreCase("micrograms")) {
            mustMultipleBy = 0.0001;
        }
        return qty * mustMultipleBy;
    }

    public boolean lastDayOfProvidedMonth(String month, int day, int year) {
        switch (month) {
            case "Ianuarie", "Martie", "Mai", "Iulie", "August", "Octombrie", "Decembrie" -> {
                if (day == 31) {
                    return true;
                }
            }
            case "Aprilie", "Iunie", "Septembrie", "Noiembrie" -> {
                if (day == 30) {
                    return true;
                }
            }
            case "Februarie" -> {
                if ((year % 4 == 0 && day == 29) || (year % 4 != 0 && day == 28)) {
                    return true;
                }
            }
            default ->{return false;}
        }
        return false;
    }
    public int divideBySeven(int providedNumber){
        int j=0;
        for(int i =1; i<= providedNumber; i++){
            if(i%7==0){
                j++;
            }
        }
        return j;
    }

}
