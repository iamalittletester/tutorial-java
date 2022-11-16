package com.imalittletester.jam;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

public class Jam{
    //To optimize classes I would extract the fruit doing the following: create a Fruit class with the common fields
    // such as fruitName, fruitQty, fruitUom; then I would make the necessary changes - delete the ApricotJam and MelonJam classes,
    // replace the specific fields with fields from Fruit class in Jam class;
    // I would also create a Recipient class and delete the Bottle and Jar classes and make the necessary changes in the
    // other classes, including ApricotJamTest which becomes JamTest. I already made the changes on another branch, so I can push them if needed.
    public String sweetener;
    public float sweetenerQty;
    public String sweetenerUom;
    public Boolean isDietetic;

    public Jam(String sweetener, float sweetenerQty, String sweetenerUom) {
        this.sweetener = sweetener;
        this.sweetenerQty = sweetenerQty;
        this.sweetenerUom = sweetenerUom;
        this.isDietetic = (sweetener.equals("stevia") || sweetener.equals("sucralose"));


    }


    public Jam() {
    }

    public Jam(String sweetener) {
        this.sweetener = sweetener;
    }

    public double qtyInGramsUsingIf (String uom, double qty) {
        double mustMultiplyBy = 1;
        if (uom.equalsIgnoreCase ("kg") || uom.equalsIgnoreCase ("kilograms")) {
            mustMultiplyBy = 1000;
        }
        if (uom.equalsIgnoreCase("micrograms")) {
            mustMultiplyBy = 0.0001;
        }
        return qty * mustMultiplyBy;

    }

    public double qtyInGramsUsingIfSimple (String uom, double qty) {
        if (uom.equalsIgnoreCase ("kg") || uom.equalsIgnoreCase ("kilograms")) {
            return qty * 1000;
        }
        if (uom.equalsIgnoreCase("micrograms")) {
            return qty / 1000;
        }

        return qty;
}

public double qtyInGramsUsingSwitch (String uom, double qty) {
        double valueToReturn = 0;
        switch (uom.toLowerCase()) {
            case "kg", "kilograms" -> {valueToReturn = qty * 1000;}
            case "grams" -> {valueToReturn = qty;}
            case "micrograms" -> {valueToReturn = qty / 10000;}
        }
        return valueToReturn;
}

    public double qtyInGramsUsingSwitchSimple (String uom, double qty) {
        switch (uom.toLowerCase()) {
            case "kg", "kilograms" -> {return qty * 1000;}
            case "grams" -> {return qty;}
            case "micrograms" -> {return qty / 10000;}
            default -> {return 0;}
        }

    }


  public void makeJam (){
       System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + " of " + sweetener);
      if (isDietetic == true) {
          System.out.println("Is jam dietetic? Yes");}
      else {
          System.out.println("Is jam dietetic? No");
      }
  }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jam jam = (Jam) o;
        return Float.compare(jam.sweetenerQty, sweetenerQty) == 0 && Objects.equals(sweetener, jam.sweetener) && Objects.equals(sweetenerUom, jam.sweetenerUom) && Objects.equals(isDietetic, jam.isDietetic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetener, sweetenerQty, sweetenerUom, isDietetic);
    }
}
