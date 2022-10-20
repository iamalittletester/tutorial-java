package com.imalittletester.jam;

import com.imalittletester.cookies.GarminCookie;
import org.junit.jupiter.api.Test;

public class GarminCookieTest {

    public GarminCookie garminCookie1 = new GarminCookie("connect", "abcdef",".connect.garmin.com", 123, true, "2023-09", true, "Medium");
    public GarminCookie garminCookie2 = new GarminCookie("garmin.com");

    @Test
    void garminCookieTest(){
        System.out.println(garminCookie1);

        garminCookie1.displayGarminCookie();

        System.out.println("Is the param a subdomain of domain? " + garminCookie2.isProvidedParamSubDomainOfDomain("garmin"));
    }

}
