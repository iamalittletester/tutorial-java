package com.imalittletester.jam;

public class Jam {
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;

//    Add new parameters to create an abstract fruit.
    public String fruitName;
    public int fruitQty;
    public String fruitUom;

    public boolean isDietetic;

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom,
               boolean isDietetic, String fruitName, int fruitQty, String fruitUom) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.isDietetic = isDietetic;

        this.fruitName = fruitName;
        this.fruitUom = fruitUom;
        this.fruitQty = fruitQty;
    }

    public Jam() {

    }

    public Jam(String sweetener) {
        this.sweetener = sweetener;
    }

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom, boolean isDietetic) {
    }

    public void makeJam(){
        System.out.println("Adding " + fruitQty + fruitUom + " of " + fruitName);
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        System.out.println("Is jam dietetic? " + isDietetic);

    }
}
