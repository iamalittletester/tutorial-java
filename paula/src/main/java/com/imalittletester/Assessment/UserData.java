package com.imalittletester.Assessment;

import java.util.List;

public class UserData {
    int userPK;
    String uomDistance;
    List<String> stepsWithTimestamp;
    int sleepTime;
    int wakeTime;

    public UserData(int userPK, String uomDistance, List<String> stepsWithTimestamp, int sleepTime, int wakeTime) {
        this.userPK = userPK;
        this.uomDistance = uomDistance;
        this.stepsWithTimestamp = stepsWithTimestamp;
        this.sleepTime = sleepTime;
        this.wakeTime = wakeTime;
    }

    @Override
    public String toString() {
        return "UserData{" +
                "userPK='" + userPK + '\'' +
                ", uomDistance='" + uomDistance + '\'' +
                ", stepsWithTimestamp=" + stepsWithTimestamp +
                ", sleepTime=" + sleepTime +
                ", wakeTime=" + wakeTime +
                '}';
    }
}
