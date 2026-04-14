package behavioral.state;

public class CoffeeMachine {
    private MachineState currentState;

    public CoffeeMachine() {
        this.currentState = new OffState();
    }

    public void setState(MachineState state) {
        this.currentState = state;
    }

    public void pressButton() {
        currentState.pressButton(this);
    }
}