package com.imalittletester.cookie;

public class Cookie {
        //Proprieties
        public String name;
        public String value;
        public String domain;
        public String path;
        public String expires;
        public int  size;
        public boolean httpOnly;
        public boolean secure;
        public String sameSite;
        public boolean sameParty;
        public String partitionKey;
        public String priority;
        //Constructor
public Cookie  () {}

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
public void showCookie () {
        System.out.println("The name of the cookie is " +name + " with the domain " +domain );
        System.out.println("The domain of the cookie is " +domain );
}
public boolean  isProvidedParamSubDomainOfDomain (String subDomain) {
        return domain.contains(subDomain);
}
}
