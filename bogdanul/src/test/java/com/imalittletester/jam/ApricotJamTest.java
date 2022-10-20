package com.imalittletester.jam;

import com.imalittletester.cookie.Cookie;
import org.apache.commons.lang3.builder.ToStringExclude;
import org.testng.annotations.Test;

import java.io.File;
import java.util.Date;

public class ApricotJamTest {

    public int aPositiveInt = -10;
    public long aPositiveLong = -1000000000;
    public float aFloat = 500;
    public double aDouble = 1.2;
    public boolean aBoolean;
    public String aSweetener = "sugar\ncane";
    public Date newDate;

    public ApricotJam apricotJam = new ApricotJam();
    public ApricotJam apricotJam2 = new ApricotJam("white sugar");
    public ApricotJam apricotJam3 = new ApricotJam("sugar cane", 1.5f, "kg", 10,
            "kg", 30, 500, true);

    public Cookie cookie = new Cookie("SESSION", "2b168afd-513c-4745-8c87-6d7a45193fe0");
    public Cookie cookie2 = new Cookie("CONSENT", "Yes", "garmin.ro", 42, true,
            "2038-01-10T8:00:01.7Z");

    public MelonJam melonJam = new MelonJam("plain sugar", 10, "kg", 10,
            "kg",new Bottle (20, 1000), false);


    @Test
    void thirdTest() {
        apricotJam3.makeJam();
        System.out.println("-------------");
        melonJam.makeJam();
    }

    @Test
    void secondTest() {

        System.out.println(apricotJam);
        System.out.println(apricotJam2);

        System.out.println(apricotJam3);
        apricotJam3.makeJam();
        System.out.println(apricotJam3.sweetener);

        apricotJam3.sweetener.contains("sugar");

        melonJam.makeJam();
    }

    @Test
    void firstTest() {
//        System.out.println(aPositiveInt);
//        System.out.println(aPositiveLong);
//        System.out.println(aFloat);
//        System.out.println(aDouble);
//        System.out.println(aBoolean);
//        System.out.println("->> " + aSweetener);
    }

    @Test
    void cookieTest() {
        cookie.printCookieValues();
        cookie2.printCookieValues();

        System.out.println("Is garmin a subdomain of " + cookie2.domain + "? " + cookie2.isProvidedParamSubDomainOfDomain("garmin"));
        System.out.println("Is asdada a subdomain of " + cookie2.domain + "? " + cookie2.isProvidedParamSubDomainOfDomain("asdada"));
    }
}