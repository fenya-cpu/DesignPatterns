package structural.bridge;

public class LargeSize implements Size {
    public String getSizeName() {
        return "Великий (500мл)";
    }
    public double getPriceMultiplier() {
        return 1.5;
    }
}