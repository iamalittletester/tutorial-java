package com.imalittletester.jam;

public class Jam {
    //Pentru a extrage datele fructului separat, putem declara in Jam
    // cele doua calitati ale fructului pe care le folosim la Jam:
    //    public float fruitQty;
    //    public String fruitUom;
    //Si putem mai departe sa facem un constructor care sa initalizeze detaliile fructului (daca se pot pune 2 supers in
    // ApricotJam/MelonJam constructors), care sa inlocuiasca cele doua linii de atribuire a detaliilor fructului
    // in ApricotJam si MelonJam;
    //
    // Sau optiunea a doua, scoatem fructul ca si clasa diferita, in rand cu Jar si Bottle si il folosim in Jam contructors,
    //apoi mai departe modificam super calls in ApricotJam si MelonJam.

    //fields
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;

    public boolean isDietetic;

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom, boolean isDietetic) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.isDietetic = isDietetic;
    }

    public Jam() {
    }

    public Jam(String sweetener) {
        this.sweetener = sweetener;
    }

    public void makeJam(){
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        System.out.println("Is jam dietetic? " + isDietetic);
    }
}
