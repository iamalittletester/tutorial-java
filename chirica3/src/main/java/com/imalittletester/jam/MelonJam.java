package com.imalittletester.jam;

public class MelonJam extends Jam {
    public float melonQty;
    public String melonUom;

    public Bottle bottle;

    public MelonJam() {
    }

    public MelonJam(String sweetener) {
        super(sweetener);
    }

    public MelonJam(String sweetener, float sweetenerQty, String sweetenerUom, float melonQty, String melonUom,
                   Bottle bottle) {
        super(sweetener, sweetenerQty, sweetenerUom);
        this.melonQty = melonQty;
        this.melonUom = melonUom;
        this.bottle = bottle;
    }


    @Override
    public void makeJam(){
        super.makeJam();
        System.out.println("Also adding " + melonQty + " " + melonUom + " of melon");
        System.out.println("Bottling in " + bottle.bottleQty + " bottles of " + bottle.bottleCapacity + "ml.");
    }
}
