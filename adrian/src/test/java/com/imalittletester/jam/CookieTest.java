package com.imalittletester.jam;


import garminSiteCookies.CookieModel;
import org.junit.jupiter.api.Test;

public class CookieTest {

    public CookieModel cookieModel = new CookieModel();
    public CookieModel cookieModel2 = new CookieModel("consent", "OK");
    public CookieModel cookieModel3 = new CookieModel("Garmin SSO", "1", "garmin.com", "/sso", 2023, true);

    @Test
    void firstTest (){
        System.out.println(cookieModel);
        System.out.println(cookieModel2);
        cookieModel3.displayCookieValues();
        cookieModel3.isProvidedParamSubDomainOfDomain("garmin");
    }
}
