package com.imalittletester.jam;

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

    public void makeJam(){
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        System.out.println("Is Jam dietetic? " + isDietetic);
    }

    public String getSweetener() {
        return sweetener;
    }

    public void setSweetener(String sweetener) {
        this.sweetener = sweetener;
    }
}
