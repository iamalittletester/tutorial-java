package com.imalittletester.garmincookies;

public class GarminCookies {
    //fields
    public String cookieName;
    public String cookieValue;
    public String cookieDomain;
    public String cookiePath;
    public String cookieMaxAge;
    public int cookieSize;
    public boolean cookieIsHttpOnly;
    public boolean cookieIsSecure;
    public String cookieHasSameSite;
    public boolean cookieIsSameParty;
    public String cookiePartitionKey;


    // Constructor with name and value
    public GarminCookies (String cookieName, String cookieValue) {
        this.cookieName = cookieName;
        this.cookieValue = cookieValue;
    }

    // Constructor with all defined fields
    public GarminCookies (String cookieName, String cookieValue, String cookieDomain, String cookiePath, String cookieMaxAge,
                          int cookieSize, boolean cookieIsHttpOnly, boolean cookieIsSecure, String cookieHasSameSite, boolean cookieIsSameParty, String cookiePartitionKey) {
        this.cookieName = cookieName;
        this.cookieValue = cookieValue;
        this.cookieDomain = cookieDomain;
        this.cookiePath = cookiePath;
        this.cookieMaxAge = cookieMaxAge;
        this.cookieSize = cookieSize;
        this.cookieIsHttpOnly = cookieIsHttpOnly;
        this.cookieIsSecure = cookieIsSecure;
        this.cookieHasSameSite = cookieHasSameSite;
        this.cookieIsSameParty = cookieIsSameParty;
        this.cookiePartitionKey = cookiePartitionKey;
    }




    public void returnCookies() {
        System.out.println("Cookie name is " + cookieName);
        System.out.println("Cookie value is " + cookieValue);
        System.out.println("Cookie domain is " + cookieDomain);
        System.out.println("Cookie path is " + cookiePath);
        System.out.println("Cookie expiration date is " + cookieMaxAge);
    }

    public boolean isProvidedParamSubDomainOfDomain (String x) {
        return x.contains(cookieDomain);
    }

    @Override
    public String toString() {
        return "GarminCookies{" +
                "cookieName='" + cookieName + '\'' +
                ", cookieValue='" + cookieValue + '\'' +
                ", cookieDomain='" + cookieDomain + '\'' +
                ", cookiePath='" + cookiePath + '\'' +
                ", cookieMaxAge='" + cookieMaxAge + '\'' +
                ", cookieSize=" + cookieSize +
                ", cookieIsHttpOnly=" + cookieIsHttpOnly +
                ", cookieIsSecure=" + cookieIsSecure +
                ", cookieHasSameSite='" + cookieHasSameSite + '\'' +
                ", cookieIsSameParty=" + cookieIsSameParty +
                ", cookiePartitionKey='" + cookiePartitionKey + '\'' +
                '}';
    }
}
