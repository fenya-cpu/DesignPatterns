package creational.abstract_factory;

public class HumanWeapon implements Weapon {
    private String modelName;
    private int ammoCapacity;
    private double damagePerRound;

    public HumanWeapon(String modelName, int ammoCapacity, double damagePerRound) {
        this.modelName = modelName;
        this.ammoCapacity = ammoCapacity;
        this.damagePerRound = damagePerRound;
    }

    @Override
    public void fire() {
        System.out.println(modelName + " стріляє кінетичними снарядами. Залишок патронів: " + (--ammoCapacity));
    }

    @Override
    public double getDamageOutput() {
        return damagePerRound * 1.5;
    }
}