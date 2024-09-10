package simulator;

public interface Flyable {
    abstract void updateConditions();
    void registerTower(WeatherTower p_tower);
}
