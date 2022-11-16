package com.imalittletester.jam;

import org.apache.commons.lang3.builder.ToStringExclude;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

//inhierence
public class AppricotJam extends Jam {

    //fields
//    public float apricotQty;
//    public String apricotUom;

    public Jar jar;

    //method
    //constructor
    public AppricotJam() {
    }

    public AppricotJam(String sweetener) {
        super(sweetener);
    }

//    public AppricotJam(String sweetener, float sweetenerQty, String sweetenerUom,List<Fruits> fruits, Jar jar) {
//        super(sweetener, sweetenerQty, sweetenerUom, fruits); //the supper class Jam
//        //super(fruitQty, fruitUom,sweetener, sweetenerQty, sweetenerUom, isDietetic);
////        this.apricotQty = apricotQty;
////        this.apricotUom = apricotUom;
//        this.jar = jar;
//
//    }


    public AppricotJam(String sweetener, float sweetenerQty, String sweetenerUom, List<Fruits> fruits, Jar jar) {
        super(sweetener, sweetenerQty, sweetenerUom, fruits);
        this.jar = jar;
    }

    @Override
    public void makeJam() {
        super.makeJam();
        fruits.add(new Fruits("appricot", 1.5, "kg"));
        System.out.println("Also adding: " + fruits.get(0).fruitsQty + " " + fruits.get(0).fruitUom + " of " + fruits.get(0).fruitName);
        //System.out.println("Also adding: " + fruitQty + " " + fruitUom + " of apricots");
       // System.out.println("Boiling for " + preparationTime() + " minutes");
        //System.out.println("Having " + jar.jarQty + " jars" + " " + "of capacity: " + jar.jarCapacity);

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
              //  ", apricotQty=" + fruits.get(0).fruitsQty+
               /// ", apricotUom='" + fruits.get(0).fruitUom + '\'' +
                //", apricotQty=" + fruitQty +
                // ", apricotUom='" + fruitUom + '\'' +
                ", jarQty=" + jar +
                ", jarCapacity=" + jar +
                ", isDietetic=" + isDietetic +
                '}';
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        AppricotJam that = (AppricotJam) o;
//        return Float.compare(that.fruits.get(0).fruitsQty, fruits.get(0).fruitsQty) == 0 && Objects.equals(fruits.get(0).fruitUom, that.fruits.get(0).fruitUom) && Objects.equals(jar, that.jar);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(apricotQty, apricotUom, jar);
//    }

    public int howManyFullJars(int jamQtyInGrams) {
        return jamQtyInGrams / jar.jarCapacity;
    }

    public int remainderJam(int jamQtyInGrams) {
        return jamQtyInGrams % jar.jarCapacity;
    }
}
