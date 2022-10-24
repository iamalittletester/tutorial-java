package com.imalittletester.jam;

public class MelonJam extends Jam{

    public Fruit fruit;

    public Bottle bottle;


    public MelonJam(String sweetener, float sweetenerQty, String sweetenerUom, Fruit fruit, Bottle bottle, boolean isDietetic) {
        super (sweetener, sweetenerQty, sweetenerUom, fruit.fruitName, fruit.fruitQty, fruit.fruitUom, bottle.bottleQty, bottle.bottleCapacity, isDietetic);


    }

    public MelonJam() {
    }

    public MelonJam (String sweetener) {
        super (sweetener);
    }
@Override
    public void makeJam () {
        super.makeJam();
        System.out.println("Adding " + fruitQty + " " + fruitUom + " of melon");
        System.out.println("Bottling in: " + bottle.bottleQty + " bottles of capacity: " + bottle.bottleCapacity);

    }


}
