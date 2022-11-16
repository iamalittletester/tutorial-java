package com.imalittletester.jam;

import java.util.ArrayList;
import java.util.List;

public class Fruit {
    public String fruitName;
    public float fruitQty;
    public String fruitUom;
    List<Fruit> fruits = new ArrayList("apple", "peach", "melon");

    public Fruit (String fruitName, float fruitQty, String fruitUom) {
        this.fruitName = fruitName;
        this.fruitQty = fruitQty;
        this.fruitUom = fruitUom;
    }

    public Fruit (){

    }

    @Override
    public String toString() {
        return "Fruit{" +
                "fruitName='" + fruitName + '\'' +
                ", fruitQty=" + fruitQty +
                ", fruitUom='" + fruitUom + '\'' +
                '}';
    }
}
