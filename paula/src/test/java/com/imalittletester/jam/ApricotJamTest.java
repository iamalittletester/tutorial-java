package com.imalittletester.jam;
import org.junit.jupiter.api.Test;

public class ApricotJamTest {
    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");  // ctrl P
    public ApricotJam apricotJam3 = new ApricotJam("brown sugar", 1.5f, "kg",10, "kg", 30, 500, false);

    @Test
    void firstTest() {
        System.out.println(apricotJam);     //sout tab
        System.out.println(apricotJam2);
        System.out.println(apricotJam3);

        apricotJam3.makeJam();
        //System.out.println(apricotJam3.sweetener);
        //apricotJam3.sweetener.contains("sugar");
    }
}