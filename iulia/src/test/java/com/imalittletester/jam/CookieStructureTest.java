package com.imalittletester.jam;

import com.imalittletester.garmincookies.CookieStructure;
import org.junit.jupiter.api.Test;

import java.util.Date;

public class CookieStructureTest {

    public CookieStructure cookieStructure = new CookieStructure();

    public CookieStructure cookieStructure2 = new CookieStructure();

    public CookieStructure cookieStructure3 = new CookieStructure("notice preferences",20,34343434343443L,true,'✓',"medium", new Date(),false);

    @Test
    void firstTest(){
        System.out.println(cookieStructure);
        System.out.println(cookieStructure2);
        System.out.println(cookieStructure3);
    }


}
