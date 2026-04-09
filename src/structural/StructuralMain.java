package structural;

// Імпортуємо всі наші патерни з підпапок
import structural.adapter.*;
import structural.bridge.*;
import structural.composite.*;
import structural.decorator.*;
import structural.facade.*;
import structural.flyweight.*;
import structural.proxy.*;

public class StructuralMain {
    public static void main(String[] args) {

        System.out.println("ADAPTER");
        CryptoWallet myCrypto = new CryptoWallet();
        UAPayment terminal = new CryptoAdapter(myCrypto);
        terminal.payInUAH(150.0);

        //BRIDGE
        System.out.println("\nBRIDGE");
        Drink smallCoffee = new Coffee(new SmallSize());
        Drink largeCoffee = new Coffee(new LargeSize());
        smallCoffee.prepare();
        largeCoffee.prepare();

        //COMPOSITE
        System.out.println("\nCOMPOSITE");
        ComboBox breakfastCombo = new ComboBox("Сніданок Чемпіона");
        breakfastCombo.addItem(new Product("Еспресо", 30.0));
        breakfastCombo.addItem(new Product("Круасан", 50.0));
        breakfastCombo.printDetails();
        System.out.println("Ціна зі знижкою за комбо: " + breakfastCombo.getPrice() + " грн.");

        //DECORATOR
        System.out.println("\nDECORATOR");
        Beverage myDrink = new Espresso();
        myDrink = new Milk(myDrink);
        myDrink = new Syrup(myDrink);
        System.out.println("Замовлення: " + myDrink.getDescription());
        System.out.println("До сплати: " + myDrink.getCost() + " грн.");

        // FACADE
        System.out.println("\nFACADE");
        CoffeeMachineFacade machine = new CoffeeMachineFacade();
        machine.makeCoffee();

        //FLYWEIGHT
        System.out.println("\nFLYWEIGHT");
        CoffeeBean table1Bean = BeanFactory.getBean("Ефіопія", "Світле обсмаження");
        table1Bean.serveCoffee(1);
        CoffeeBean table2Bean = BeanFactory.getBean("Ефіопія", "Світле обсмаження");
        table2Bean.serveCoffee(2);

        // PROXY
        System.out.println("\nPROXY");
        CashRegister barista = new CashRegisterProxy("BARISTA");
        barista.processRefund(100.0);

        CashRegister manager = new CashRegisterProxy("MANAGER");
        manager.processRefund(100.0);

    }
}