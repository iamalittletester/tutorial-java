package com.imalittletester.jam;

public class ApricotJam extends Jam {
    //fields
    public float apricotQty;
    public String apricotUom;

    public Jar jar;

    //methods
    public ApricotJam() {
    }
    public ApricotJam(String sweetener) {
        super(sweetener);
    }

    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom,
                      Jar jar, boolean isDietetic) {
        super(sweetener, sweetenerQty, sweetenerUom, isDietetic);
        this.apricotQty = apricotQty;
        this.apricotUom = apricotUom;
        this.jar = jar;
     }


     @Override
    public void makeJam() {
        super.makeJam();
        System.out.println("Also adding " + apricotQty + " " + apricotUom + " of apricots");
        System.out.println("Boiling for " + preparationTime() + " minutes");
        System.out.println("Storing in " + jar.jarQty + " jars of " + jar.jarCapacity + "g.");
    }

    private int preparationTime(){
        return 30;
    }

    @Override
    public String toString() {
        return "ApricotJam{" +
                "apricotQty=" + apricotQty +
                ", apricotUom='" + apricotUom + '\'' +
                ", jar=" + jar +
                ", sweetener='" + sweetener + '\'' +
                ", sweetenerQty=" + sweetenerQty +
                ", sweetenerUom='" + sweetenerUom + '\'' +
                ", isDietetic=" + isDietetic +
                '}';
    }
}
