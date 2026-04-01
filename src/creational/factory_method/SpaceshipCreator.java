package creational.factory_method;

public abstract class SpaceshipCreator {

    public abstract Spaceship createShip();

    public void deployShipToOrbit() {
        Spaceship ship = createShip();
        System.out.println("----- ПІДГОТОВКА ДО ЗАПУСКУ -----");
        ship.showSpecs();
        ship.performMission();
        System.out.println("---------------------------------");
    }
}