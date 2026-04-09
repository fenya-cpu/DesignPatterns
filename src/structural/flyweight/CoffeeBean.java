package structural.flyweight;

public class CoffeeBean {
    private final String origin;
    private final String roastLevel;

    public CoffeeBean(String origin, String roastLevel) {
        this.origin = origin;
        this.roastLevel = roastLevel;
    }

    public void serveCoffee(int tableNumber) {
        System.out.println("Подаємо каву (Зерна: " + origin + ", Обсмаження: " + roastLevel + ") на столик №" + tableNumber);
    }
}