package structural.bridge;

public abstract class Drink {
    protected Size size;

    public Drink(Size size) {
        this.size = size;
    }

    public abstract void prepare();
}