package structural.bridge;

public class SmallSize implements Size {
    public String getSizeName()
    {
        return "Маленький (250мл)";
    }
    public double getPriceMultiplier()
    {
        return 1.0;
    }
}