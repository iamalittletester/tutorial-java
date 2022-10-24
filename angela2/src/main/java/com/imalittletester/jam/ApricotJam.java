package com.imalittletester.jam;

public class ApricotJam extends Jam{

    public Fruit fruit;

    public Jar jar;

    public ApricotJam() {
    }

    //method
    public ApricotJam(String sweetener) {
        super (sweetener);

    }
 public ApricotJam (String sweetener, float sweetenerQty, String sweetenerUom, Fruit fruit, boolean isDietetic) {
     super (sweetener, sweetenerQty, sweetenerUom, fruit.fruitName, fruit.fruitQty, fruit.fruitUom, isDietetic);
 }
    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, Fruit fruit, Jar jar, boolean isDietetic) {
        this.fruit = fruit;
        this.jar = jar;

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
}