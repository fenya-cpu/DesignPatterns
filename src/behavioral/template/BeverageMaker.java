package behavioral.template;

public abstract class BeverageMaker {

    public final void makeBeverage() {
        boilWater();
        brew();
        pourInCup();
        addCondiments();
    }

    private void boilWater() { System.out.println("Кип'ятимо воду..."); }
    private void pourInCup() { System.out.println("Наливаємо в чашку..."); }

    protected abstract void brew();
    protected abstract void addCondiments();
}