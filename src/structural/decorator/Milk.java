package structural.decorator;

public class Milk extends BeverageDecorator {
    public Milk(Beverage beverage)
    {
        super(beverage);
    }

    @Override
    public String getDescription()
    {
        return beverage.getDescription() + ", молоко";
    }

    @Override
    public double getCost()
    {
        return beverage.getCost() + 15.0;
    }
}