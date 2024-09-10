package simulator;

public class Baloon extends Aircraft implements Flyable {
    protected WeatherTower weatherTower;

    @Override
    public void updateConditions() {
        // TODO Auto-generated method stub
    }

    @Override
    public void registerTower(WeatherTower weatherTower) {
        this.weatherTower = weatherTower;
    }

    public Baloon(long id, String name, Coordinates coordinates) {
        super(id, name, coordinates);
    }
}
