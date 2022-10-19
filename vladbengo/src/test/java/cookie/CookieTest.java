package cookie;

import com.imalittletester.cookie.Cookie;
import org.junit.jupiter.api.Test;

public class CookieTest {

    public Cookie cookie1 = new Cookie("_ga", "GA1.1.732853975.1663152480");
    public Cookie cookie2 = new Cookie("_ga", "GA1.1.732853975.1663152480", ".garmin.com", 10, 10, true);

    @Test
    void cookieTest () {
        System.out.println(cookie1);
        System.out.println(cookie2);
        System.out.println(cookie2.isProvidedParamSubDomainOfDomain());
    }
}