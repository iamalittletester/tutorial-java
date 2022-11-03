package com.imalittletester.utils;

public class UnitOfMeasureConverter {
    public double qtyInGramsUsingIf2(String uom, double qty){
        double mustMultipleBy =1;
        //equalsIgnoreCase - nu tine cont de uppercase sau lowercase
        if(uom.equalsIgnoreCase("kg") || uom.equalsIgnoreCase("kilograms")){
            mustMultipleBy = 1000;
        }
        if (uom.equalsIgnoreCase("micrograms")){
            mustMultipleBy = 0.0001;
        }
        return qty * mustMultipleBy;
    }
}
