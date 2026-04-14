package behavioral.visitor;

public interface MenuItem {
    void accept(Visitor visitor);
}