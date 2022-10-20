package com.imalittletester.jam;

import com.imalittletester.cookies.GarminCookie;
import org.junit.jupiter.api.Test;

public class GarminCookieTest {

    public GarminCookie garminCookie1 = new GarminCookie("Brownie", "Sweet1", ".connect.garmin.com", 123, false, "15.10.2020", true, "medium", "strict");
    public GarminCookie garminCookie2 = new GarminCookie("garmin.com");

    @Test
    void GarminCookieTest() {
        System.out.println(garminCookie1);
        garminCookie1.displayGarminCookie();

        System.out.println("Is the provided param a subdomain of domain? " + garminCookie2.isProvidedParamSubDomainOfDomain("garmin"));
    }
}
