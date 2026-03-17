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
        System.out.println("\n========= 1. PROTOTYPE =========");
        SpaceDrone scout = new SpaceDrone("Explorer-1", 1500.5, 50.0, 100, false);
        SpaceDrone battleDrone = (SpaceDrone) scout.doClone();
        battleDrone.setArmed(true);
        System.out.println("Оригінал: " + scout);
        System.out.println("Клон: " + battleDrone);

        System.out.println("\n========= 2. SINGLETON =========");
        GalaxyDatabase db = GalaxyDatabase.getInstance();
        db.connect();
        System.out.println("Час створення сесії БД: " + db.getLastSyncTime());

        System.out.println("\n========= 3. SIMPLE FACTORY =========");
        AsteroidFactory simpleFactory = new AsteroidFactory();
        Asteroid myIceAsteroid = simpleFactory.createAsteroid("ice", 85000);
        myIceAsteroid.scanMinerals();
        System.out.println("Вартість астероїда: $" + myIceAsteroid.calculateValue());

        System.out.println("\n========= 4. FACTORY METHOD =========");
        SpaceshipCreator fighterCommand = new FighterCreator();
        fighterCommand.deployShipToOrbit();

        SpaceshipCreator tradeGuild = new CargoShipCreator();
        tradeGuild.deployShipToOrbit();

        System.out.println("\n========= 5. ABSTRACT FACTORY =========");
        System.out.println("--- Оснащення корабля прибульців ---");
        EquipmentFactory alienTech = new AlienEquipmentFactory();
        Weapon alienGun = alienTech.createWeapon();
        Engine alienDrive = alienTech.createEngine();
        alienDrive.ignite();
        alienGun.fire();
        System.out.println("Урон зброї: " + alienGun.getDamageOutput());

        System.out.println("\n========= 6. BUILDER =========");
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