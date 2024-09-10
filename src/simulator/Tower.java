package simulator;
import java.util.List;

public abstract class Tower {
    private List<Flyable> observers;

    public void register(Flyable p_flyable) {
        this.observers.add(p_flyable);
    }
    protected void conditionChanged(Flyable p_flyable) {

    }
}
