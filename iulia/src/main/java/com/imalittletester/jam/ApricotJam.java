package com.imalittletester.jam;

public class ApricotJam extends Jam {

    //fields - to describe state (ex proprietatile unui obiect)
    //       - trebuie sa aiba visibility attribute + type (primitiv sau obiect) + si trebuie sa ii dam nume
    //       - fieldul va fi definit in toate metodele care apartin clasei
    // primitive data types - int/ long/ byte/ short etc (numeric integral)


    public float apricotQty;
    public String apricotUom;

    public Jar jar;


    //method = grupare de linie de cod, deobicei se foloseste in mai multe locuri (se apeleaza metoda)
    //constructors = asignam valori fieldurilor definite in obiect

    public ApricotJam() {
    }
    public ApricotJam(String sweetener) {
        super(sweetener);
    }

    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom, Jar jar, boolean isDietetic) {
        super(sweetener, sweetenerQty, sweetenerUom, isDietetic);
        this.apricotQty = apricotQty;
        this.apricotUom = apricotUom;
        this.jar = jar;
    }

     @Override
      public void makeJam() {
        super.makeJam();
        System.out.println("Also adding " + apricotQty + " " + apricotUom + " of apricots");
        System.out.println("Boiling for "+ preparationTime()+" minutes");
    }


    //method
    private int preparationTime(){
        return 30;
    }
    //method
    @Override
    public String toString() {
        return "ApricotJam{" +
                "sweetener='" + sweetener + '\'' +
                ", sweetenerQty=" + sweetenerQty +
                ", sweetenerUom='" + sweetenerUom + '\'' +
                ", apricotQty=" + apricotQty +
                ", apricotUom='" + apricotUom + '\'' +
                ", isDietetic=" + isDietetic +
                '}';
    }
}





