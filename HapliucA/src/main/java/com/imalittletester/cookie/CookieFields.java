package com.imalittletester.cookie;

public class CookieFields {
    public String name;
    public String value;
    public String domain;
    public String expires;
    public int size;
    public boolean secure;

    //Simple constructor
    public CookieFields(){}

    //Constructor with name
    public CookieFields(String domain){
        this.domain = domain;

    }

    //Constructor with the 6 defined fields

    public CookieFields(String name, String value, String domain, String expires, int size, boolean secure){
        this.name = name;
        this.value = value;
        this.domain = domain;
        this.expires = expires;
        this.size = size;
        this.secure = secure;

    }




    //Method to display 5-6 class fields
    public void displayCookie(){
        System.out.println("The application name is" + ":" + " " + name);
        System.out.println("The value of the " + name + " " + "is" + " " + value);
        System.out.println("On this application the domain is" + ":" + domain);
        System.out.println("The size and expiration for " + name + " " + "are" + ":" + " " + "size - " + size + " " + "&" + " " + "expires - " + expires);
        System.out.println("Is this marked as secured?" + " " + "-" + " " + "The answer is:" + " " + secure);
    }

    //Method to return bool if Domain is provided

    public boolean isProvidedParamSubDomainOfDomain (String subdomain) {
        return domain.contains(subdomain);
    }

    @Override
    public String toString() {
        return "CookieFields{" +
                "name='" + name + '\'' +
                ", value='" + value + '\'' +
                ", domain='" + domain + '\'' +
                ", expires=" + expires +
                ", size=" + size +
                ", secure=" + secure +
                '}';
    }
}
