package com.imalittletester.jam;

import org.apache.commons.lang3.builder.ToStringExclude;

import java.util.Objects;

//inhierence
public class AppricotJam extends Jam {
    //fields
    public float apricotQty;
    public String apricotUom;

    public Jar jar;

    //method
    //constructor
    public AppricotJam() {
    }

    public AppricotJam(String sweetener) {
        super(sweetener);
    }

    public AppricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom, Jar jar, boolean isDietetic) {
        super(sweetener, sweetenerQty, sweetenerUom, isDietetic); //the supper class Jam
        //super(fruitQty, fruitUom,sweetener, sweetenerQty, sweetenerUom, isDietetic);
        this.apricotQty = apricotQty;
        this.apricotUom = apricotUom;
        this.jar = jar;

    }

    @Override
    public void makeJam() {
        super.makeJam();
        System.out.println("Also adding: " + apricotQty + " " + apricotUom + " of apricots");
        //System.out.println("Also adding: " + fruitQty + " " + fruitUom + " of apricots");
        System.out.println("Boiling for " + preparationTime() + " minutes");
        System.out.println("Having " + jar.jarQty + " jars" + " " + "of capacity: " + jar.jarCapacity);

    }

    private int preparationTime() {
        return 30;
    }

    @Override
    public String toString() {
        return "AppricotJam{" +
                "sweetener='" + sweetener + '\'' +
                ", sweetenerQty=" + sweetenerQty +
                ", sweetenerUom='" + sweetenerUom + '\'' +
                ", apricotQty=" + apricotQty +
                ", apricotUom='" + apricotUom + '\'' +
                //", apricotQty=" + fruitQty +
                // ", apricotUom='" + fruitUom + '\'' +
                ", jarQty=" + jar +
                ", jarCapacity=" + jar +
                ", isDietetic=" + isDietetic +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AppricotJam that = (AppricotJam) o;
        return Float.compare(that.apricotQty, apricotQty) == 0 && Objects.equals(apricotUom, that.apricotUom) && Objects.equals(jar, that.jar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apricotQty, apricotUom, jar);
    }

    public int howManyFullJars(int jamQtyInGrams) {
        return jamQtyInGrams / jar.jarCapacity;
    }

    public int remainderJam(int jamQtyInGrams) {
        return jamQtyInGrams % jar.jarCapacity;
    }
}
