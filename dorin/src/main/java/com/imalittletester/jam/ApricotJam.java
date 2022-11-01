package com.imalittletester.jam;

import java.util.Objects;

public class ApricotJam extends Jam{
    //fields
    public float apricotQty;
    public String apricotUom;
    public Jar jar;


    //methods
    public int howManyFullJars(int jamQtyInGrams){
        return jamQtyInGrams / jar.jarCapacity;
    }
    public int remainderJam(int jamQtyInGrams){
        return jamQtyInGrams % jar.jarCapacity;
    }
    public ApricotJam(){}

    public ApricotJam(String sweetener){
        this.sweetener = sweetener;
    }

    public ApricotJam(Jam jam, Jar jar) {

       super(jam.sweetener, jam.sweetenerQty, jam.sweetenerUom, jam.fruitName, jam.fruitQty, jam.fruitUom);
       this.jar = jar;
    }

@Override
    public void makeJam(){
        super.makeJam();
        System.out.println("Boiling for " + preparationTime() + " minutes");
        System.out.println("Pouring the resulting jam in " + jar.jarQty + " jars with a capacity of " + jar.jarCapacity + " each.");
    }

    private int preparationTime(){
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
                ", jarQty=" + jar.jarQty +
                ", jarCapacity=" + jar.jarCapacity +
                '}';
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
