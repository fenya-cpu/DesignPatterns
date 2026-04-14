package behavioral.memento;

public class OrderSnapshot {
    private final String orderDetails;

    public OrderSnapshot(String orderDetails) {
        this.orderDetails = orderDetails;
    }

    public String getOrderDetails() {
        return orderDetails;
    }
}
