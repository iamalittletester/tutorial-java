package com.imalittletester.utils;

public class UnitOfMeasureConverter {

    public double qtyInGramsUsingIf(String uom, double qty) {
        double mustMultiplyBy = 1;
        if (uom.equalsIgnoreCase("kg") || uom.equalsIgnoreCase("kilograms")) {
            mustMultiplyBy = 1000;
        }
        if (uom.equalsIgnoreCase("micrograms")) {
            mustMultiplyBy = 0.0001;
        }
        return qty * mustMultiplyBy;
    }

    public double distanceInMetersUsingIf(String uom, double qty) {
        return 0;
    }
}
