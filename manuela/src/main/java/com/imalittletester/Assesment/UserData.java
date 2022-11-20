package com.imalittletester.Assesment;

import java.text.DecimalFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class UserData {
    public String userName;
    public Senzor senzor;
    public Calendar sleepTime;
    public Calendar wakeTime;

    public UserData(String userName, Senzor senzor, String sleepTime, String wakeTime) {
        this.userName = userName;
        this.senzor = senzor;
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("hh:mm", Locale.ENGLISH);
        try {
            cal.setTime(sdf.parse(sleepTime));
            this.sleepTime = cal;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        cal = Calendar.getInstance();
        try {
            cal.setTime(sdf.parse(wakeTime));
            this.wakeTime = cal;
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    public void afisajTotal() {
        this.senzor.createEventDataAndUomAndDataListRandom();
        System.out.println("Random By User: " + this.getCurrentDayStepCount());
        System.out.println(getCurrentDayDistance(Calendar.getInstance()));
        System.out.println(nrOfCaloriesCurrentDay());
        System.out.println(nrOfAlerts());
        distance7Days();

        System.out.println("----------------");
        this.senzor.createEventDataAndUomAndDataListSpecific();
        System.out.println("Specific By User: " + this.getCurrentDayStepCount());
        System.out.println(getCurrentDayDistance(Calendar.getInstance()));
        System.out.println(nrOfCaloriesCurrentDay());
        System.out.println(nrOfAlerts());
        distance7Days();
        DateAndHour();
    }

    public String getCurrentDayStepCount() {
        int totalSteps = this.senzor.getStepCountByDate(Calendar.getInstance());
        return "The user: " + userName + " did " + totalSteps + " steps until now.";
    }

    public String getCurrentDayDistance(Calendar date) {
        int stepsPerUom = 0;
        String uom = "";
        for (int i = 0; i < this.senzor.uomAndDateList.size(); i++) {
            if (date.get(Calendar.YEAR) == this.senzor.uomAndDateList.get(i).date.get(Calendar.YEAR) &&
                    date.get(Calendar.MONTH) == this.senzor.uomAndDateList.get(i).date.get(Calendar.MONTH) &&
                    date.get(Calendar.DATE) == this.senzor.uomAndDateList.get(i).date.get(Calendar.DATE)) {
                stepsPerUom = this.senzor.uomAndDateList.get(i).stepsPerUom;
                uom = this.senzor.uomAndDateList.get(i).uom;
                break;
            }
        }
        int todaySteps = this.senzor.getStepCountByDate(Calendar.getInstance());
        double distance = 1.0 * todaySteps / stepsPerUom;
        return "Today distance is: " + distance + " " + uom;
    }

    public String nrOfCaloriesCurrentDay() {
        int calories = 0;
        int todaySteps = this.senzor.getStepCountByDate(Calendar.getInstance());
        calories = (5 * todaySteps) / 1000;
        return "Today calories number is: " + calories;
    }

    public String nrOfAlerts() {

        Calendar cal = Calendar.getInstance();
        Map<Integer, Integer> stepsPerHour = new HashMap<>();
        for (int j = this.wakeTime.get(Calendar.HOUR_OF_DAY); j < this.sleepTime.get(Calendar.HOUR_OF_DAY); j++) {
            stepsPerHour.put(j, 0);
            for (int i = 0; i < this.senzor.eventDataList.size(); i++) {
                if (cal.get(Calendar.YEAR) == this.senzor.eventDataList.get(i).date.get(Calendar.YEAR) &&
                        cal.get(Calendar.MONTH) == this.senzor.eventDataList.get(i).date.get(Calendar.MONTH) &&
                        cal.get(Calendar.DATE) == this.senzor.eventDataList.get(i).date.get(Calendar.DATE)) {
                    if (j == this.senzor.eventDataList.get(i).date.get(Calendar.HOUR_OF_DAY)) {
                        int st = stepsPerHour.get(j);
                        st = st + this.senzor.eventDataList.get(i).steps;
                        stepsPerHour.put(j, st);
                    }
                }
            }
        }
        int alertNumber = 0;
        for (int i = this.wakeTime.get(Calendar.HOUR_OF_DAY); i < this.sleepTime.get(Calendar.HOUR_OF_DAY); i++) {
            if (stepsPerHour.get(i) == 0) {
                alertNumber++;
            }
        }

        return "The number of idle alerts for current day is: " + alertNumber;
    }

    public void distance7Days() {
        Calendar calendar = Calendar.getInstance();
        for (int j = 0; j < 7; j++) {
            Calendar cal2 = Calendar.getInstance();
            cal2.set(Calendar.DATE, calendar.get(Calendar.DATE) - j);
            int stepsPerUom = 0;
            String uom = "";
            for (int i = 0; i < this.senzor.uomAndDateList.size(); i++) {
                if (cal2.get(Calendar.YEAR) == this.senzor.uomAndDateList.get(i).date.get(Calendar.YEAR) &&
                        cal2.get(Calendar.MONTH) == this.senzor.uomAndDateList.get(i).date.get(Calendar.MONTH) &&
                        cal2.get(Calendar.DATE) == this.senzor.uomAndDateList.get(i).date.get(Calendar.DATE)) {
                    stepsPerUom = this.senzor.uomAndDateList.get(i).stepsPerUom;
                    uom = this.senzor.uomAndDateList.get(i).uom;
                    break;
                }
            }
            int todaySteps = this.senzor.getStepCountByDate(Calendar.getInstance());
            double distance = 0;
            if (stepsPerUom != 0) {
                distance = 1.0 * todaySteps / stepsPerUom;
            }
            String date = "";
            SimpleDateFormat format1 = new SimpleDateFormat("MMMM dd yyyy");
            String formatted = format1.format(cal2.getTime());
            System.out.println("On " + formatted + ", the distance is: " + distance + " " + uom);
        }
    }

    public void DateAndHour() {
        Calendar cal = Calendar.getInstance();
        SimpleDateFormat format1 = new SimpleDateFormat("MMMM dd yyyy, HH:mm");
        String formatted = format1.format(cal.getTime());
        System.out.println("Current Date And Time : " + formatted);
    }


}

