package com.imalittletester.cookies;

import org.apache.commons.io.input.RandomAccessFileInputStream;
import org.w3c.dom.ls.LSOutput;

import java.util.Date;

public class CookieStructure {

    public String cookieName;
    public String cookieValue;
    public int cookieSize;
    public boolean cookieHttpOnly;
    public String cookieDomain;

// Simple constructor

public CookieStructure(){}

// Constructor with cookieName and cookieValue

public CookieStructure(String cookieName, String cookieValue){
    this.cookieName = cookieName;
    this.cookieValue = cookieValue;
}

//Constructor with the 5 defined fields

public CookieStructure(String cookieName, String cookieValue, int cookieSize, boolean cookieHttpOnly, String cookieDomain){

    this.cookieName = cookieName;
    this.cookieValue = cookieValue;
    this.cookieSize = cookieSize;
    this.cookieHttpOnly = cookieHttpOnly;
    this.cookieDomain = cookieDomain;
}
public CookieStructure(String cookieDomain){
    this.cookieDomain = cookieDomain;
}

// Method to display 5 class fields
    public void displayCookieStructure(){
        System.out.println("The name of the cookie is: " + cookieName);
        System.out.println("With a value of: " + cookieValue);
        System.out.println("The size of the cookie is: " + cookieSize);
        System.out.println("Is this cookie HTTP only? " + cookieHttpOnly);
        System.out.println("This is the cookie domain " + cookieDomain);
    }

//Method to return bool if Domain is provided

    public boolean isProvidedParamSubDomainOfDomain(String subdomain){
        return cookieDomain.contains(subdomain);
    }

    @Override
    public String toString() {
        return "CookieStructure{" +
                "cookieName='" + cookieName + '\'' +
                ", cookieValue='" + cookieValue + '\'' +
                ", cookieSize=" + cookieSize +
                ", cookieHttpOnly=" + cookieHttpOnly +
                ", cookieDomain='" + cookieDomain + '\'' +
                '}';
    }
}
