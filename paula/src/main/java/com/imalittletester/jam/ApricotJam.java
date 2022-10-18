package com.imalittletester.jam;

public class ApricotJam {
    //variables
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;
    public float apricotQty;
    public String apricotUom;
    public int jarQty;
    public int jarCapacity;
    public boolean isDietetic;

    //method (alt insert)
    public ApricotJam() { }

    public ApricotJam(String sweetener) {
        this.sweetener = sweetener;
    }

    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom,
                      int jarQty, int jarCapacity, boolean isDietetic) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.apricotQty = apricotQty;
        this.apricotUom = apricotUom;
        this.jarQty = jarQty;
        this.jarCapacity = jarCapacity;
        this.isDietetic = isDietetic;
    }

    public void makeJam() {
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        System.out.println("Also adding " + apricotQty + " " + apricotUom + "of apricot");
        System.out.println("Boiling for " + preparationTime() + " minutes");
        System.out.println("Is dietetic? " + isDietetic);

    }

    private int preparationTime() {
        return 35;
    }

    //(alt insert)
    @Override
    public String toString() {
        return "ApricotJam{" +
                "sweetener='" + sweetener + '\'' +
                ", sweetenerQty=" + sweetenerQty +
                ", sweetenerUom='" + sweetenerUom + '\'' +
                ", apricotQty=" + apricotQty +
                ", apricotUom='" + apricotUom + '\'' +
                ", jarQty=" + jarQty +
                ", jarCapacity=" + jarCapacity +
                ", isDietetic=" + isDietetic +
                '}';
    }


}