package creational.abstract_factory;

public class AlienEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() { return new AlienWeapon("Зелений", 88.5); }

    @Override
    public Engine createEngine() { return new AlienEngine(true, 9.99); }
}