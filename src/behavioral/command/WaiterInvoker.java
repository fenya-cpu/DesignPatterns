package behavioral.command;

public class WaiterInvoker {
    private Command command;

    public void takeOrder(Command command) {
        System.out.println("Офіціант: Замовлення прийнято, передаю на кухню.");
        this.command = command;
    }

    public void sendToKitchen() {
        if (command != null) {
            command.execute();
        }
    }
}