package com.imalittletester.jam;

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

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom, boolean isDietetic, String fruit, float fruitQty, String fruitUom) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.isDietetic = isDietetic;
        // fruit information
        this.fruit = fruit;
        this.fruitQty = fruitQty;
        this.fruitUom = fruitUom;
    }

    public void makeJam(){
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        System.out.println("Adding " + fruitQty + " " + fruitUom + " of " + fruit);
        System.out.println("Is jam dietetic? " + isDietetic);
    }

    public String getSweetener() {
        return sweetener;
    }
    public void setSweetener(String sweetener) {
        this.sweetener = sweetener;
    }
}
