package com.imalittletester.jam;

import java.util.Objects;

public class Jam {

    //Homework T3
    //public float fruitQty;
//   public String fruitUom;
//   public String fruitType;

//       public Jam(float fruitQty, String fruitUom, String fruitType, String sweetener, float sweetenerQty, String sweetenerUom, boolean isDietetic) {
//        this.fruitQty = fruitQty;
//        this.fruitUom = fruitUom;
//        this.fruitType = fruitType;
//        this.sweetener = sweetener;
//        this.sweetenerQty = sweetenerQty;
//        this.sweetenerUom = sweetenerUom;
//        this.isDietetic = isDietetic;
//    }
    //In clasa AppricotJam - in constructorul cu toate valorile as scrie:

    //public AppricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float fruitQty, String fruitUom, String fruitType, Jar jar, boolean isDietetic)
    // {
    //        super(sweetener, sweetenerQty, sweetenerUom, fruitQty, fruitUom, fruitType, isDietetic);
    //        this.jar = jar;
    //        }

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jam jam = (Jam) o;
        return Float.compare(jam.sweetenerQty, sweetenerQty) == 0 && isDietetic == jam.isDietetic && Objects.equals(sweetener, jam.sweetener) && Objects.equals(sweetenerUom, jam.sweetenerUom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetener, sweetenerQty, sweetenerUom, isDietetic);
    }
}
