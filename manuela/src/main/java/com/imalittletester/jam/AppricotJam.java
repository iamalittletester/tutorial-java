package com.imalittletester.jam;

import org.apache.commons.lang3.builder.ToStringExclude;

public class AppricotJam {
    //fields
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;

    public float apricotQty;
    public String apricotUom;

    public int jarQty;
    public int jarCapacity;

    public boolean isDietetic;

    //method
    //constructor
    public AppricotJam() {
    }

    public AppricotJam(String sweetener) {
        this.sweetener = sweetener;
    }

    public AppricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom, int jarQty, int jarCapacity, boolean isDietetic) {
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
        System.out.println("Also adding: " + apricotQty + " " + apricotUom + " of apricots");
        System.out.println("Boiling for " + preparationTime() + " minutes");
        System.out.println("Is dietetic? " + isDietetic);
    }

    private int preparationTime() {
        return 30;
    }

    @Override
    public String toString() {
        return "AppricotJam{" +
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
