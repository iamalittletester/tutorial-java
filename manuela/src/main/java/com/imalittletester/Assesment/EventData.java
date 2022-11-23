package com.imalittletester.Assesment;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Locale;

public class EventData {
    public int steps;
    public Calendar date;

    public EventData(int steps, Calendar date) {
        this.steps = steps;
        this.date = date;
    }

    public EventData(int steps, String date) {
        this.steps = steps;
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("MM-dd-yyyy hh:mm", Locale.ENGLISH);
        try {
            cal.setTime(sdf.parse(date));
            this.date = cal;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
