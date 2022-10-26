package com.imalittletester.jam;

public class ApricotJam extends Jam{
    //fields
    public float apricotQty;
    public String apricotUom;
    public Jar jar;


    //methods
    public ApricotJam(){}

    public ApricotJam(String sweetener){
        this.sweetener = sweetener;
    }

    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty,
                      String apricotUom, Jar jar, boolean isDietetic ) {

       super(sweetener, sweetenerQty, sweetenerUom, isDietetic);
       this.jar = jar;
       this.apricotQty = apricotQty;
       this.apricotUom = apricotUom;
       this.isDietetic = isDietetic;

    }

@Override
    public void makeJam(){
        super.makeJam();
        System.out.println("Boiling for " + preparationTime() + " minutes");
        System.out.println("Pouring the resulting jam in " + jar.jarQty + " jars with a capacity of " + jar.jarCapacity + " each.");
    }

    private int preparationTime(){
        return 30;
    }

    @Override
    public String toString() {
        return "ApricotJam{" +
                "sweetener='" + sweetener + '\'' +
                ", sweetenerQty=" + sweetenerQty +
                ", sweetenerUom='" + sweetenerUom + '\'' +
                ", apricotQty=" + apricotQty +
                ", apricotUom='" + apricotUom + '\'' +
                ", jarQty=" + jar.jarQty +
                ", jarCapacity=" + jar.jarCapacity +
                ", isDietetic=" + isDietetic +
                '}';
    }
}
