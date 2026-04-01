package creational.simple_factory;

public class IceAsteroid implements Asteroid {
    private String designation;
    private double massTons;
    private double waterVolumeCubeMeters;
    private double coreTemperature;

    public IceAsteroid(String designation, double massTons, double waterVolumeCubeMeters, double coreTemperature) {
        this.designation = designation;
        this.massTons = massTons;
        this.waterVolumeCubeMeters = waterVolumeCubeMeters;
        this.coreTemperature = coreTemperature;
    }

    @Override
    public void scanMinerals() {
        System.out.println("Крижаний астероїд " + designation + ": знайдено " + waterVolumeCubeMeters + " куб.м води.");
    }

    @Override
    public double calculateValue() {
        return waterVolumeCubeMeters * 1.5;
    }
}