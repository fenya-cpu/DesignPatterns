package creational.abstract_factory;

public class HumanEquipmentFactory implements EquipmentFactory {
    @Override
    public Weapon createWeapon() { return new HumanWeapon("Gatling Gun MK2", 500, 25.5); }

    @Override
    public Engine createEngine() { return new HumanEngine("Тритиум", 12000.0); }
}
