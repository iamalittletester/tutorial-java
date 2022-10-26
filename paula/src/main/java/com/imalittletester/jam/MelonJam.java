package com.imalittletester.jam;

public class MelonJam extends Jam{
    //public float melonQty;
    //public String melonUom;
    public Bottle bottle;

    public MelonJam() {
    }

    public MelonJam(String sweetener){
        super(sweetener);
    }

    public MelonJam(String sweetener, float sweetenerQty, String sweetenerUom, Bottle bottle, boolean isDietetic,
                    float fruitQty, String fruitUom) {
        super(sweetener, sweetenerQty, sweetenerUom, isDietetic, "melon", fruitQty, fruitUom);
        // didn't create a variable for String fruit because it will always be "melon" in this class

        //this.melonQty = melonQty;
        //this.melonUom = melonUom;
        this.bottle = bottle;
    }

    @Override
    public void makeJam() {
        super.makeJam();
        //System.out.println("Adding " + melonQty + " " + melonUom + " of melon");
        System.out.println("Bottling in: " + bottle.bottleQty + " of capacity: " + bottle.bottleCapacity);
    }



}
