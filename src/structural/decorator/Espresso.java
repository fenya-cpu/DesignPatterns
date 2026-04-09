package structural.decorator;

public class Espresso implements Beverage {
    @Override
    public String getDescription()
    {
        return "Еспресо";
    }

    @Override
    public double getCost()
    {
        return 30.0;
    }
}