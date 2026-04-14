package behavioral.visitor;

public class PastryItem implements MenuItem {
    private double price = 80.0;
    public double getPrice() { return price; }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
