package com.imalittletester.jam;

import java.util.Objects;

public class MelonJam extends Jam {
    //attribute - properties of the object
    public float melonQty;
    public String melonUom;

    public Bottle bottle;

    public MelonJam(String sweetener, float sweetenerQty, String sweetenerUom, float melonQty, String melonUom, Bottle bottle) {
        super(sweetener, sweetenerQty, sweetenerUom); //the supper class Jam
        this.melonQty = melonQty;
        this.melonUom = melonUom;
        this.bottle = bottle;

    }

    public MelonJam() {
    }

    public MelonJam(String sweetener) {
        super(sweetener);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MelonJam melonJam = (MelonJam) o;
        return Float.compare(melonJam.melonQty, melonQty) == 0 && Objects.equals(melonUom, melonJam.melonUom) && Objects.equals(bottle, melonJam.bottle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(melonQty, melonUom, bottle);
    }

    @Override
    //method that does not return anything
    public void makeJam() {
        super.makeJam();
        System.out.println("Adding " + melonQty + " " + melonUom + " of melon");
        System.out.println("Bottling in: " + bottle.bottleQty + " bottles of capacity: " + bottle.bottleCapacity);

    }
}
