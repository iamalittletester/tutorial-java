package com.imalittletester.cookies;

public class CookieJar {
    //fields
    public String name;
    public String value;
    public String domain;
    public int size;
    public boolean httpOnly;
    public boolean secure;
    public String priority;

    public CookieJar (String name, String value) {
        this.name = name;
        this.value = value;
    }

    public CookieJar (String name, String value, String domain, int size, boolean httpOnly, boolean secure, String priority) {
        this.name = name;
        this.value = value;
        this.size = size;
        this.httpOnly = httpOnly;
        this.secure = secure;
        this.priority= priority;

    }

    public boolean isProvidedParamSubDomainOfDomain () {
        return false;
    }

    @Override
    public String toString (){
        return "CookieJar{" +
                "name='" + name + '\'' +
                ", value=" + value +
                ", size='" + size + '\'' +
                ", httpOnly=" + httpOnly +
                ", secure='" + secure + '\'' +
                ", priority=" + priority +
                '}';
    }
}

