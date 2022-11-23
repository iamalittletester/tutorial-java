package com.imalittletester.jam;

import java.util.List;
import java.util.Objects;

public class MelonJam extends Jam {
    //attribute - properties of the object
//    public float melonQty;
//    public String melonUom;

    public Bottle bottle;

    public MelonJam(String sweetener, float sweetenerQty, String sweetenerUom, List<Fruits> fruits, Bottle bottle) {
        super(sweetener, sweetenerQty, sweetenerUom, fruits); //the supper class Jam
//        this.melonQty = melonQty;
//        this.melonUom = melonUom;
        this.bottle = bottle;

    }

    public MelonJam() {
    }

    public MelonJam(String sweetener) {
        super(sweetener);
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        MelonJam melonJam = (MelonJam) o;
//        return Float.compare(melonJam.melonQty, melonQty) == 0 && Objects.equals(melonUom, melonJam.melonUom) && Objects.equals(bottle, melonJam.bottle);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(melonQty, melonUom, bottle);
//    }

    @Override
    //method that does not return anything
    public void makeJam() {
        super.makeJam();
        fruits.add(new Fruits("melon", 2, "kg"));
        System.out.println("Adding " + fruits.get(0).fruitsQty + " " + fruits.get(0).fruitUom + " of " + fruits.get(0).fruitName);
        System.out.println("Bottling in: " + bottle.bottleQty + " bottles of capacity: " + bottle.bottleCapacity);

    }
}
