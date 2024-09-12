package ro.academyplus.avaj.simulator;
import ro.academyplus.avaj.aircrafts.Flyable;
import java.util.ArrayList;
import java.util.List;

public abstract class Tower {
    private List<Flyable> observers = new ArrayList<>();

    public void register(Flyable p_flyable) {
        if (!this.observers.contains(p_flyable)) {
            this.observers.add(p_flyable);
            System.out.println("Tower says: " + p_flyable + " registered to weather tower.");
        }
    }

    public void unregister(Flyable p_flyable) {
        if (this.observers.contains(p_flyable)) {
            this.observers.remove(p_flyable);
            System.out.println("Tower says: " + p_flyable + " unregistered from weather tower.");
        }
    }

    protected void conditionChanged() {
        for (Flyable flyable : observers) {
            flyable.updateConditions();
        }
    }
}
