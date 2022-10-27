package com.imalittletester.jam;


import com.imalittletester.cookie.CookieFields;
import org.junit.jupiter.api.Test;

public class CookieFieldsTest {

    public CookieFields cookieFields1 = new CookieFields("consent", "en_US", ".google.com", "2024-01-14T08:18:55.466Z", 50, false);
   public CookieFields cookieFields2 = new CookieFields("google.com");

    @Test

    void cookieTest(){

        System.out.println(cookieFields1);

        cookieFields1.displayCookie();

        System.out.println("Is the provided param a subdomain of domain?" + cookieFields2.isProvidedParamSubDomainOfDomain("google"));

    }

}
