package com.imalittletester.jam;


public class ApricotJam {

    public String sweetner;
    public float sweetnerQty;
    public String sweetnerUom;

    public float apricotQty;
    public String apricotUom;

    public int jarQty;
    public int jarCapacity;

    public boolean isDietetic;



public ApricotJam(String sweetner){
    this.sweetner = sweetner;
    this.sweetnerQty = sweetnerQty;

}

    public ApricotJam(String sweetner, float sweetnerQty, String sweetnerUom, float apricotQty, String apricotUom, int jarQty, int jarCapacity, boolean isDietetic) {
        this.sweetner = sweetner;
        this.sweetnerQty = sweetnerQty;
        this.sweetnerUom = sweetnerUom;
        this.apricotQty = apricotQty;
        this.apricotUom = apricotUom;
        this.jarQty = jarQty;
        this.jarCapacity = jarCapacity;
        this.isDietetic = isDietetic;
    }

    public void makeJam() {
    System.out.println("Adding " + sweetnerQty + " " + sweetnerUom + " of " + sweetner);
    System.out.println("Also adding: " + apricotQty + " " + apricotQty + " of apricot" );
    System.out.println("Boiling for " + preparationTime() + " minutes");
    System.out.println("Is dietetic?" + isDietetic);
}
private int preparationTime(){
    return 30;
}


    @Override

    public String toString(){
    return "ApricotJam{" +
            "sweetener='" + sweetner + '\'' +
            ", sweetenerQty=" + sweetnerQty +
            ", sweetenerUom='" + sweetnerUom + '\'' +
            ", apricotQty=" + apricotQty +
            ", apricotUom='" + apricotUom + '\'' +
            ", jarQty=" + jarQty +
            ", jarCapacity=" + jarCapacity +
            ", isDietetic=" + isDietetic +
            '}';
}
}

