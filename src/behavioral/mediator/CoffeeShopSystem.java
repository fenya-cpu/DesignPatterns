package behavioral.mediator;

public class CoffeeShopSystem implements ShopMediator {
    private Waiter waiter;
    private Barista barista;

    public void setWaiter(Waiter waiter) {
        this.waiter = waiter;
    }

    public void setBarista(Barista barista) {
        this.barista = barista;
    }

    @Override
    public void notify(Object sender, String event) {
        if (event.equals("ORDER_PLACED") && barista != null) {
            System.out.println("Система: Отримано нове замовлення. Передаю баристі.");
            barista.startMakingCoffee();
        } else if (event.equals("COFFEE_READY") && waiter != null) {
            System.out.println("Система: Кава готова. Кличемо офіціанта.");
            waiter.serveCustomer();
        }
    }
}