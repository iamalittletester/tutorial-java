package com.imalittletester.jam;

public class ApricotJam extends Jam {
//fields
    public float apricotQty;
    public String apricotUom;


    public Jar jar;


    //public boolean isDietetic;



    //method
    public ApricotJam(){}

    //constructor
    public ApricotJam(String sweetener) {
        super(sweetener);

    }

    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricontUom, Jar jar, boolean isDietetic) {
        super(sweetener, sweetenerQty, sweetenerUom, isDietetic);
        this.apricotQty = apricotQty;
        this.apricotUom = apricontUom;
        this.jar = jar;


    }

    @Override
    public void makeJam(){
        //fields
        //constructors
        //methods
        //toString
        super.makeJam();
        System.out.println("Also adding: " + apricotQty + " " + apricotUom + " of apricots");
        System.out.println("Boiling for " + preparationTime() + " minutes");

    }

    public void metoda1(String str1, int int1) {}
    public void metoda1(float fl1, int int1) {}
    public void metoda1(int int1) {}

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
                ", apricontUom='" + apricotUom + '\'' +
                ", jarQty=" + jar +
                ", jarCapacity=" + jar +
                ", isDietetic=" + isDietetic +
                '}';
    }
    //alt+insert

}
