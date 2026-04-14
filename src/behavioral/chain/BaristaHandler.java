package behavioral.chain;

public class BaristaHandler extends ComplaintHandler {
    @Override
    public void handleComplaint(int severityLevel, String message) {
        if (severityLevel <= 1) {
            System.out.println("Бариста: Я перероблю вашу каву безкоштовно. Проблема: " + message);
        } else if (nextHandler != null) {
            nextHandler.handleComplaint(severityLevel, message);
        }
    }
}