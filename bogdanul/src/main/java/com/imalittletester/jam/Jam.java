package com.imalittletester.jam;

import java.util.Objects;

public class Jam {
    // This class should have a field of type of Fruit.
    // Fruit is a class that we created, which would have some fields such as: fruitName (e.g. Melon, apricot, etc),
    // fruitQty, fruitUom.
    // Adding this Fruit field in this class means that we no longer need the other two classes (ApricotJam and MelonJam),
    // because the fruit would be defined here, as a property of the Jam.

    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;
    public boolean isDietetic;

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom, boolean isDietetic) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.isDietetic = isDietetic;
    }

    public Jam() {
    }

    public Jam(String sweetener) {
        this.sweetener = sweetener;
    }

    public void makeJam() {
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        System.out.println("Is Jam dietetic? " + isDietetic);
    }

    public double qtyInGramsUsingIf(String uom, double qty) {
        double mustMultiplyBy = 1;

        if (uom.equals("kg") || uom.equals("kilograms")) ;
        {
            mustMultiplyBy = 1000;
        }
        if (uom.equalsIgnoreCase("micrograms")) {
            mustMultiplyBy = 0.0001;
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
            case "kg", "kilograms" -> {
                return qty * 1000;
            }
            case "grams" -> {
                valueToReturn = qty;
            }
            case "micrograms" -> {
                valueToReturn = qty / 1000;
            }
            default -> {return 0;}
        }
        return valueToReturn;
    }

    public String getSweetener() {
        return sweetener;
    }

    public void setSweetener(String sweetener) {
        this.sweetener = sweetener;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jam jam = (Jam) o;
        return Float.compare(jam.sweetenerQty, sweetenerQty) == 0 && isDietetic == jam.isDietetic &&
                sweetener.equals(jam.sweetener) && sweetenerUom.equals(jam.sweetenerUom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetener, sweetenerQty, sweetenerUom, isDietetic);
    }
}
