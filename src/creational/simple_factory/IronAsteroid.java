package creational.simple_factory;

public class IronAsteroid implements Asteroid {
    private String designation;
    private double massTons;
    private double ironPurityPercentage;
    private boolean hasMagneticField;

    public IronAsteroid(String designation, double massTons, double ironPurityPercentage, boolean hasMagneticField) {
        this.designation = designation;
        this.massTons = massTons;
        this.ironPurityPercentage = ironPurityPercentage;
        this.hasMagneticField = hasMagneticField;
    }

    @Override
    public void scanMinerals() {
        System.out.println("Металевий астероїд " + designation + ": чистота заліза " + ironPurityPercentage + "%.");
    }

    @Override
    public double calculateValue() {
        return massTons * (ironPurityPercentage / 100) * 500.0; // Ціна заліза
    }
}