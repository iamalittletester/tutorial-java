package com.imalittletester.jam;

public class Jam extends Fruit{
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;
    public Fruit fruit;
    public Recipient recipient;
    public boolean isDietetic;

    public Jam (String sweetener, float sweetenerQty, String sweetenerUom, Fruit fruit, Recipient recipient, boolean isDietetic){
        super (fruit.fruitName, fruit.fruitQty, fruit.fruitUom);
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.recipient = recipient;
        this.fruit = fruit;
    }

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom, Fruit fruit, boolean isDietetic) {
        super (fruit.fruitName, fruit.fruitQty, fruit.fruitUom);
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.isDietetic = isDietetic;
    }

    public Jam (String sweetener, float sweetenerQty, String sweetenerUom, boolean isDietetic){
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

    public boolean isDietetic() {
        return isDietetic;
    }


    public void makeJam (){
        System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
        System.out.println("Is jam dietetic? " + isDietetic);
        System.out.println("Also adding " + fruit.fruitQty + " " + fruit.fruitUom + " of apricots");
        System.out.println("Boiling for " + preparationTime() + " minutes");
        System.out.println("Bottling in: " + recipient.recipientQty + " jars of capacity: "+ recipient.recipientCapacity);

    }


    private int preparationTime() {
        return  30;
    }

    @Override
    public String toString() {
        return "Jam{" +
                "sweetener='" + sweetener + '\'' +
                ", sweetenerQty=" + sweetenerQty +
                ", sweetenerUom='" + sweetenerUom + '\'' +
                ", fruit=" + fruit +
                ", recipient=" + recipient +
                ", isDietetic=" + isDietetic +
                '}';
    }
}
