package com.imalittletester.cookies;

import org.apache.commons.io.input.RandomAccessFileInputStream;

import java.util.Date;

public class CookieStructure {

    public String cookieName;
    public String cookieValue;
    public Date cookieExpirationDate;

    public int cookieSize;
    public boolean cookieHttpOnly;

}
