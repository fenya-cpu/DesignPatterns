package creational.factory_method;

public abstract class SpaceshipCreator {
    // Це і є сам "Фабричний метод"
    public abstract Spaceship createShip();

    // Базова бізнес-логіка, загальна для всіх
    public void deployShipToOrbit() {
        Spaceship ship = createShip();
        System.out.println("----- ПІДГОТОВКА ДО ЗАПУСКУ -----");
        ship.showSpecs();
        ship.performMission();
        System.out.println("---------------------------------");
    }
}