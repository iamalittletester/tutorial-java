package com.imalittletester.cookie;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class Cookie {
    public String name;
    public String value;
    public String domain;
    public String path;
    public String expires;
    public int size;
    public boolean httpOnly;
    public boolean secure;
    public String sameSite;
    public boolean sameParty;
    public String partitionKey;
    public String priority;

    //priority can be an enum type
    //default constructor
    public Cookie() {
    }

    //constructor only name and value
    public Cookie(String domain) {

        this.domain = domain;
    }

    public Cookie(String name, String value, String domain, String path, String expires, int size, boolean httpOnly, boolean secure, String sameSite, boolean sameParty, String partitionKey, String priority) {
        this.name = name;
        this.value = value;
        this.domain = domain;
        this.path = path;
        this.expires = expires;
        this.size = size;
        this.httpOnly = httpOnly;
        this.secure = secure;
        this.sameSite = sameSite;
        this.sameParty = sameParty;
        this.partitionKey = partitionKey;
        this.priority = priority;
    }

    public void diplayCookie() {
        System.out.println("The name of the cookie is " + name + "with the domain " + domain);
        System.out.println("The value of the cookie is: " + value);
        System.out.println("The domain of the cookie is: " + domain);
        System.out.println("To access the cookie " + name + " use the path: " + path);
        System.out.println("The cookie " + name + " with domain " + domain + " expires on " + expires);
    }

    //Not sure about the requirements, but on CookieTest.java returns false or true based on entered value
    public boolean isProvidedParamSubDomainOfDomain(String isSubDomainOfDomain) {
        if (domain.contains(isSubDomainOfDomain)) {
            return true;
        } else {
            return false;
        }
    }
}