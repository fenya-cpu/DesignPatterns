package behavioral.state;

public class ReadyState implements MachineState {
    @Override
    public void pressButton(CoffeeMachine machine) {
        System.out.println("Починаю варити каву");
        machine.setState(new BrewingState());
    }
}