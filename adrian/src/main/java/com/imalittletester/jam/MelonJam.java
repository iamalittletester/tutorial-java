package com.imalittletester.jam;

public class MelonJam extends Jam{


    /*public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;*/

    public float melonQty;
    public String melonUom;

//    public int bottleQty;
//    public int bottleCapacity;

    //public boolean isDietetic;

    public Bottle bottle;

    public MelonJam(String sweetener, float sweetenerQty, String sweetenerUom, float melonQty, String melonUom, Bottle bottle, boolean isDietetic) {
      /*  this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;*/

        super (sweetener, sweetenerQty, sweetenerUom, isDietetic); // from base class

        this.melonQty = melonQty;
        this.melonUom = melonUom;
        this.bottle = bottle;

        //this.bottleQty = bottleQty;
        // this.bottleCapacity = bottleCapacity;
        // this.isDietetic = isDietetic;
    }

    public MelonJam(){

    }
    public MelonJam(String sweetener) {
        //this.sweetener = sweetener;
        super(sweetener);
    }


    public void makeJam(){
        //System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + "of " + sweetener);
        super.makeJam();
        System.out.println("Adding " + melonQty + " " + melonUom + "of melon" );
        System.out.println("Bottling in " + bottle.bottleQty + " bottles of " + bottle.bottleCapacity + " ml");
        //System.out.println("Is jam dietetic? " + isDietetic);
    }
}
