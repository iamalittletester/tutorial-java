package com.imalittletester.jam;

public class MelonJam extends Jam{

    public float melonQty;
    public String melonUom;

    public Bottle bottle;

    public MelonJam(String sweetener, float sweetenerQty, String sweetenerUom, float melonQty, String melonUom, Bottle bottle, boolean isDietetic) {

        super(sweetener, sweetenerQty, sweetenerUom, isDietetic);

        this.melonQty = melonQty;
        this.melonUom = melonUom;
        this.bottle = bottle;
    }

    public MelonJam() {
    }

    public MelonJam(String sweetener){
        super(sweetener);
    }

    public void makeJam(){
        super.makeJam();
        System.out.println("Adding " + melonQty + " " + melonUom + " of melon");
        System.out.println("Bottling in: " + bottle.bottleQty + " bottles of capacity " + bottle.bottleCapacity);
    }

}
