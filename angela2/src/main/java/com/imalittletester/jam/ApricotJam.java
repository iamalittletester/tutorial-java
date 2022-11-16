package com.imalittletester.jam;

import java.util.Objects;

public class ApricotJam extends Jam{
    public float apricotQty;
    public String apricotUom;

    public Jar jar;

    public ApricotJam() {
    }

    //method
    public ApricotJam(String sweetener) {
        super (sweetener);

    }
 public ApricotJam (String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom, boolean isDietetic) {
     super (sweetener, sweetenerQty, sweetenerUom);
     this.apricotQty = apricotQty;
     this.apricotUom = apricotUom;
 }
    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom, Jar jar, boolean isDietetic) {
        super (sweetener, sweetenerQty, sweetenerUom);
        this.apricotQty = apricotQty;
        this.apricotUom = apricotUom;
        this.jar = jar;

    }
    public ApricotJam (String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom, Jar jar) {
        super (sweetener, sweetenerQty, sweetenerUom);
        this.apricotQty = apricotQty;
        this.apricotUom = apricotUom;
        this.jar = jar;
    }

    public ApricotJam(String sugar_cane, float v, String kg, int i, String kg1, int i1, int i2, boolean b) {
    }

    @Override
    public void makeJam() {
        super.makeJam();
        System.out.println("Also adding " + apricotQty + " " + apricotUom + " of apricots");
        System.out.println("Boiling for " + preparationTime() + " minutes");
        System.out.println("Bottling in: " + jar.jarQty + " jars of capacity: "+ jar.jarCapacity);

    }

    private int preparationTime() {
        return  30;
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

    public int howManyFullJars (int jamQtyInGrams) {
        return jamQtyInGrams / jar.jarCapacity;
    }

    public int remainderJam (int jamQtyInGrams) {
        return jamQtyInGrams % jar.jarCapacity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApricotJam that = (ApricotJam) o;
        return Float.compare(that.apricotQty, apricotQty) == 0 && Objects.equals(apricotUom, that.apricotUom) && Objects.equals(jar, that.jar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apricotQty, apricotUom, jar);
    }
}