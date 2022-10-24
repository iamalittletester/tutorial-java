package com.imalittletester.jam;

public class Jam extends Fruit{
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;

    public Fruit fruit;
    public boolean isDietetic;

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom, Fruit fruit, boolean isDietetic) {
        super (fruit.fruitName, fruit.fruitQty, fruit.fruitUom);
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

    public boolean isDietetic() {
        return isDietetic;
    }


    public void makeJam (){
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        System.out.println("Is jam dietetic? " + isDietetic);
    }
}
