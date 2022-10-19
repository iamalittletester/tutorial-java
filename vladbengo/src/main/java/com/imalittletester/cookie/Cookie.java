package com.imalittletester.cookie;

public class Cookie {
//fields
    public String cookieName;
    public String cookieValue;
    public String cookieDomain;
    public int cookieExpirationDate;
    public int cookieSize;
    public boolean cookieIsHttpOnly;

    //constructor

    public Cookie(String name, String value) {
        this.cookieName = name;
        this.cookieValue = value;
    }

    public Cookie(String name, String value, String domain, int expirationDate, int size, boolean httpOnly){
        this.cookieName = name;
        this.cookieValue = value;
        this.cookieDomain = domain;
        this.cookieExpirationDate = expirationDate;
        this.cookieSize = size;
        this.cookieIsHttpOnly = httpOnly;
    }

    public boolean isProvidedParamSubDomainOfDomain () {
        return false;
    }

    @Override
    public String toString (){
        return "Cookie{" +
                "name = '" + cookieName + '\'' +
                ", value = " + cookieValue +
                ", domain " + cookieDomain +
                ", expirationDate " + cookieExpirationDate + '\'' +
                ", size = '" + cookieSize + '\'' +
                ", httpOnly = " + cookieIsHttpOnly +
                '}';
    }

}
