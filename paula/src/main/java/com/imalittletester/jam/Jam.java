package com.imalittletester.jam;

import java.util.Objects;

public class Jam {
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;
    public boolean isDietetic;

    //Homework 3
    // my idea for "Consider the types of fruit
    // used for each jam. Is there a way to extract
    // fruit information into the Jam class? What
    // changes should be made?"
    public String fruit;
    public float fruitQty;
    public String fruitUom;

    public Jam() {
    }

    public Jam(String sweetener) {
        this.sweetener = sweetener;
    }

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom, String fruit, float fruitQty, String fruitUom) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        // toLowerCase().equals() can be replaced with equalsIgnoreCase() (HW 4)
        this.isDietetic = ((this.sweetener.toLowerCase().equals("stevia")) || (this.sweetener.equalsIgnoreCase("sucralose")));
        // fruit information
        this.fruit = fruit;
        this.fruitQty = fruitQty;
        this.fruitUom = fruitUom;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jam jam = (Jam) o;
        return Float.compare(jam.sweetenerQty, sweetenerQty) == 0 && isDietetic == jam.isDietetic && Float.compare(jam.fruitQty, fruitQty) == 0 && Objects.equals(sweetener, jam.sweetener) && Objects.equals(sweetenerUom, jam.sweetenerUom) && Objects.equals(fruit, jam.fruit) && Objects.equals(fruitUom, jam.fruitUom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetener, sweetenerQty, sweetenerUom, isDietetic, fruit, fruitQty, fruitUom);
    }

    public void makeJam() {
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        System.out.println("Adding " + fruitQty + " " + fruitUom + " of " + fruit);
        System.out.println("Is jam dietetic? " + (isDietetic ? "Yes" : "No"));
    }

    public double qtyInGramsUsingIf(String uom, double qty) {
        double mustMultiplyBy = 1;
        if (uom.equalsIgnoreCase("kg") || uom.equalsIgnoreCase("kilograms")) {
            mustMultiplyBy = 1000;
        }
        if (uom.equalsIgnoreCase("micrograms")) {
            mustMultiplyBy = 0.001;
        }
        return qty * mustMultiplyBy;
    }

    public double qtyInGramsUsingIfSimple(String uom, double qty) {
        if (uom.equalsIgnoreCase("kg") || uom.equalsIgnoreCase("kilograms")) {
            return qty * 1000;
        }
        if (uom.equalsIgnoreCase("micrograms")) {
            return qty / 1000;
        }
        return qty;
    }

    public double qtyInGramsUsingSwitch(String uom, double qty) {
        double valueToReturn = 0;
        switch (uom.toLowerCase()) {
            case "kg", "kilograms" -> valueToReturn = qty * 1000;
            case "grams" -> valueToReturn = qty;
            case "micrograms" -> valueToReturn = qty / 1000;
        }
        return valueToReturn;
    }

    public double qtyInGramsUsingSwitchSimple(String uom, double qty) {
        switch (uom.toLowerCase()) {
            case "kg", "kilograms" -> {
                return qty * 1000;
            }
            case "grams" -> {
                return qty;
            }
            case "micrograms" -> {
                return qty / 1000;
            }
            default -> {
                return 0;
            }
        }
    }

    public String getSweetener() {
        return sweetener;
    }

    public void setSweetener(String sweetener) {
        this.sweetener = sweetener;
    }
}
