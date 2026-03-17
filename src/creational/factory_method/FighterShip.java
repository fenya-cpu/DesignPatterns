package creational.factory_method;

public class FighterShip implements Spaceship {
    private String callsign;
    private double laserPower;
    private int missilesLoaded;
    private double maneuverabilityIndex;

    public FighterShip(String callsign, double laserPower, int missilesLoaded, double maneuverabilityIndex) {
        this.callsign = callsign;
        this.laserPower = laserPower;
        this.missilesLoaded = missilesLoaded;
        this.maneuverabilityIndex = maneuverabilityIndex;
    }

    @Override
    public void performMission() {
        System.out.println("Винищувач " + callsign + " атакує піратів! Запущено ракет: " + (missilesLoaded > 0 ? 1 : 0));
        if (missilesLoaded > 0) missilesLoaded--;
    }

    @Override
    public void showSpecs() {
        System.out.println("FighterSpecs: [Потужність лазера: " + laserPower + " MW, Ракети: " + missilesLoaded + ", Маневреність: " + maneuverabilityIndex + "]");
    }
}
