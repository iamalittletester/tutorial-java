package com.imalittletester.Assessment;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

public class DataProcessor {

    public UserData user;

    public DataProcessor(UserData user) {
        this.user = user;
    }

    //returneaza o lista cu toti pasii facuti astazi.
    public List<String> listOfToday() {
        String[] output;
        List<String> listOfToday = new ArrayList<>();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyddMM");
        String date = LocalDateTime.now().format(formatter);

        for (int i = 0; i < user.stepsWithTimestamp.size(); i++) {
            output = user.stepsWithTimestamp.get(i).split("-");
            if (date.equals(output[1].substring(0, 8))) {
                listOfToday.add(user.stepsWithTimestamp.get(i));
            }
        }
        return listOfToday;
    }

    // returneaza numarul total de pasi facuti astazi.
    public int calculateNumberOfSteps() {
        String[] output;
        int numberofSteps = 0;

        for (int i = 0; i < listOfToday().size(); i++) {
            output = listOfToday().get(i).split("-");
            numberofSteps += Integer.parseInt(output[0]);
        }
        return numberofSteps;
    }


    // returneaza distanta parcursa astazi
    // in medie un pas reprezinta 70 cm = 0.0007 km
    public double distanceUom() {
        double distanceInKm = calculateNumberOfSteps() * 0.0007;
        if (user.uomDistance.equalsIgnoreCase("km")) {
            return distanceInKm;
        } else return distanceInKm * 0.621371;
    }

    public double distanceUomLast7Days() {
        String[] output;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyyddMM");
        int numberofStepsLast7Days = 0;
        double distanceInKm;

        for (int i = 0; i < user.stepsWithTimestamp.size(); i++) {
            output = user.stepsWithTimestamp.get(i).split("-");
            if (LocalDateTime.now().format(formatter).equals(output[1].substring(0, 8)) ||
                    LocalDateTime.now().minusDays(1).format(formatter).equals(output[1].substring(0, 8)) ||
                    LocalDateTime.now().minusDays(2).format(formatter).equals(output[1].substring(0, 8)) ||
                    LocalDateTime.now().minusDays(3).format(formatter).equals(output[1].substring(0, 8)) ||
                    LocalDateTime.now().minusDays(4).format(formatter).equals(output[1].substring(0, 8)) ||
                    LocalDateTime.now().minusDays(5).format(formatter).equals(output[1].substring(0, 8)) ||
                    LocalDateTime.now().minusDays(6).format(formatter).equals(output[1].substring(0, 8))) {
                numberofStepsLast7Days += Integer.parseInt(output[0]);
            }
        }
        distanceInKm = numberofStepsLast7Days * 0.0007;
        if (user.uomDistance.equalsIgnoreCase("km")) {
            return distanceInKm;
        } else return distanceInKm * 0.621371;
    }

    // returneaza numarul total de calorii pierdute astazi.
    public int calculateCalories() {
        // Most people burn around 3 calories per 100 steps
        int calories = 0;
        int threshold = 100;
        int contor = 0;
        while (contor == 0) {
            if (calculateNumberOfSteps() > threshold) {
                threshold += 100;
                calories += 3;
            } else contor = 1;
        }
        return calories;
    }

    // returneaza numarul de alerte, in functie de ora de culcare si ora de trezire a user-ului
    public int numberOfIdleAlerts() {
        int idleAlerts = 0;
        int awakeInt = user.wakeTime;
        int sleepInt = user.sleepTime;
        String awakeString;
        String[] output;

        if (user.sleepTime == 0) {
            sleepInt = 24;
        }
        for (int i = 0; i < (sleepInt - user.wakeTime); i++) {
            if (awakeInt < 10) {
                awakeString = "0" + awakeInt;
            } else awakeString = Integer.toString(awakeInt);
            if (listOfToday().size() == 0) {
                awakeInt++;
                idleAlerts++;
            }
            for (int j = 0; j < listOfToday().size(); j++) {
                output = listOfToday().get(j).split("-");
                if (awakeString.equals(output[1].substring(8, 10))) {
                    awakeInt++;
                    break;
                } else if (j == listOfToday().size() - 1) {
//                    System.out.println("nu s a gasit activitate la ora "+ awakeString);
                    awakeInt++;
                    idleAlerts++;
                }
            }
        }
        return idleAlerts;
    }


    public void display() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy, HH:mm:ss");
        System.out.println("Today's Date and Current Time " + LocalDateTime.now().format(formatter));
        System.out.println("Total Steps for today: " + calculateNumberOfSteps());
        System.out.println("Total Distance for today: " + String.format("%.2f", distanceUom()) + " " + user.uomDistance);
        System.out.println("Total Calories Burned for today: " + calculateCalories());
        System.out.println("Total Idle Alarms for today: " + numberOfIdleAlerts());
        System.out.println("Total Distance for the Last 7 Days: " + String.format("%.2f", distanceUomLast7Days()) + " " + user.uomDistance);
    }

}

