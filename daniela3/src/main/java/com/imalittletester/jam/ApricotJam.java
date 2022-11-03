package com.imalittletester.jam;

import java.util.Objects;

public class ApricotJam extends Jam{
    //fields
    //public float apricotQty;
    //public String apricotUom;
    public Jar jar;

    //public int jarQty;
    //public int jarCapacity;

    //method

    public ApricotJam (){}
    public ApricotJam(String sweetener) {
        super(sweetener);
    }

    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, Jar jar, boolean isDietetic, float fruitQty, String fruitUom) {
        super(sweetener, sweetenerQty, sweetenerUom, isDietetic, "apricot", fruitQty, fruitUom);
       // this.apricotQty = apricotQty;
       // this.apricotUom = apricotUom;
        this.jar = jar;

    }
    @Override
    public void makeJam() {
        super.makeJam();
        //System.out.println("Also adding " + apricotQty + " " + apricotUom + " of apricots");
        System.out.println("Boiling for " + preparationTime() + " minutes");
    }

    private int preparationTime() {
        return 30;
    }

    @Override
    public String toString() {
        return "ApricotJam{" +
                "sweetener='" + sweetener + '\'' +
                ", sweetenerQty=" + sweetenerQty +
                ", sweetenerUom='" + sweetenerUom + '\'' +
                ", isDietetic=" + isDietetic +
                ", fruit='" + fruit + '\'' +
                ", fruitQty=" + fruitQty +
                ", fruitUom='" + fruitUom + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApricotJam that = (ApricotJam) o;
        return jar.equals(that.jar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jar);
    }

    public int howManyFullJars (int jamQtyInGrams) {
        return jamQtyInGrams / jar.jarCapacity;
    }

    public int remainderJam (int jamQtyInGrams) {
        return jamQtyInGrams % jar.jarCapacity;
    }

}
