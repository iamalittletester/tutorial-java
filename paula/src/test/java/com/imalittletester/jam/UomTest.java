package com.imalittletester.jam;

import com.imalittletester.utils.UnitOfMeasureConverter;
import org.junit.jupiter.api.Test;

public class UomTest {
        public UnitOfMeasureConverter unitOfMeasureConverter = new UnitOfMeasureConverter();
        public ApricotJam apricotJam3 = new ApricotJam("brown sugar", 1.5f, "kg", new Jar(30, 500), 10, "kg");


        @Test
        void firstTest() {
                unitOfMeasureConverter.distanceInMetersUsingIf("km", 1222);
                unitOfMeasureConverter.qtyInGramsUsingIf(apricotJam3.sweetenerUom, apricotJam3.sweetenerQty);
        }
}
