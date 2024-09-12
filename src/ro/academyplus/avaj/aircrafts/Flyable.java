package ro.academyplus.avaj.aircrafts;
import ro.academyplus.avaj.simulator.WeatherTower;

public interface Flyable {
    abstract void updateConditions();
    void registerTower(WeatherTower p_tower);
}
