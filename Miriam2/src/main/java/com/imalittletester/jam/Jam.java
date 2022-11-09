package com.imalittletester.jam;

import java.util.Objects;

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

    public void makeJam(){
     //   System.out.println("Adding " + sweetenerQty + " " + sweetenerUom + "of " + sweetener);

        if (isDietetic == true) {
            System.out.println("Is dietetic?   YES");
        }
        else System.out.println("Is dietetic?   NO");
       // System.out.println("Is jam dietetic? " + isDietetic);
    }


    public double qtyInGramsUsingIf (String uom, double qty) {
        double mustMultiplyBy = 1;
        if (uom.equals("kg") || uom.equals("kilograms")) {// se poate folosi equalsIgnoreCase ca sa nu tina cont de litera mare sau mica
            mustMultiplyBy = 1000;
        }
        if (uom.equalsIgnoreCase("micrograms")){
            mustMultiplyBy = 0.0001;
        }
        return qty * mustMultiplyBy;
    }

        public double qtyInGramsUsingIfSimple (String uom, double qty){
            if (uom.equals("kg") || uom.equals("kilograms")) {
                return qty * 1000;
            }
            if (uom.equalsIgnoreCase("micrograms")){
                return qty / 1000;
            }

            return qty;
        }

//        public double qtyInGramsUsingSwitch (String uom, double qty){
//            double valueToReturn = 0;
//            switch (uom.toLowerCase()){
//                case "kg", "kilograms" -> {valueToReturn = qty * 1000;}
//                case "grams"-> {valueToReturn = qty;}
//                case "micrograms" -> {valueToReturn = qty / 1000;}
//            }
//            return valueToReturn;
//        }
//
//
//
//    public double qtyInGramsUsingSwitchSimple (String uom, double qty){
//        switch (uom.toLowerCase()){
//            case "kg", "kilograms" -> {return qty * 1000;}
//            case "grams"-> {return qty;}
//            case "micrograms" -> {return qty / 1000;}
//            default -> {return 0;}
//        }

    //}






    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jam jam = (Jam) o;
        return Float.compare(jam.sweetenerQty, sweetenerQty) == 0 && isDietetic == jam.isDietetic && Objects.equals(sweetener, jam.sweetener) && Objects.equals(sweetenerUom, jam.sweetenerUom);
    }

    @Override
    public int hashCode() {
        return Objects.hash(sweetener, sweetenerQty, sweetenerUom, isDietetic);
    }
}
