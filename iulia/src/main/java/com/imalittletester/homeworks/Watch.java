package com.imalittletester.homeworks;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Watch {
    public String timeStamp;
    public double stepsToday;
    public double stepsThisWeek;
    public float distanceToday;
    public String distanceUom;
    public int calories;
    public Date currentTime;
    public int idleAlerts;
    public float distanceThisWeek;
    public int hour;
    private int anInt;

    public Watch(String timestamp, double stepsToday, double stepsThisWeek, String distanceUom, int calories, Date currentTime, int idleAlerts, int hour) {
        this.timeStamp = timestamp;
        this.stepsToday = stepsToday;
        this.stepsThisWeek = stepsThisWeek;
        this.distanceUom = distanceUom;
        this.calories = calories;
        this.currentTime = currentTime;
        this.idleAlerts = idleAlerts;
        this.hour = hour;
    }

    public double unitConvertorForOneDay() {
        double distanceToday = stepsToday;
        if (distanceUom.equalsIgnoreCase("km")) {
            return stepsToday / 1408;
        }
        if (distanceUom.equalsIgnoreCase("miles")) {
            return stepsToday / 2000;
        }
        return distanceToday;
    }

    public double unitConvertorForOneWeek() {
        double distanceThisWeek = stepsThisWeek;
        if (distanceUom.equalsIgnoreCase("km")) {
            return stepsThisWeek / 1408;
        }
        if (distanceUom.equalsIgnoreCase("miles")) {
            return stepsThisWeek / 2000;
        }
        return stepsThisWeek;
    }

    public int idleAlerts() {
        anInt = hour;
        if (anInt >= 06) {
            return idleAlerts;
        } else {
            return 0;
        }
    }
    public void getWatchData() {
        System.out.println("Number of steps until: " + timeStamp + " is: " + stepsToday);
        System.out.println("Calories burned: " + calories);
        System.out.println("Distance today: " + unitConvertorForOneDay() + " " + distanceUom);
        System.out.println("Distance this week: " + unitConvertorForOneWeek()+" " + distanceUom);
        System.out.println("Current date: " + currentTime);
        System.out.println("Number of idle alerts: " + idleAlerts());
    }
}
