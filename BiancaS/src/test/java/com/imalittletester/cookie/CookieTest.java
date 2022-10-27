package com.imalittletester.cookie;

import org.junit.jupiter.api.Test;

public class CookieTest {
    public Cookie cookie1 = new Cookie ("Garmin", "Test","garmin.com","/","2022-10-26", 50, true,false,"garmin.com", true, "none", "none");

    public Cookie cookie2 = new Cookie ("en.garmin.com");

    @Test
    void firstTest () {
      cookie1.showCookie();
        cookie2.showCookie();
        cookie2.isProvidedParamSubDomainOfDomain("en");
        System.out.println(cookie2.isProvidedParamSubDomainOfDomain("en"));
        System.out.println(cookie2.isProvidedParamSubDomainOfDomain("ro"));

    }

}
