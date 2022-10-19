package garmincookiestest;

import com.imalittletester.garmincookies.GarminCookies;
import org.junit.jupiter.api.Test;

public class GarminCookiesTest {
    public GarminCookies garminCookiesTest1 = new GarminCookies("_ga", "GA1.1.914654061.1666165215");

    public GarminCookies garminCookiesTest2 = new GarminCookies("_ga","GA1.1.914654061.1666165215","www.google.com", "/", "2022-11-18T07:39:32.000Z", 22, true, true, "none", false, "");

    @Test
    void thirdTest () {
       System.out.println(garminCookiesTest1);
       System.out.println(garminCookiesTest2);
       garminCookiesTest2.returnCookies();
       System.out.println(garminCookiesTest2.isProvidedParamSubDomainOfDomain("test.google.com"));
    }
}
