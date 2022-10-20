package com.imalittletester.cookies;

public class GarminCookie {

     String name;
     String value;
     String domain;
     int size;
     boolean httpOnly;
     String expires;
     boolean secure;
     String priority;

     // Empty constructor

     public GarminCookie(){}

     // Constructor with only name and value

     public GarminCookie(String name, String value){
          this.name = name;
          this.value = value;
     }

     // Constructor with all defined fields

     public GarminCookie(String name, String value, String domain, int size, boolean httpOnly, String expires, boolean secure, String priority){
          this.name = name;
          this.value = value;
          this.domain = domain;
          this.size = size;
          this.httpOnly = httpOnly;
          this.expires = expires;
          this.secure = secure;
          this.priority = priority;
     }

     public GarminCookie(String domain){
          this.domain = domain;
     }

     // Method that displays 5 class fields

     public void displayGarminCookie(){
          System.out.println("Cookie name is: " + name);
          System.out.println("Cookie value is: " + value);
          System.out.println("Cookie domain is: " + domain);
          System.out.println("Cookie size is: " + size);
          System.out.println("Is the cookie secure: " + secure);
     }

     // Method that return boolean

     public boolean isProvidedParamSubDomainOfDomain(String subdomain){
          return domain.contains(subdomain);
     }

     @Override
     public String toString(){
          return "GarminCookie{" +
                  "name='" + name + '\'' +
                  ", value='" + value + '\'' +
                  ", domain=" + domain +
                  ", size=" + size +
                  ", secure='" + secure + '\'' +
                  '}';
     }
}
