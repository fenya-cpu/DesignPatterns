package behavioral.command;

public class CoffeeCommand implements Command {
    private BaristaReceiver barista;

    public CoffeeCommand(BaristaReceiver barista) {
        this.barista = barista;
    }

    @Override
    public void execute() {
        barista.makeCoffee();
    }
}