package behavioral.state;

public class BrewingState implements MachineState {
    @Override
    public void pressButton(CoffeeMachine machine) {
        System.out.println("Зачекайте, я вже варю каву! Не тисніть кнопку!");
    }
}