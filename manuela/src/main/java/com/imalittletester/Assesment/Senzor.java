package com.imalittletester.Assesment;

import java.util.*;

public class Senzor {
    public List<EventData> eventDataList;
    public List<UomAndDate> uomAndDateList;

    public Senzor(List<EventData> eventDataList, List<UomAndDate> uomAndDateList) {
        this.eventDataList = eventDataList;
        this.uomAndDateList = uomAndDateList;
    }

    public int getStepCountByDate(Calendar date) {
        int stepCount = 0;
        for (int i = 0; i < eventDataList.size(); i++) {
            if (date.get(Calendar.YEAR) == eventDataList.get(i).date.get(Calendar.YEAR) &&
                    date.get(Calendar.MONTH) == eventDataList.get(i).date.get(Calendar.MONTH) &&
                    date.get(Calendar.DATE) == eventDataList.get(i).date.get(Calendar.DATE) &&
                    eventDataList.get(i).date.before(date)) {
                stepCount = stepCount + eventDataList.get(i).steps;
            }
        }
        return stepCount;
    }

    public void createEventDataAndUomAndDataListRandom() {
        this.eventDataList = new ArrayList<>();
        this.uomAndDateList = new ArrayList<>();
        Calendar date = Calendar.getInstance();
        Random rn = new Random();
        for (int day = 0; day <= 14; day++) {
            for (int hour = 0; hour <= 23; hour++) {
                for (int minute = 0; minute <= 59; minute++) {
                    int steps = rn.nextInt(20 - 1 + 1) + 1;
                    Calendar date1 = Calendar.getInstance();
                    date1.set(Calendar.DATE, date.get(Calendar.DATE) - day);
                    date1.set(Calendar.HOUR, hour);
                    date1.set(Calendar.MINUTE, minute);
                    date1.set(Calendar.SECOND, 0);
                    date1.set(Calendar.MILLISECOND, 0);
                    date1.set(Calendar.MONTH, date.get(Calendar.MONTH));
                    date1.set(Calendar.YEAR, date.get(Calendar.YEAR));
                    eventDataList.add(new EventData(steps, date1));
                }
            }
            Calendar date2 = Calendar.getInstance();
            date2.set(Calendar.DATE, date.get(Calendar.DATE) - day);
            date2.set(Calendar.SECOND, 0);
            date2.set(Calendar.MILLISECOND, 0);
            date2.set(Calendar.MONTH, date.get(Calendar.MONTH));
            date2.set(Calendar.YEAR, date.get(Calendar.YEAR));
            if (day % 2 == 0) {
                uomAndDateList.add(new UomAndDate("km", date2, 1000));
            } else {
                uomAndDateList.add(new UomAndDate("mi", date2, 1600));
            }
        }
    }

    public void createEventDataAndUomAndDataListSpecific() {
        this.eventDataList = new ArrayList<>();
        this.uomAndDateList = new ArrayList<>();

        uomAndDateList.add(new UomAndDate("km", "11-21-2022 15:12", 1000));
        uomAndDateList.add(new UomAndDate("km", "11-22-2022 15:12", 1000));
        uomAndDateList.add(new UomAndDate("mi", "11-23-2022 15:12", 1600));
        uomAndDateList.add(new UomAndDate("mi", "11-20-2022 15:12", 1600));
        uomAndDateList.add(new UomAndDate("mi", "11-19-2022 15:12", 1600));
        eventDataList.add(new EventData(11, "11-23-2022 09:12"));
        eventDataList.add(new EventData(1000, "11-23-2022 12:12"));
        eventDataList.add(new EventData(1000, "11-23-2022 14:12"));
        eventDataList.add(new EventData(11, "11-23-2022 18:12"));
        eventDataList.add(new EventData(22, "11-23-2022 21:12"));
        eventDataList.add(new EventData(1000, "11-22-2022 07:12"));
        eventDataList.add(new EventData(500, "11-22-2022 11:12"));
        eventDataList.add(new EventData(4000, "11-22-2022 15:12"));
        eventDataList.add(new EventData(22, "11-22-2022 21:59"));
        eventDataList.add(new EventData(11, "11-21-2022 11:12"));
        eventDataList.add(new EventData(55, "11-21-2022 21:59"));
        eventDataList.add(new EventData(7000, "11-21-2022 13:12"));
        eventDataList.add(new EventData(11, "11-20-2022 15:12"));
        eventDataList.add(new EventData(11, "11-20-2022 10:13"));
        eventDataList.add(new EventData(55, "11-19-2022 15:12"));
        eventDataList.add(new EventData(12, "11-19-2022 17:13"));
        eventDataList.add(new EventData(11, "11-19-2022 19:14"));
        eventDataList.add(new EventData(11, "11-19-2022 20:14"));

    }
}
