package creational;

interface SmartDevice {
    void turnOn();
}

class SmartLight implements SmartDevice {
    public void turnOn() { System.out.println("Світло увімкнено."); }
}

class SmartSocket implements SmartDevice {
    public void turnOn() { System.out.println("Розетку увімкнено."); }
}

public class SimpleDeviceFactory {
    public SmartDevice createDevice(String type) {
        if (type.equalsIgnoreCase("light")) return new SmartLight();
        if (type.equalsIgnoreCase("socket")) return new SmartSocket();
        return null;
    }
}