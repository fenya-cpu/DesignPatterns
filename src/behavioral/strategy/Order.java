package behavioral.strategy;

public class Order {
    private double totalAmount;
    private PaymentStrategy paymentStrategy;

    public Order(double totalAmount) {
        this.totalAmount = totalAmount;
    }

    public void setPaymentStrategy(PaymentStrategy strategy) {
        this.paymentStrategy = strategy;
    }

    public void processPayment() {
        if (paymentStrategy == null) {
            System.out.println("Оберіть спосіб оплати!");
            return;
        }
        paymentStrategy.pay(totalAmount);
    }
}