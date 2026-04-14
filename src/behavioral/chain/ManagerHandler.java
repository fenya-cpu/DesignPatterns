package behavioral.chain;

public class ManagerHandler extends ComplaintHandler {
    @Override
    public void handleComplaint(int severityLevel, String message) {
        if (severityLevel <= 3) {
            System.out.println("Менеджер: Прошу вибачення. Ось купон на безкоштовний десерт. Проблема: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleComplaint(severityLevel, message);
        }
    }
}