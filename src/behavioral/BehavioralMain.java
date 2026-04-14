package behavioral;

import behavioral.chain.*;
import behavioral.command.*;
import behavioral.iterator.*;
import behavioral.mediator.*;
import behavioral.memento.*;
import behavioral.observer.*;
import behavioral.state.*;
import behavioral.strategy.*;
import behavioral.template.*;
import behavioral.visitor.*;

public class BehavioralMain {
    public static void main(String[] args) {
        //CHAIN OF RESPONSIBILITY
        System.out.println("Патерн CHAIN OF RESPONSIBILITY");
        ComplaintHandler baristaHandler = new BaristaHandler();
        ComplaintHandler managerHandler = new ManagerHandler();
        ComplaintHandler ownerHandler = new OwnerHandler();
        baristaHandler.setNextHandler(managerHandler);
        managerHandler.setNextHandler(ownerHandler);

        baristaHandler.handleComplaint(1, "Кава трохи холодна.");
        baristaHandler.handleComplaint(3, "Я знайшов муху в тістечку!");
        baristaHandler.handleComplaint(5, "Я хочу відкрити франшизу вашого кафе.");

        //COMMAND
        System.out.println("\nПатерн COMMAND");
        BaristaReceiver kitchenBarista = new BaristaReceiver();
        Command coffeeOrder = new CoffeeCommand(kitchenBarista);
        WaiterInvoker waiterInvoker = new WaiterInvoker();

        waiterInvoker.takeOrder(coffeeOrder);
        waiterInvoker.sendToKitchen();

        //ITERATOR
        System.out.println("\nПатерн ITERATOR");
        CoffeeMenu menu = new CoffeeMenu();
        MenuIterator iterator = menu.createIterator();
        System.out.println("Меню на сьогодні:");
        while (iterator.hasNext()) {
            System.out.println("- " + iterator.next());
        }

        //MEDIATOR
        System.out.println("\nMEDIATOR");
        CoffeeShopSystem system = new CoffeeShopSystem();
        Waiter systemWaiter = new Waiter(system);
        Barista systemBarista = new Barista(system);

        system.setWaiter(systemWaiter);
        system.setBarista(systemBarista);
        systemWaiter.takeOrder();

        //MEMENTO
        System.out.println("\nПатерн MEMENTO");
        OrderTerminal terminal = new OrderTerminal();
        terminal.addIngredient("Еспресо");
        OrderSnapshot savedState = terminal.save();
        terminal.addIngredient("Молоко");
        terminal.addIngredient("Сироп");
        terminal.restore(savedState);

        //OBSERVER
        System.out.println("\nПатерн OBSERVER");
        OrderBoard board = new OrderBoard();
        Customer customer1 = new CoffeeCustomer("Олексій");
        Customer customer2 = new CoffeeCustomer("Марія");

        board.subscribe(customer1);
        board.subscribe(customer2);
        board.notifyCustomers("Замовлення №15 (Два капучино) готове!");

        //STATE
        System.out.println("\nПатерн STATE");
        CoffeeMachine machine = new CoffeeMachine();
        machine.pressButton();
        machine.pressButton();
        machine.pressButton();

        //STRATEGY
        System.out.println("\nПатерн STRATEGY");
        Order myOrder = new Order(250.0);
        myOrder.setPaymentStrategy(new CardPayment());
        myOrder.processPayment();

        //TEMPLATE METHOD
        System.out.println("\nПатерн TEMPLATE METHOD");
        System.out.println("Готуємо чай:");
        BeverageMaker myTea = new TeaMaker();
        myTea.makeBeverage();

        //VISITOR
        System.out.println("\nПатерн VISITOR");
        MenuItem item1 = new CoffeeItem();
        MenuItem item2 = new PastryItem();
        Visitor taxInspector = new TaxVisitor();

        item1.accept(taxInspector);
        item2.accept(taxInspector);
    }
}