package ro.academyplus.avaj.simulator;

public class Simulator {
    WeatherTower weatherTower = new WeatherTower();
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java ro.academyplus.avaj.simulator.Simulator scenario.txt");
            return ;
        }

    }
}
