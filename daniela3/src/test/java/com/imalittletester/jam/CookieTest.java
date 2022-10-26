package com.imalittletester.jam;

import com.imalittletester.cookies.CookieStructure;
import org.junit.jupiter.api.Test;

public class CookieTest {

    public CookieStructure cookieStructure = new CookieStructure();
    public CookieStructure cookieStructure2 = new CookieStructure("consent", "bla bla bla");
    public CookieStructure cookieStructure3 = new CookieStructure("Garmin SSO", "1", "garmin.com", "/sso", 2023, true);

    @Test
    void firstTest (){
        System.out.println(cookieStructure);
        System.out.println(cookieStructure2);
        cookieStructure3.displayCookieValues();
        System.out.println(cookieStructure3.isProvidedParamSubDomainOfDomain("garmin"));
    }
}
