package com.imalittletester.cookies;

import com.imalittletester.cookies.CookieJar;
import org.junit.jupiter.api.Test;


import org.junit.jupiter.api.Test;


public class CookieJarTest {

    public CookieJar cookieJar1 = new CookieJar("SAPISID", "_q9P1hrCVJgedAEY/AHLr9hh8WoDOJwKYt");
    public CookieJar cookieJar2 = new CookieJar("SSID","ABT8AEeWIUUJ1H464", ".google.ro", 21, true, true, "High");

    @Test
    void cookieTest () {
        System.out.println(cookieJar1);
        System.out.println(cookieJar2);
        System.out.println(cookieJar2.isProvidedParamSubDomainOfDomain());
    }
}
