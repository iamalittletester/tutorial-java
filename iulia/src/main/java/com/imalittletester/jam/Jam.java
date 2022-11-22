package com.imalittletester.jam;

import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Jam {

    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;
    public boolean isDietetic;
    public Jar jar;

    List<Fruit> fruits = new ArrayList<>();

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom, boolean isDietetic, Jar jar) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.isDietetic = isDietetic;
        this.jar = jar;
    }

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom, boolean isDietetic, Jar jar, List<Fruit> fruits) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.isDietetic = isDietetic;
        this.jar = jar;
        this.fruits = fruits;
    }

    public Jam() {
    }
    public Jam(String sweetener) {
        this.sweetener = sweetener;
    }
    public Jam(String sweetener, float sweetenerQty, String sweetenerUom) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.isDietetic = isDietetic;
        this.isDietetic = sweetener.equals("sucralose")|| sweetener.equals("stevia");
    }

    public void makeJam() {
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " " + "of " + sweetener);
        System.out.println("Is jam dietetic? " + isDietetic);
        System.out.println(isDietetic ? "Is jam dietetic? Yes" : "Is jam dietetic? No");
    }

    public int howManyFullJars (int jamQtyInGrams) {
        return jamQtyInGrams / jar.jarCapacity;
    }
    public int remainderJam (int jamQtyInGrams) {
        return jamQtyInGrams % jar.jarCapacity;
    }

    //ifs
    public double qtyGramsUsingIf(String uom, double qty) {
        double mustMultiplyBy = 1;
        if (uom.equalsIgnoreCase( "kg")|| uom.equalsIgnoreCase("kilograms")) {
            mustMultiplyBy = 1000;
        }
        if (uom.equalsIgnoreCase("micrograms")) {
            mustMultiplyBy = 0.0001;
        }
        return qty * mustMultiplyBy;
    }

    public double qtyInGramsUsingIfSimple (String uom, double qty) {
        if (uom.equalsIgnoreCase("kg") || uom.equalsIgnoreCase("kilograms")) {
            return qty * 1000;
        }
        if (uom.equalsIgnoreCase("micrograms")) {
            return qty / 1000;
        }
        return qty;
    }

    public double qtyInGramsUsingSwitch (String uom, double qty) {
        double valueToReturn = 0;
        switch (uom.toLowerCase()) {
            case "kg", "kilograms" -> {valueToReturn = qty * 1000;}
            case "grams" -> {valueToReturn = qty;}
            case "micrograms" -> {valueToReturn = qty/100;}
        }
        return valueToReturn;
    }
    //simple switch
    public double qtyInGramsUsingSwitchSimple (String uom, double qty) {
        switch (uom.toLowerCase()) {
            case "kg", "kilograms" -> {return qty * 1000;}
            case "grams" -> {return qty;}
            case "micrograms" -> {return qty/100;}
            default -> {return 0;}
        }
    }
}


