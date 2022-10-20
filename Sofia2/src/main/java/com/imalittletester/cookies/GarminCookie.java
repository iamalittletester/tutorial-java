package com.imalittletester.cookies;

import com.imalittletester.jam.ApricotJam;
import org.w3c.dom.ls.LSOutput;

public class GarminCookie {

    public String name;
    public String value;
    public String domain;
    public int size;
    public boolean httpOnly;
    public String expires;
    public boolean secure;
    public String priority;
    public String sameSite;


    // Empty constructor

    public GarminCookie() {
    }

    // Constructor with only name and value

    public GarminCookie(String name, String value) {
        this.name = name;
        this.value = value;
    }
    // Constructor with all defined fields

    public GarminCookie(String name, String value, String domain, int size, boolean httpOnly, String expires, boolean secure, String priority, String sameSite) {
        this.name = name;
        this.value = value;
        this.domain = domain;
        this.size = size;
        this.httpOnly = httpOnly;
        this.expires = expires;
        this.secure = secure;
        this.priority = priority;
        this.sameSite = sameSite;
    }

    public GarminCookie(String domain){
        this.domain = domain;
    }

    // A method that displays 5 class fields

    public void displayGarminCookie() {
        System.out.println("Cookie name is: " + name);
        System.out.println("Cookie value is: " + value);
        System.out.println("Cookie domain is: " + domain);
        System.out.println("Cookie size is: " + size);
        System.out.println("Cookie httpOnly is: " + httpOnly);
        System.out.println("Cookie expires is: " + expires);
        System.out.println("Cookie secure is: " + secure);
        System.out.println("Cookie priority is: " + priority);
        System.out.println("Cookie sameSite is: " + sameSite);
    }
    // A method that returns boolean
    public boolean isProvidedParamSubDomainOfDomain(String subdomain){
        return domain.contains(subdomain);
    }

    @Override
    public String toString(){
        return "GarminCookie{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", domain=" + domain +
                ", priority=" + priority +
                ", sameSite='" + sameSite+ '\'' +
                '}';
    }
}

