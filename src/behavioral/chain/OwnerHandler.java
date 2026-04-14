package behavioral.chain;

public class OwnerHandler extends ComplaintHandler {
    @Override
    public void handleComplaint(int severityLevel, String message) {
        System.out.println("Власник: Я особисто розберуся з цією ситуацією. Проблема: " + message);
    }
}