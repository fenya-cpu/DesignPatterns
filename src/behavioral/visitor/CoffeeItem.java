package behavioral.visitor;

public class CoffeeItem implements MenuItem {
    private double price = 50.0;
    public double getPrice() { return price; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}