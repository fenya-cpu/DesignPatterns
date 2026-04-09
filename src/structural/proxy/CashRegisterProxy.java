package structural.proxy;

public class CashRegisterProxy implements CashRegister {
    private RealCashRegister realCashRegister;
    private String employeeRole;

    public CashRegisterProxy(String employeeRole) {
        this.employeeRole = employeeRole;
    }

    @Override
    public void processRefund(double amount) {
        if ("MANAGER".equalsIgnoreCase(employeeRole)) {
            if (realCashRegister == null) {
                realCashRegister = new RealCashRegister();
            }
            realCashRegister.processRefund(amount);
        } else {
            System.out.println("Помилка доступу: " + employeeRole + " не має прав робити повернення коштів!");
        }
    }
}