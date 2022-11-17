package com.imalittletester.jam;

import java.util.Objects;

public class ApricotJam extends Jam {
    //fields
   //  public float apricotQty;
   // public String apricotUom;

     public Jar jar;

    //methods
    public ApricotJam() {
    }
    public ApricotJam(String sweetener) {
        super(sweetener);
    }

    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, Fruit fruit, Jar jar) {
        super(sweetener, sweetenerQty, sweetenerUom, fruit);
        this.jar = jar;
     }

     @Override
    public void makeJam() {
        super.makeJam();
        System.out.println("Also adding " + fruit.quantity + " " + fruit.uom + " of " + fruit.name);
        System.out.println("Boiling for " + preparationTime() + " minutes");
        System.out.println("Storing in " + jar.jarQty + " jars of " + jar.jarCapacity + "g.");
    }

    private int preparationTime(){
        return 30;
    }

   // @Override
   //tostring

  /*  @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ApricotJam that = (ApricotJam) o;
        return Float.compare(that.apricotQty, apricotQty) == 0 && apricotUom.equals(that.apricotUom) && jar.equals(that.jar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), apricotQty, apricotUom, jar);
    } */

    public int howManyFullJars(int qtyInGrams){
        return qtyInGrams / jar.jarCapacity;
    }

    public int remainderJam(int qtyInGrams) {
        return qtyInGrams % jar.jarCapacity;
    }
    public boolean lastDayOfMonth(String month, int zi){
        boolean lastDay = false;
        switch (month){
            case "January" -> { if (zi == 31) {lastDay = true;}}
            case "February" -> { if (zi == 28) {lastDay = true;}}
            case "March" -> { if (zi == 31) {lastDay = true;}}
            case "April" -> { if (zi == 30) {lastDay = true;}}
            case "May" -> { if (zi == 31) {lastDay = true;}}
            case "June" -> { if (zi == 30) {lastDay = true;}}
            case "July" -> { if (zi == 31) {lastDay = true;}}
            case "August" -> { if (zi == 31) {lastDay = true;}}
            case "September" -> { if (zi == 30) {lastDay = true;}}
            case "October" -> { if (zi == 31) {lastDay = true;}}
            case "November" -> { if (zi == 30) {lastDay = true;}}
            case "December" -> { if (zi == 31) {lastDay = true;}}
        }
        return lastDay;
    }

}
