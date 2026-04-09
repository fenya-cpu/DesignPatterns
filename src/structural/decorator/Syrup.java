package structural.decorator;

public class Syrup extends BeverageDecorator {
    public Syrup(Beverage beverage)
    {
        super(beverage);
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", карамельний сироп";
    }

    @Override
    public double getCost()
    {
        return beverage.getCost() + 10.0;
    }
}
