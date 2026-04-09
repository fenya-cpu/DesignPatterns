package structural.facade;

public class CoffeeMachineFacade {
    private Grinder grinder;
    private Boiler boiler;
    private Brewer brewer;

    public CoffeeMachineFacade() {
        this.grinder = new Grinder();
        this.boiler = new Boiler();
        this.brewer = new Brewer();
    }

    public void makeCoffee() {
        System.out.println("\nПочинаємо приготування кави");
        grinder.grindBeans();
        boiler.boilWater();
        brewer.brew();
        System.out.println("Ваша кава готова!");
    }
}

class Grinder {
    public void grindBeans() {
        System.out.println("Мелемо кавові зерна");
    }
}

class Boiler {
    public void boilWater() {
        System.out.println("Гріємо воду до 90 градусів");
    }
}

class Brewer {
    public void brew() {
        System.out.println("Пропускаємо воду через каву");
    }
}