package com.imalittletester.jam;

import java.util.Objects;

public class ApricotJam extends Jam{
    //fields
    public float apricotQty;
    public String apricotUom;

    public Jar jar;

    //method

    public ApricotJam() {

    }

    public ApricotJam(String sweetener) {
        super(sweetener);

    }

    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom, Jar jar, boolean isDietetic) {
        super(sweetener, sweetenerQty, sweetenerUom, isDietetic);
        this.apricotQty = apricotQty;
        this.apricotUom = apricotUom;
        this.isDietetic = isDietetic;
        this.jar = jar;
    }
    @Override
    public void makeJam() {
        super.makeJam();
        System.out.println("Also adding: " + apricotQty + " " + apricotUom + " of apricots");
        System.out.println("Boiling for a while..." + preparationTime() + " minutes");

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
                ", apricotQty=" + apricotQty +
                ", apricotUom='" + apricotUom + '\'' +
                ", jar=" + jar +
                ", isDietetic=" + isDietetic +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApricotJam that = (ApricotJam) o;
        return Float.compare(that.apricotQty, apricotQty) == 0 && apricotUom.equals(that.apricotUom) && jar.equals(that.jar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apricotQty, apricotUom, jar);
    }

    public int howManyFullJars(int jamQtyInGrams){
        return jamQtyInGrams / jar.jarCapacity;
    }
    public int remainderJam(int jamQtyInGrams){
        return jamQtyInGrams % jar.jarCapacity;
    }
}
