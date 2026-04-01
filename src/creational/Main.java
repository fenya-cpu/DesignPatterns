package creational;

import creational.abstract_factory.AlienEquipmentFactory;
import creational.abstract_factory.Engine;
import creational.abstract_factory.EquipmentFactory;
import creational.abstract_factory.Weapon;
import creational.builder.SpaceStation;
import creational.factory_method.CargoShipCreator;
import creational.factory_method.FighterCreator;
import creational.factory_method.SpaceshipCreator;
import creational.prototype.SpaceDrone;
import creational.simple_factory.Asteroid;
import creational.simple_factory.AsteroidFactory;
import creational.singletone.GalaxyDatabase;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n PROTOTYPE ");
        SpaceDrone scout = new SpaceDrone("Explorer-1", 1500.5, 50.0, 100, false);
        SpaceDrone battleDrone = (SpaceDrone) scout.doClone();
        System.out.println("Оригінал: " + scout);
        System.out.println("Клон: " + battleDrone);

        System.out.println("\n SINGLETON ");
        GalaxyDatabase db = GalaxyDatabase.getInstance();
        System.out.println("Час створення сесії БД: " + db.getLastSyncTime());

        System.out.println("\n SIMPLE FACTORY ");
        AsteroidFactory simpleFactory = new AsteroidFactory();
        Asteroid myIceAsteroid = simpleFactory.createAsteroid("ice", 85000);
        myIceAsteroid.scanMinerals();
        System.out.println("Вартість астероїда: $" + myIceAsteroid.calculateValue());

        System.out.println("\nFACTORY METHOD ");
        SpaceshipCreator fighterCommand = new FighterCreator();
        fighterCommand.deployShipToOrbit();

        SpaceshipCreator tradeGuild = new CargoShipCreator();
        tradeGuild.deployShipToOrbit();

        System.out.println("\n ABSTRACT FACTORY ");
        System.out.println("--- Оснащення корабля прибульців ---");
        EquipmentFactory alienTech = new AlienEquipmentFactory();
        Weapon alienGun = alienTech.createWeapon();
        Engine alienDrive = alienTech.createEngine();
        alienDrive.ignite();
        alienGun.fire();
        System.out.println("Урон зброї: " + alienGun.getDamageOutput());

        System.out.println("\n BUILDER ");
        SpaceStation citadel = new SpaceStation.Builder()
                .setStationName("Цитадель Галактики")
                .setCrewCapacity(15000)
                .setShieldStrength(99.9)
                .enableHyperdrive()
                .setWeaponBays(250)
                .setLifeSupport("Advanced Tier 3")
                .build();
        System.out.println(citadel);
    }
}