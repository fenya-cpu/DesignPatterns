package behavioral.mediator;

public class Barista {
    private ShopMediator mediator;

    public Barista(ShopMediator mediator) {
        this.mediator = mediator;
    }

    public void startMakingCoffee() {
        System.out.println("Бариста: Роблю каву");
        mediator.notify(this, "COFFEE_READY");
    }
}