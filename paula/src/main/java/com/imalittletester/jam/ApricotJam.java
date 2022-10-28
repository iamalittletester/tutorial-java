package com.imalittletester.jam;

public class ApricotJam extends Jam {
    //public float apricotQty;
    //public String apricotUom;
    public Jar jar;

    //method (alt insert)
    public ApricotJam() {
    }

    public ApricotJam(String sweetener) {
        super(sweetener);
    }

    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, Jar jar,
                      float fruitQty, String fruitUom) {
        super(sweetener, sweetenerQty, sweetenerUom, "apricot", fruitQty, fruitUom); //super mereu pe prima linie
        // didn't create a variable for fruit because it will always be "apricot" in this class

        //this.apricotQty = apricotQty;
        //this.apricotUom = apricotUom;
        this.jar = jar;
    }

    @Override
    public void makeJam() {
        super.makeJam();
        //System.out.println("Also adding " + apricotQty + " " + apricotUom + "of apricot");
        System.out.println("Boiling for " + preparationTime() + " minutes");
    }

    private int preparationTime() {
        return 35;
    }

    @Override
    public String toString() {
        return "ApricotJam{" +
                "fruit='" + fruit + '\'' +
                ", jar=" + jar +
                ", sweetener='" + sweetener + '\'' +
                ", sweetenerQty=" + sweetenerQty +
                ", sweetenerUom='" + sweetenerUom + '\'' +
                ", isDietetic=" + isDietetic +
                ", fruit='" + fruit + '\'' +
                ", fruitQty=" + fruitQty +
                ", fruitUom='" + fruitUom + '\'' +
                '}';
    }


    public int howManyFullJars(int jamQtyInGrams) {
        return jamQtyInGrams / jar.jarCapacity;
    }

    public int remainderJam(int jamQtyInGrams) {
        return jamQtyInGrams % jar.jarCapacity;
    }
}