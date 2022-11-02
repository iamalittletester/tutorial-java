package com.imalittletester.jam;

import org.testng.annotations.Test;

import java.util.Objects;

public class Jam{
    //To optimize classes I would extract the fruit doing the following: create a Fruit class with the common fields
    // such as fruitName, fruitQty, fruitUom; then I would make the necessary changes - delete the ApricotJam and MelonJam classes,
    // replace the specific fields with fields from Fruit class in Jam class;
    // I would also create a Recipient class and delete the Bottle and Jar classes and make the necessary changes in the
    // other classes, including ApricotJamTest which becomes JamTest. I already made the changes on another branch, so I can push them if needed.
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;
    public Boolean isDietetic;


    public Jam(String sweetener, float sweetenerQty, String sweetenerUom) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.isDietetic = (sweetener.equals("stevia") || sweetener.equals("sucralose"));

    }

    public Jam() {
    }

    public Jam(String sweetener) {
        this.sweetener = sweetener;
    }




  public void makeJam (){
       System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jam jam = (Jam) o;
        return Float.compare(jam.sweetenerQty, sweetenerQty) == 0 && Objects.equals(sweetener, jam.sweetener) && Objects.equals(sweetenerUom, jam.sweetenerUom) && Objects.equals(isDietetic, jam.isDietetic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetener, sweetenerQty, sweetenerUom, isDietetic);
    }
}
