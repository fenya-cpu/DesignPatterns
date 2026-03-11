package creational;

public class SmartHomeHub {
    private static SmartHomeHub instance;

    private SmartHomeHub() {
        System.out.println("SmartHomeHub ініціалізовано.");
    }

    public static SmartHomeHub getInstance() {
        if (instance == null) {
            instance = new SmartHomeHub();
        }
        return instance;
    }

    public void connectDevice(String deviceName) {
        System.out.println("Пристрій '" + deviceName + "' підключено до головного хабу.");
    }
}