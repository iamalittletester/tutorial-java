package com.imalittletester.jam;

public class Jam {
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;

    public boolean isDietetic;

    public String fruit;
    public float fruitQty;
    public String fruitUom;

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom, boolean isDietetic, String fruit, float fruitQty, String fruitUom) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.isDietetic = isDietetic;

        this.fruit = fruit;
        this.fruitQty = fruitQty;
        this.fruitUom = fruitUom;
    }

    public Jam() {
    }

    public Jam(String sweetener) {
        this.sweetener = sweetener;
    }

    public void makeJam() {
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        System.out.println("Is jam dietetic? " + isDietetic);
    }

    public double qtyInGramsUsingIf(String fruitUom, double qty) {
        double mustMultiplyBy = 1;
        if (fruitUom.equalsIgnoreCase("kg") || fruitUom.equalsIgnoreCase("kilograms")) {
            mustMultiplyBy = 1000;
        }
        if (fruitUom.equalsIgnoreCase("micrograms")) {
            mustMultiplyBy = 0.001;
        }
        return qty * mustMultiplyBy;
    }

    public double qtyInGramsUsingIfSimple (String fruitUom, double qty) {
        if (fruitUom.equalsIgnoreCase("kg") || fruitUom.equalsIgnoreCase("kilograms")) {
            return qty * 1000;
        }
        if (fruitUom.equalsIgnoreCase("micrograms")) {
            return qty / 1000;
        }
        return qty;
    }

    public double qtyInGramsUsingSwitch (String fruitUom, double qty){
        double valueToReturn = 0;
        switch (fruitUom.toLowerCase()) {
            case "kg", "kilograms" -> {valueToReturn = qty * 1000;}
            case "grams" -> {valueToReturn = qty;}
            case "micrograms" -> {valueToReturn = qty / 1000;}
        }
        return  valueToReturn;
    }

    public double qtyInGramsUsingSwitchSimple (String fruitUom, double qty){
        switch (fruitUom.toLowerCase()) {
            case "kg", "kilograms" -> {return qty * 1000;}
            case "grams" -> {return qty;}
            case "micrograms" -> {return qty / 1000;}
            default -> {return 0;}
        }
     }

    public String getSweetener() {
        return sweetener;
    }

    public void setSweetener(String sweetener) {
        this.sweetener = sweetener;
    }
}
