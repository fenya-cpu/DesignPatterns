package creational.abstract_factory;

public class AlienEngine implements Engine {
    private boolean usesDarkMatter;
    private double warpSignature;

    public AlienEngine(boolean usesDarkMatter, double warpSignature) {
        this.usesDarkMatter = usesDarkMatter;
        this.warpSignature = warpSignature;
    }

    @Override
    public void ignite() { System.out.println("Скривлення простору активовано. Темна матерія: " + usesDarkMatter); }

    @Override
    public double getMaxThrust() { return warpSignature * 1000.0; }
}