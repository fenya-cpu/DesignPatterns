package behavioral.template;

public class TeaMaker extends BeverageMaker {
    @Override
    protected void brew() {
        System.out.println("Заварюємо чайне листя 3 хвилини");
    }

    @Override
    protected void addCondiments() {
        System.out.println("Додаємо лимон.");
    }
}