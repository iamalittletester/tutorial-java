package api.sunrise;

public class GetSunriseSunset {

    public String getSunriseSunsetInfo(String lat, String lng) {
        //getSunriseTimeBasedOnLatAndLong
        String fullUrl = "https://" + System.getProperty("env") + "/json?lat=" + lat + "&lng=" + lng + "&timezone=UTC&date=today";
        return "theResultOfCallingTheApi";
    }
}

