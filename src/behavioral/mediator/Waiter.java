package behavioral.mediator;

public class Waiter {
    private ShopMediator mediator;

    public Waiter(ShopMediator mediator) {
        this.mediator = mediator;
    }

    public void takeOrder() {
        System.out.println("Офіціант: Прийняв замовлення у клієнта.");
        mediator.notify(this, "ORDER_PLACED");
    }

    public void serveCustomer() {
        System.out.println("Офіціант: Несу каву клієнту!");
    }
}