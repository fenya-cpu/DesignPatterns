package behavioral.visitor;

public interface Visitor {
    void visit(CoffeeItem coffee);
    void visit(PastryItem pastry);
}