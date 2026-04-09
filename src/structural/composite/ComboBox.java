package structural.composite;
import java.util.ArrayList;
import java.util.List;

public class ComboBox implements OrderComponent {
    private String boxName;
    private List<OrderComponent> items = new ArrayList<>();

    public ComboBox(String boxName)
    {
        this.boxName = boxName;
    }
    public void addItem(OrderComponent item)
    {
        items.add(item);
    }

    @Override
    public double getPrice() {
        double total = 0;
        for (OrderComponent item : items) {
            total += item.getPrice();
        }
        return total;
    }

    @Override
    public void printDetails() {
        System.out.println("Коробка [" + boxName + "]:");
        for (OrderComponent item : items) {
            item.printDetails();
        }
    }
}