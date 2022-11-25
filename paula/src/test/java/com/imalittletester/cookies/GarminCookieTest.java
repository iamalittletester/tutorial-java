package com.imalittletester.cookies;
import org.junit.jupiter.api.Test;

public class GarminCookieTest {
    public GarminCookie cookieDefault = new GarminCookie();
    public GarminCookie cookieNameAndValue = new GarminCookie("usersync", "eNqd1E0KwjAQBeC7ZN1FfmYmSa8iIlKzCNS2N");
    public GarminCookie cookieAll = new GarminCookie("notice_poptime", "1662667200000", ".garmin.com", "Medium", 27,
            false, true);
    @Test
    void firstCookieTest() {
        System.out.println(cookieDefault);
        System.out.println(cookieNameAndValue);
        System.out.println(cookieAll + "\n");
        cookieAll.displayCookieValues();
        System.out.println("\nIs provided param subdomain of domain?: " + cookieAll.isProvidedParamSubDomainOfDomain("garmin"));
        System.out.println("Is provided param subdomain of domain?: " + cookieAll.isProvidedParamSubDomainOfDomain("google"));

    }
}
