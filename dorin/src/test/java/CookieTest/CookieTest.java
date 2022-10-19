package CookieTest;

import com.imalittletester.cookies.CookieStructure;
import org.junit.jupiter.api.Test;



import java.util.Date;

public class CookieTest {

    public CookieStructure cookieStructure1 = new CookieStructure("Ionel", "Cel mai tare", 245, true, ".Garmin.com");
    public CookieStructure cookieStructure2 = new CookieStructure("garmin.com");


    @Test
    void cookieTest()
    {
        System.out.println(cookieStructure1);
        cookieStructure1.displayCookieStructure();

        System.out.println("Is the provided param a subdomain of domain? " + cookieStructure2.isProvidedParamSubDomainOfDomain("garmin"));
    }

}
