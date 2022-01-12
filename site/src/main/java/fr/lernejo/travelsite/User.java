package fr.lernejo.travelsite;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {
    private final String userEmail;
    private final String userCountry;
    private final String userName;
    private final int minimumTemperatureDistance;
    private final WeatherExpectation weatherExpectation;

    public User(@JsonProperty("userEmail") String userEmail, @JsonProperty("userName") String userName, @JsonProperty("userCountry") String userCountry,
                @JsonProperty("minimumTemperatureDistance") int minimumTemperatureDistance, @JsonProperty("weatherExpectation") WeatherExpectation weatherExpectation)
    {
        this.userEmail = userEmail;
        this.userName = userName;
        this.userCountry = userCountry;
        this.weatherExpectation = weatherExpectation;
        this.minimumTemperatureDistance = minimumTemperatureDistance;
    }

    public WeatherExpectation getWeatherExpectation() {
        return weatherExpectation;
    }
    public String getUserName() {
        return userName;
    }

    public String getUserCountry() {
        return userCountry;
    }

    public String getUserEmail() {
        return userEmail;
    }

    enum WeatherExpectation {
        WARMER, COLDER
    }
    public int getMinimumTemperatureDistance() {
        return minimumTemperatureDistance;
    }
}
