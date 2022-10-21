package com.imalittletester.jam;

public class MelonJam extends Jam {

    //fields

    public float melonQty;
    public String melonUom;
    public Bottle bottle;
    //constructors

    public MelonJam(String sweetener, float sweetenerQty, String sweetenerUom, float melonQty, String melonUom, Bottle bottle, boolean isDietetic) {
        super(sweetener, sweetenerQty,sweetenerUom, isDietetic);
        this.melonQty = melonQty;
        this.melonUom = melonUom;
        this.bottle = bottle;
    }

    public MelonJam() {
    }
    public MelonJam(String sweetener){
        super(sweetener);
    }

    //method
    @Override
    public void makeJam(){
        super.makeJam();
        System.out.println("Adding " + melonQty + " " + melonUom + " of melon");
        System.out.println("Bottling in: " + bottle.bottleQty + " of capacity: " + bottle.bottleCapacity);
    }

}
