package behavioral.iterator;
import java.util.List;
import java.util.ArrayList;

public class CoffeeMenu {
    private List<String> items;

    public CoffeeMenu() {
        items = new ArrayList<>();
        items.add("Еспресо");
        items.add("Капучино");
        items.add("Лате");
    }

    public MenuIterator createIterator() {
        return new MenuIteratorImpl(this.items);
    }
}