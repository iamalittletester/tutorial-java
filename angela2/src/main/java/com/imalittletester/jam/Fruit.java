package com.imalittletester.jam;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Fruit {
    public String fruitName;
    public float fruitQty;
    public String fruitUom;



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
