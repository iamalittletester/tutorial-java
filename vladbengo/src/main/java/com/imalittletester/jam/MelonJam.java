package com.imalittletester.jam;

public class MelonJam {

    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;

    public float melonQty;
    public String melonUom;

    public int bottleQty;
    public int bottleCapacity;

    public boolean isDietetic;

    //constructors
    public MelonJam(String sweetener, float sweetenerQty, String sweetenerUom, float melonQty, String melonUom, int bottleQty, int bottleCapacity, boolean isDietetic){
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.melonQty = melonQty;
        this.melonUom = melonUom;
        this.bottleQty = bottleQty;
        this.bottleCapacity = bottleCapacity;
        this.isDietetic = isDietetic;
    }

    public MelonJam() {
        this.sweetener = sweetener;
    }

    public MelonJam(String sweetener){
        this.sweetener = sweetener;
    }
}
