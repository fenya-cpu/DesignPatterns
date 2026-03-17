package creational.prototype;
import java.util.Objects;

public class SpaceDrone implements Prototype {
    private final String model;
    private final double maxSpeed;
    private final double cargoCapacity;
    private int batteryLevel;
    private boolean isArmed;

    public SpaceDrone(String model, double maxSpeed, double cargoCapacity, int batteryLevel, boolean isArmed) {
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.cargoCapacity = cargoCapacity;
        this.batteryLevel = batteryLevel;
        this.isArmed = isArmed;
    }

    public String getModel() { return model; }
    public double getMaxSpeed() { return maxSpeed; }
    public double getCargoCapacity() { return cargoCapacity; }
    public int getBatteryLevel() { return batteryLevel; }
    public void setBatteryLevel(int batteryLevel) { this.batteryLevel = batteryLevel; }
    public boolean isArmed() { return isArmed; }
    public void setArmed(boolean armed) { isArmed = armed; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SpaceDrone that = (SpaceDrone) o;
        return Double.compare(that.maxSpeed, maxSpeed) == 0 &&
                Double.compare(that.cargoCapacity, cargoCapacity) == 0 &&
                batteryLevel == that.batteryLevel &&
                isArmed == that.isArmed &&
                Objects.equals(model, that.model);
    }

    @Override
    public int hashCode() {
        return Objects.hash(model, maxSpeed, cargoCapacity, batteryLevel, isArmed);
    }

    @Override
    public Prototype doClone() {
        return new SpaceDrone(this.model, this.maxSpeed, this.cargoCapacity, this.batteryLevel, this.isArmed);
    }

    @Override
    public String toString() {
        return "SpaceDrone{model='" + model + "', speed=" + maxSpeed + ", cargo=" + cargoCapacity + ", battery=" + batteryLevel + "%, armed=" + isArmed + "}";
    }
}