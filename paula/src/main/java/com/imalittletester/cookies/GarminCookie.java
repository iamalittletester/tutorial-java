package com.imalittletester.cookies;

public class GarminCookie {

    public String name;
    public String value;
    public String domain;
    public String priority;
    public int size;
    public boolean httpOnly;
    public boolean secure;

    public GarminCookie() { }

    public GarminCookie(String name, String value) {
        this.name = name;
        this.value = value;
    }

    public GarminCookie(String name, String value, String domain, String priority, int size, boolean httpOnly, boolean secure) {
        this.name = name;
        this.value = value;
        this.domain = domain;
        this.priority = priority;
        this.size = size;
        this.httpOnly = httpOnly;
        this.secure = secure;
    }

    @Override
    public String toString() {
        return "GarminCookie{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", domain='" + domain + '\'' +
                ", priority='" + priority + '\'' +
                ", size=" + size +
                ", httpOnly=" + httpOnly +
                ", secure=" + secure +
                '}';
    }

    public void displayCookieValues(){
        System.out.println("The name of the cookie is: " + name);
        System.out.println("The value of the cookie is: " + value);
        System.out.println("The domain of the cookie is: " + domain);
        System.out.println("The priority of the cookie is: " + priority);
        System.out.println("The size of the cookie is: " + size);
    }

    public boolean isProvidedParamSubDomainOfDomain(String subdomain){
    return domain.contains(subdomain);
    }
}
