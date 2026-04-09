package structural.bridge;

public class Coffee extends Drink {
    public Coffee(Size size)
    {
        super(size);
    }

    @Override
    public void prepare() {
        double basePrice = 40.0;
        System.out.println("Готуємо Каву. Розмір: " + size.getSizeName() +
                ". Ціна: " + (basePrice * size.getPriceMultiplier()) + " грн.");
    }
}