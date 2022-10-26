package com.imalittletester.jam;

public class Jam{
    //To optimize classes I would extract the fruit doing the following: create a Fruit class with the common fields
    // such as fruitName, fruitQty, fruitUom; then I would make the necessary changes - delete the ApricotJam and MelonJam classes,
    // replace the specific fields with fields from Fruit class in Jam class;
    // I would also create a Recipient class and delete the Bottle and Jar classes and make the necessary changes in the
    // other classes, including ApricotJamTest which becomes JamTest. I already made the changes on another branch, so I can push them if needed.
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

    public boolean isDietetic() {
        return isDietetic;
    }


    public void makeJam (){
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        System.out.println("Is jam dietetic? " + isDietetic);
    }
}
