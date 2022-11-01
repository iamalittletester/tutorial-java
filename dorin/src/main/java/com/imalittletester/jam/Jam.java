package com.imalittletester.jam;

import java.util.Objects;

public class Jam {
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;

//    Add new parameters to create an abstract fruit.
    public String fruitName;
    public int fruitQty;
    public String fruitUom;

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom, String fruitName, int fruitQty, String fruitUom) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;

        this.fruitName = fruitName;
        this.fruitUom = fruitUom;
        this.fruitQty = fruitQty;
    }

    public Jam() {

    }

    public Jam(String sweetener) {
        this.sweetener = sweetener;
    }

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom) {
    }

    public void makeJam(){

        System.out.println("Adding " + fruitQty + fruitUom + " of " + fruitName);
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        System.out.println("Is jam dietetic? " + (sweetener.contains("stevia")||sweetener.contains("sucrose")));

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jam jam = (Jam) o;
        return Float.compare(jam.sweetenerQty, sweetenerQty) == 0 && fruitQty == jam.fruitQty && Objects.equals(sweetener, jam.sweetener) && Objects.equals(sweetenerUom, jam.sweetenerUom) && Objects.equals(fruitName, jam.fruitName) && Objects.equals(fruitUom, jam.fruitUom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetener, sweetenerQty, sweetenerUom, fruitName, fruitQty, fruitUom);
    }
}
