package com.imalittletester.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class LastDayOfMonth {

    String month;
    int day;
    static GregorianCalendar calendar = new GregorianCalendar();

    public static boolean isLastDayOfMonth(String month, int day) {
        try {
            int monthAsInt = getNumberFromMonthName(month, Locale.getDefault());
            calendar.set(Calendar.MONTH, monthAsInt);
            calendar.set(Calendar.DAY_OF_MONTH, day);
            if (day == calendar.getActualMaximum(Calendar.DAY_OF_MONTH)) {
                return true;
            } else return false;
        } catch (ParseException e) {
            return false;
        }
    }

    public static int getNumberFromMonthName(String monthName, Locale locale) throws ParseException {
        Date date = new SimpleDateFormat("MMM", locale).parse(monthName);  // formatezi string-ul ca si data
        //inteleasa de calendar
        Calendar cal = Calendar.getInstance();   // creezi un obiect calendar caruia ii setezi luna obtinuta dupa formatare
        cal.setTime(date);
        return cal.get(Calendar.MONTH);  //returneaza ordinea corespunzatoare lunii in an

    }

    //another method

    public static class HomeworkMethods {
        public boolean isProvidedDateTheLastDayOfMonth(String month, int day) {
            if ((month.toLowerCase().matches("january|march|may|july|august|october|december") && day == 31)
                    || (month.toLowerCase().matches("april|june|september|november") && day == 30)
                    || (month.equalsIgnoreCase("february") && (day == 28 || day == 29)))
                return true;
            else return false;
        }

        public int numberOfNumbersThatDivideBySeven(int max) {
            int contor = 0;
            for (int i = 1; i < max + 1; i++) {
                if (i % 7 == 0)
                    contor++;
            }
            return contor;
        }
    }
}