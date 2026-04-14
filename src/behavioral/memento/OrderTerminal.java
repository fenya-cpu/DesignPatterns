package behavioral.memento;

public class OrderTerminal {
    private String currentOrder = "Порожнє замовлення";

    public void addIngredient(String ingredient) {
        if (currentOrder.equals("Порожнє замовлення")) {
            currentOrder = ingredient;
        } else {
            currentOrder += ", " + ingredient;
        }
        System.out.println("Термінал: Поточне замовлення -> " + currentOrder);
    }

    // Зберегти стан
    public OrderSnapshot save() {
        return new OrderSnapshot(currentOrder);
    }

    // Відновити стан
    public void restore(OrderSnapshot snapshot) {
        this.currentOrder = snapshot.getOrderDetails();
        System.out.println("Термінал: ДІЮ СКАСОВАНО! Поточне замовлення -> " + currentOrder);
    }
}