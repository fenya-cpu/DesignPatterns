package creational.abstract_factory;

public class AlienWeapon implements Weapon {
    private String plasmaColor;
    private double radiationLevel;

    public AlienWeapon(String plasmaColor, double radiationLevel) {
        this.plasmaColor = plasmaColor;
        this.radiationLevel = radiationLevel;
    }

    @Override
    public void fire() {
        System.out.println("Постріл " + plasmaColor + " плазмою! Рівень радіації: " + radiationLevel + " Зв.");
    }

    @Override
    public double getDamageOutput() { return radiationLevel * 3.14; }
}