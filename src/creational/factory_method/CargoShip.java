package creational.factory_method;

public class CargoShip implements Spaceship {
    private String registryNumber;
    private double maxCargoVolume;
    private double currentLoad;
    private String cargoType;

    public CargoShip(String registryNumber, double maxCargoVolume, double currentLoad, String cargoType) {
        this.registryNumber = registryNumber;
        this.maxCargoVolume = maxCargoVolume;
        this.currentLoad = currentLoad;
        this.cargoType = cargoType;
    }

    @Override
    public void performMission() {
        System.out.println("Вантажний корабель " + registryNumber + " доставляє вантаж (" + cargoType + ") на орбіту.");
    }

    @Override
    public void showSpecs() {
        System.out.println("CargoSpecs: [Об'єм: " + maxCargoVolume + " m3, Заповнено: " + currentLoad + " m3, Тип: " + cargoType + "]");
    }
}