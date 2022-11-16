package com.imalittletester.jam;

import com.imalittletester.utils.UnitOfMeasureConverter;
import org.testng.annotations.Test;

public class UomTest {
    public UnitOfMeasureConverter unitOfMeasureConverter = new UnitOfMeasureConverter();
    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f, "kg", 10, "kg", 30, 500, true);


    @Test
    void firstTest() {
        unitOfMeasureConverter.distanceInMetersUsingIf("km", 1222);
        unitOfMeasureConverter.qtyInGramsUsingIf(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty);
    }

}
