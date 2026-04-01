package creational.prototype;

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


    @Override
    public Prototype doClone() {
        return new SpaceDrone(this.model, this.maxSpeed, this.cargoCapacity, this.batteryLevel, this.isArmed);
    }

    @Override
    public String toString() {
        return "SpaceDrone{" +
                "model='" + model + '\'' +
                ", speed=" + maxSpeed +
                ", cargo=" + cargoCapacity +
                ", battery=" + batteryLevel +
                "%, armed=" + isArmed +
                '}';
    }
}