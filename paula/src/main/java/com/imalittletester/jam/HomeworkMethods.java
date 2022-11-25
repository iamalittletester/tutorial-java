package com.imalittletester.jam;

public class HomeworkMethods {
    public boolean isProvidedDateTheLastDayOfMonth(String month, int day) {
        if ((month.toLowerCase().matches("january|march|may|july|august|october|december") && day == 31)
                || (month.toLowerCase().matches("april|june|september|november") && day == 30)
                || (month.equalsIgnoreCase("february") && (day == 28 || day == 29)))
            return true;
        else return false;
    }

    public int numberOfNumbersThatDivideBySeven(int max) {
        int contor = 0;
        for (int i = 1; i < max+1; i++) {
            if (i % 7 == 0)
                contor++;
        }
        return contor;
    }
}

