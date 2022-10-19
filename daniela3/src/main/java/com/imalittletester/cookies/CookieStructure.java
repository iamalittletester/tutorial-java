package com.imalittletester.cookies;

public class CookieStructure {

   public String name;
   public String value;
   public String domain;
   public String path;
   public int size;
   public boolean httpOnly;

   //constructors

   public CookieStructure() {}
   public CookieStructure (String name, String value) {
      this.name = name;
      this.value = value;
   }
   public CookieStructure(String name, String value, String domain, String path, int size, boolean httpOnly) {
      this.name = name;
      this.value = value;
      this.domain = domain;
      this.path = path;
      this.size = size;
      this.httpOnly = httpOnly;
   }


   //method to display class values
public void displayCookieValues () {
   System.out.println("Cookie name is " + name);
   System.out.println("Cookie value is " + value);
   System.out.println("Cookie domain is " + domain);
   System.out.println("Cookie path is " + path);
   System.out.println("Cookie size is " + size);
   System.out.println("Cookie is http only? " + httpOnly);
}

public boolean isProvidedParamSubDomainOfDomain (String subdomainOfDomain) {
   return domain.contains(subdomainOfDomain);
}
   @Override
   public String toString() {
      return "CookieStructure{" +
              "name='" + name + '\'' +
              ", value='" + value + '\'' +
              ", domain='" + domain + '\'' +
              ", path='" + path + '\'' +
              ", size=" + size +
              ", httpOnly=" + httpOnly +
              '}';
   }



}
