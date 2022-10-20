package com.imalittletester.jam;

import org.apache.commons.lang3.builder.ToStringExclude;

//inhierence
public class AppricotJam extends Jam {
    //fields
    public float apricotQty;
    public String apricotUom;

    public int jarQty;
    public int jarCapacity;

    //method
    //constructor
    public AppricotJam() {
    }

    public AppricotJam(String sweetener) {
        super(sweetener);
    }

    public AppricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom, int jarQty, int jarCapacity, boolean isDietetic) {
        super(sweetener, sweetenerQty, sweetenerUom, isDietetic); //the supper class Jam
        this.apricotQty = apricotQty;
        this.apricotUom = apricotUom;
        this.jarQty = jarQty;
        this.jarCapacity = jarCapacity;

    }
@Override
    public void makeJam() {
        super.makeJam();
        System.out.println("Also adding: " + apricotQty + " " + apricotUom + " of apricots");
        System.out.println("Boiling for " + preparationTime() + " minutes");

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
