package com.imalittletester.jam;

import java.util.Arrays;
import java.util.List;

public class Jam extends Fruit{
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;
    public Fruit fruit;
    public Recipient recipient;
    public boolean isDietetic;
    public List<String> fruits = Arrays.asList("apple", "peach", "melon");

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

    public <E> Jam(float fruitQty, List<E> apple) {
    }

    public static int get(int i) {
        return i;
    }


    public boolean isDietetic() {
        return isDietetic;
    }

    public Jam (String sweetener, float sweetenerQty, String sweetenerUom, Float fruitQty, List<String> fruits) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.fruitQty = fruitQty;
        this.fruits = fruits;
    }

    public Jam (List<String> fruits){
        this.fruits = fruits;
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
