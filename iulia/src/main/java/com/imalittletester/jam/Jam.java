package com.imalittletester.jam;

public class Jam {

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

    public void makeJam() {
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " " + "of " + sweetener);
        System.out.println("Is jam dietetic? " + isDietetic);


    }

    // exercitiu

    // in Jam class add the following fields:
    // public float fruitQty;
    // public String fruitUom;
    // public String fruitType;

    // delete ApricotJam and MelonJam classes.
    // update the constructor Jam in the Jam class with the following:
    // public Jam(String sweetener, float sweetenerQty, String sweetenerUom,String fruitType, String fruitUom, float fruitQty, boolean isDietetic) {
    //         this.fruitType = fruitType;
    //         this.fruitQty = fruitQty;
    //         this.fruitUom = fruitUom;

    //update the method in Jam class:
    //public void makeJam(){
    //        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " " + "of " + sweetener);
    //        System.out.println("Also adding " +fruitQty + " " + fruitUom + " " + fruitType);
    //        System.out.println("Boiling for "+ preparationTime()+" minutes");
    //        System.out.println("Is jam dietetic? " + isDietetic);


    // update the test class:
    //    public Jam apricotJam = new Jam(new Jam("sugar cane", 1, "kg","apricot", 3, "kg), ,new Jar(500,30),true );
    //    public Jam melonJam = new Jam(new Jam("stevia", 2, "kg","melon", 3, "kg), ,new Bottle(500,30),false );

    // create new test example:
    // void apricotJamTest() {
    //        apricotJam.makeJam();

    // void melonJamTest () {
    //        melonJam.makeJam();


    // alta rezolvare ar fi sa facem 2 metode:
    //public void makeApricotJam(){
    //        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " " + "of " + sweetener);
    //        System.out.println("Also adding " +fruitQty + " " + fruitUom + " " + fruitType);
    //        System.out.println("Boiling for "+ preparationTime()+" minutes");
    //        System.out.println("Is jam dietetic? " + isDietetic);

    //public void makeMelonJam(){
    //         System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " " + "of " + sweetener);
    //         System.out.println("Adding " + fruitQty + " " + fruitUom + " " + fruitType);
    //         System.out.println("Bottling in: " + bottle.bottleQty + " of capacity: " + bottle.bottleCapacity);
    //         System.out.println("Is jam dietetic? " + isDietetic);

    //obiectele raman:
    // public Jam apricotJam = new Jam(new Jam("sugar cane", 1, "kg","apricot", 3, "kg), ,new Jar(500,30),true );
    // public Jam melonJam = new Jam(new Jam("stevia", 2, "kg","melon", 3, "kg), ,new Bottle(500,30),false );

    // create new test example:
    // void apricotJamTest() {
    //        apricotJam.makeApricotJam();

    // void melonJamTest () {
    //        melonJam.makeMelonJam();




}

