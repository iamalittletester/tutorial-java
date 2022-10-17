package com.imalittletester.garmincookies;

import java.util.Date;

public class CookieStructure {

    public String name;
    public int size;
    public long value;
    public boolean httpOnly;
    public char secure = '✓';
    public String priority;
    public Date expirationDate;
    private boolean isProvidedParamSubDomainOfDomain;

    public CookieStructure () { //constructor default
    }

    public CookieStructure(String name, int size, long value, boolean httpOnly, char secure, String priority, Date expirationDate, boolean isProvidedParamSubDomainOfDomain) {
        this.name = name;
        this.size = size;
        this.value = value;
        this.httpOnly = httpOnly;
        this.secure = secure;
        this.priority = priority;
        this.expirationDate = expirationDate;
        this.isProvidedParamSubDomainOfDomain = isProvidedParamSubDomainOfDomain;
    }//constructor with all fields


    public CookieStructure(String name, long value) {
        this.name = name;
        this.value = value; //constructor name and value
    }

    @Override
    public String toString() {
        return "CookieStructure{" +
                "name='" + name + '\'' +
                ", size=" + size +
                ", value=" + value +
                ", httpOnly=" + httpOnly +
                ", secure=" + secure +
                ", priority='" + priority + '\'' +
                ", expirationDate=" + expirationDate +
                ", isProvidedParamSubDomainOfDomain=" + isProvidedParamSubDomainOfDomain +
                '}';
    }


    public boolean isProvidedParamSubDomainOfDomain() {
        return isProvidedParamSubDomainOfDomain;
    }


    }

