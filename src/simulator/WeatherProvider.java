package simulator;

public class WeatherProvider {
    private String[] weather = {"RAIN", "FOG", "SUN", "SNOW"};

    private WeatherProvider() {};

    private static WeatherProvider instance = new WeatherProvider();

    // Public method to access the instance
    public static WeatherProvider getProvider() {
        return instance;
    }

    public String getCurrentWeather(Coordinates p_coordinates) {
        int randomFactor = (p_coordinates.getLongitude() + p_coordinates.getLatitude() + p_coordinates.getHeight()) % weather.length;
        return weather[randomFactor];
    }
}
