package creational.factory_method;

public class CargoShipCreator extends SpaceshipCreator {
    @Override
    public Spaceship createShip() {
        return new CargoShip("CRG-992", 50000.0, 45000.0, "Титан");
    }
}