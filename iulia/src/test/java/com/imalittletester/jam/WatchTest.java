package com.imalittletester.jam;

import com.imalittletester.homeworks.Watch;
import org.junit.jupiter.api.Test;

import java.sql.Timestamp;
import java.util.Date;

public class WatchTest {

    public Watch watchData1 = new Watch("2022-11-17 12:23",3555,50000,"km",345,new Date(2022,18,17),5,12);
    public Watch watchData2 = new Watch("2022-11-17 13:45",3555,50000,"miles",345,new Date(2022,18,17),5,13);
    public Watch watchData3 = new Watch("2022-11-17 20:30",5096,54848,"km",567,new Date(2022,18,17),5,05);


    @Test
    void firstTest() {
        watchData1.getWatchData();
        System.out.println("---------------------");
        watchData2.getWatchData();
        System.out.println("---------------------");
        watchData3.getWatchData();
    }

}


