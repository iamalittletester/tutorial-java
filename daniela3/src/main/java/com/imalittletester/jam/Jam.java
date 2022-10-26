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

    public String getSweetener() {
        return sweetener;
    }

    public void setSweetener(String sweetener) {
        this.sweetener = sweetener;
    }
}
