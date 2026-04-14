package behavioral.strategy;

public class CardPayment implements PaymentStrategy {
    @Override
    public void pay(double amount) {
        System.out.println("Оплачено " + amount + " грн БАНКІВСЬКОЮ КАРТКОЮ.");
    }
}
