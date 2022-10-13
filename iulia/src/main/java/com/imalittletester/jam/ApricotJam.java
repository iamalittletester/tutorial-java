package com.imalittletester.jam;

public class ApricotJam {

    //fields - to describe state (ex proprietatile unui obiect)
    //       - trebuie sa aiba visibility attribute + type (primitiv sau obiect) + si trebuie sa ii dam nume
    //       - fieldul va fi definit in toate metodele care apartin clasei
    // primitive data types - int/ long/ byte/ short etc (numeric integral)

    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;

    public float apricotQty;
    public String apricotUom;

    public int jarQty;
    public int jarCapacity;

    public boolean isDietetic;


    //method = grupare de linie de cod, deobicei se foloseste in mai multe locuri (se apeleaza metoda)
    //constructors = asignam valori fieldurilor definite in obiect

    public ApricotJam() {
    }

    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom, int jarQty, int jarCapacity, boolean isDietetic) {
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
        System.out.println("Also adding " + apricotQty + " " + apricotUom + " of apricots");
        System.out.println("Boiling for "+ preparationTime()+" minutes");
        System.out.println("Is dietetic? "+ isDietetic);
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
                ", jarQty=" + jarQty +
                ", jarCapacity=" + jarCapacity +
                ", isDietetic=" + isDietetic +
                '}';
    }
}





