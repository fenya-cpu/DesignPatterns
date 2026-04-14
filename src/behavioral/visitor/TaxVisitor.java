package behavioral.visitor;

public class TaxVisitor implements Visitor {
    @Override
    public void visit(CoffeeItem coffee) {
        System.out.println("Податок на каву (" + coffee.getPrice() + " грн) = " + (coffee.getPrice() * 0.20) + " грн.");
    }

    @Override
    public void visit(PastryItem pastry) {
        System.out.println("Податок на випічку (" + pastry.getPrice() + " грн) = " + (pastry.getPrice() * 0.10) + " грн.");
    }
}