package simulator;

public class Coordinates {

    protected int longitude;
    protected int latitude;
    protected int height;

    // Constructor with package-private visibility (~ in UML)
    Coordinates(int p_longitude, int p_latitude, int p_height) {
        // Check inputs
        if (p_longitude < 1 || p_latitude < 1)
            throw new IllegalArgumentException("Longitude and latitude must be positive.");
        this.longitude = p_longitude;
        this.latitude = p_latitude;
        // Height limits
        if (height > 100)
            this.height = 100;
        else if (height < 0)
            this.height = 0;
        else
            this.height = p_height;
    }

    // Getters for attributes
    public int getLongitude() {
        return this.longitude;
    }
    public int getLatitude() {
        return this.latitude;
    }
    public int getHeight() {
        return this.height;
    }
}
