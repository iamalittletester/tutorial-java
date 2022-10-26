package com.imalittletester.jam;

public class Jam {

    //Homework T3
    //public float fruitQty;
    //public String fruitUom;
    //In clasa AppricotJam - in constructorul cu toate valorile as scrie:
    //this.fruitQty = apricotQty;
    //this.fruitUom = apricotUom;
    //As inlocui astea unde mai este necesar in AppricotJam si MelonJam in loc de:
    // public float melonQty;
    // public String melonUom;

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
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " +sweetener);
        System.out.println("Is jam dietetic? " + isDietetic);

    }

    public String getSweetener() {
        return sweetener;
    }

    public void setSweetener(String sweetener) {
        this.sweetener = sweetener;
    }


}
