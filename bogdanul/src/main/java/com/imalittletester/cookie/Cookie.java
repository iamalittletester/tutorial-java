package com.imalittletester.cookie;

public class Cookie {
    public String name;
    public String value;
    public String domain;
    public int size;
    public boolean httpOnly;
    public String expires;

    public Cookie() {
    }

    public Cookie(String name, String value, String domain, int size, boolean httpOnly, String expires) {
        this.name = name;
        this.value = value;
        this.domain = domain;
        this.size = size;
        this.httpOnly = httpOnly;
        this.expires = expires;
    }

    public Cookie(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public void printCookieValues() {
        System.out.println("This Cookie has the name: " + name);
        System.out.println("The value of this cookie is: " + value);
        System.out.println("The domain is: " + domain);
        System.out.println("The size of the cookie is: " + size);
        System.out.println("Http only? " + httpOnly);
        System.out.println("This cookie expires on: " + expires);
    }

    public boolean isProvidedParamSubDomainOfDomain(String subDomain) {
        boolean isSubString = domain.contains(subDomain);
        return isSubString;
    }
}
