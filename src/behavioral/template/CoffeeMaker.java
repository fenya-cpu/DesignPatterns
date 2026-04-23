package behavioral.template;

public class CoffeeMaker extends BeverageMaker {
    @Override
    protected void brew() {
        System.out.println("Пропускаємо воду через мелену каву");
    }


    @Override
    protected void addCondiments() {
        System.out.println("Додаємо цукор і молоко.");
    }
}