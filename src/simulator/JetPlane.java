package simulator;

public class JetPlane extends Aircraft implements Flyable {
    protected WeatherTower weatherTower;

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
    }
    @Override
    public void updateConditions() {
        weatherTower.getWeather(coordinates);
    }

    public JetPlane(long id, String name, Coordinates coordinates) {
        super(id, name, coordinates);
    }
}
