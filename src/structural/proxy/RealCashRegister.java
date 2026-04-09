package structural.proxy;

public class RealCashRegister implements CashRegister {
    @Override
    public void processRefund(double amount) {
        System.out.println("Каса: Видано готівку для повернення - " + amount + " грн.");
    }
}