package ro.academyplus.avaj.aircrafts;

public class AircraftFactory {
    public static Flyable newAircraft(String p_type, String p_name, Coordinates p_coordincates) {
        switch (p_type) {
            case "Baloon":
                return new Baloon(0, p_name, p_coordincates);
            case "Helicopter":
                return new Helicopter(0, p_name, p_coordincates);
            case "JetPlane":
                return new JetPlane(0, p_name, p_coordincates);
            default:
                return null;
        }
    }
}
