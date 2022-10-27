package com.imalittletester.jam;

public class ApricotJam {
//fields
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;

    public float apricotQty;
    public String apricontUom;

    public int jarQty;
    public int jarCapacity;

    public boolean isDietetic;



    //method
    public ApricotJam(){}

    //constructor
    public ApricotJam(String sweetener) {
        this.sweetener = sweetener;

    }

    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricontUom, int jarQty, int jarCapacity, boolean isDietetic) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.apricotQty = apricotQty;
        this.apricontUom = apricontUom;
        this.jarQty = jarQty;
        this.jarCapacity = jarCapacity;
        this.isDietetic = isDietetic;
    }

    public void makeJam(){
        //fields
        //constructors
        //methods
        //toString
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        System.out.println("Also adding: " + apricotQty + " " + apricontUom + " of apricots");
        System.out.println("Boiling for " + preparationTime() + " minutes");
        System.out.println("Is dietetic? " + isDietetic);
    }

    //metoda
    private int preparationTime(){

        return 30;
    }

    @Override
    //metoda toString()
    public String toString() {
        return "ApricotJam{" +
                "sweetener='" + sweetener + '\'' +
                ", sweetenerQty=" + sweetenerQty +
                ", sweetenerUom='" + sweetenerUom + '\'' +
                ", apricotQty=" + apricotQty +
                ", apricontUom='" + apricontUom + '\'' +
                ", jarQty=" + jarQty +
                ", jarCapacity=" + jarCapacity +
                ", isDietetic=" + isDietetic +
                '}';
    }
}
