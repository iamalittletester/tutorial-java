package com.imalittletester.jam;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Jam {
    //fields
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;

    public boolean isDietetic;

    public Fruit fruit;
    public List<Fruit> fruitsList = new ArrayList<>();

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom, Fruit fruit) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.isDietetic = sweetener.equals("stevia") || sweetener.equals("sucralose");
        this.fruit = fruit;
    }

    public Jam() {
    }

    public Jam(String sweetener) {
        this.sweetener = sweetener;
    }

    public List<Fruit> buyFruits(String name, float quantity, String uom){
        fruitsList.add(new Fruit(name, quantity, uom));
        return fruitsList;
    }

    public void makeJam(){
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        if (isDietetic == true) {
        System.out.println("Is jam dietetic? Yes");}
            else {
            System.out.println("Is jam dietetic? No");
        }
    }

   @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jam jam = (Jam) o;
        return Float.compare(jam.sweetenerQty, sweetenerQty) == 0 && isDietetic == jam.isDietetic && sweetener.equals(jam.sweetener) && sweetenerUom.equals(jam.sweetenerUom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetener, sweetenerQty, sweetenerUom, isDietetic);
    }
}
