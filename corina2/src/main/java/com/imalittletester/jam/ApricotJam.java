package com.imalittletester.jam;

import java.util.Objects;

public class ApricotJam extends Jam {

    public float apricotQty;
    public String apricotUom;

    public int jarQty;
    public int jarCapacity;

    //method
    public ApricotJam() {}

    public ApricotJam(String sweetener) {
        super(sweetener);
    }

    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom,
                      int jarQty, int jarCapacity, boolean isDietetic) {
        super(sweetener, sweetenerQty, sweetenerUom, isDietetic);
        this.apricotQty = apricotQty;
        this.apricotUom = apricotUom;
        this.jarQty = jarQty;
        this.jarCapacity = jarCapacity;
    }

    @Override
    public void makeJam() {
        super.makeJam();
        System.out.println("Also adding: " + apricotQty + " " + apricotUom + " of apricots");
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
                ", apricotQty=" + apricotQty +
                ", apricotUom='" + apricotUom + '\'' +
                ", jarQty=" + jarQty +
                ", jarCapacity=" + jarCapacity +
                ", isDietetic=" + isDietetic +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApricotJam that = (ApricotJam) o;
        return Float.compare(that.apricotQty, apricotQty) == 0 && jarQty == that.jarQty && jarCapacity == that.jarCapacity && Objects.equals(apricotUom, that.apricotUom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apricotQty, apricotUom, jarQty, jarCapacity);
    }

    public int howManyFullJars(int jamQtyInGrams) {
        return jamQtyInGrams / jarCapacity;
    }

    public int remainderJam(int jamQtyInGrams) {
        return jamQtyInGrams % jarCapacity;
    }
}
