package com.imalittletester.homeworksite;

import java.util.Date;

public class GarminCookie {
    public String cookieName;
    public String cookieValue;
    public String domain;
    public Date cookieExpiration;
    public boolean httpOnly;
    public boolean secure;
    public int cookieSize;

    public GarminCookie(String cookieName, String cookieValue){
        this.cookieName = cookieName;
        this.cookieValue = cookieValue;
    }

    public GarminCookie(String cookieName, String cookieValue, String domain, Date cookieExpiration, boolean httpOnly,
                        boolean secure, int cookieSize) {
        this.cookieName = cookieName;
        this.cookieValue = cookieValue;
        this.domain = domain;
        this.cookieExpiration = cookieExpiration;
        this.httpOnly = httpOnly;
        this.secure = secure;
        this.cookieSize = cookieSize;
    }

    public void showCookie(String cookieName, String cookieValue, Date cookieExpiration, boolean secure, int cookieSize){
        System.out.println("Acest site foloseste cookie-ul "+ cookieName + " cu valoarea " + cookieValue + ".");
        System.out.println("Cookie-ul are dimensiunea " + cookieSize + " biti si expira in " + cookieExpiration + ".");
        System.out.println("Este un cookie secure? " + secure);
    }

    public boolean isProvidedParamSubDomainOfDomain(String param){
        return domain.contains(param);
    }

    public void multipleOf7 (int max){
        for (int i = 1 ; i <= max ; i++){
            if (i % 7 == 0 ) {
                System.out.println(i);
            }
        }
    }




}
