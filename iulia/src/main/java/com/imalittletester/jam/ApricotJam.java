package com.imalittletester.jam;

import java.util.Objects;

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

    public ApricotJam(String sweetener, float sweetenerQty, String sweetenerUom, float apricotQty, String apricotUom, Jar jar) {
        super(sweetener, sweetenerQty, sweetenerUom);
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ApricotJam that = (ApricotJam) o;
        return Float.compare(that.apricotQty, apricotQty) == 0 && Objects.equals(apricotUom, that.apricotUom) && Objects.equals(jar, that.jar);
    }

    @Override
    public int hashCode() {
        return Objects.hash(apricotQty, apricotUom, jar);
    }



    public int howManyFullJars (int jamQtyInGrams) {
        return jamQtyInGrams / jar.jarCapacity;
    }

    public int remainderJam (int jamQtyInGrams) {
        return jamQtyInGrams % jar.jarCapacity;
    }
}





