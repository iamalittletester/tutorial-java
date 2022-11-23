package com.imalittletester.cookie;

import com.imalittletester.jam.AppricotJam;
import org.junit.jupiter.api.Test;

public class CookieTest {
    public Cookie cookie2 = new Cookie("en.garmin.com");

    @Test
    void TestCookie() {

     cookie2.isProvidedParamSubDomainOfDomain("en");
        System.out.println(cookie2.isProvidedParamSubDomainOfDomain("en"));
        System.out.println(cookie2.isProvidedParamSubDomainOfDomain("ro"));
    }
}
