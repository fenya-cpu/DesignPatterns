package creational.abstract_factory;

public class HumanEngine implements Engine {
    private String fuelType;
    private double thrustPower;

    public HumanEngine(String fuelType, double thrustPower) {
        this.fuelType = fuelType;
        this.thrustPower = thrustPower;
    }

    @Override
    public void ignite() {
        System.out.println("Запуск термоядерного реактора на паливі: " + fuelType);
    }

    @Override
    public double getMaxThrust() {
        return thrustPower;
    }
}
