package behavioral.observer;

public class CoffeeCustomer implements Customer {
    private String name;

    public CoffeeCustomer(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        System.out.println("Клієнт " + name + " отримав сповіщення: " + message);
    }
}
