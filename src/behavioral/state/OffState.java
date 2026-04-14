package behavioral.state;

public class OffState implements MachineState {
    @Override
    public void pressButton(CoffeeMachine machine) {
        System.out.println("Машина увімкнулась і тепер готова до роботи.");
        machine.setState(new ReadyState());
    }
}