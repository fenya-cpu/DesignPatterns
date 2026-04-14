package behavioral.strategy;

public class CashPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплачено " + amount + " грн ГОТІВКОЮ.");
    }
}