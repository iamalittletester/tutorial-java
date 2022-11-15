package com.imalittletester.jam;

public class MelonJam extends Jam {
    //public float melonQty;
    //public String melonUom;

    public Bottle bottle;

    public MelonJam() {
    }

    public MelonJam(String sweetener) {
        super(sweetener);
    }

    public MelonJam(String sweetener, float sweetenerQty, String sweetenerUom, Fruit fruit,
                   Bottle bottle) {
        super(sweetener, sweetenerQty, sweetenerUom, fruit);
        this.bottle = bottle;
    }


    @Override
    public void makeJam(){
        super.makeJam();
        System.out.println("Also adding " + fruit.quantity + " " + fruit.uom + " of " + fruit.name);
        System.out.println("Bottling in " + bottle.bottleQty + " bottles of " + bottle.bottleCapacity + "ml.");
    }
}
