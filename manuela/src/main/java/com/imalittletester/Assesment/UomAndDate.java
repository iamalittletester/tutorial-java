package com.imalittletester.Assesment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class UomAndDate {
    public String uom;
    public Calendar date;
    public int stepsPerUom;

    public UomAndDate(String uom, Calendar date, int stepsPerUom) {
        this.uom = uom;
        this.date = date;
        this.stepsPerUom = stepsPerUom;
    }

    public UomAndDate(String uom, String date, int stepsPerUom) {
        this.uom = uom;
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm", Locale.ENGLISH);
        try {
            cal.setTime(sdf.parse(date));
            this.date = cal;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        this.stepsPerUom = stepsPerUom;
    }
}
