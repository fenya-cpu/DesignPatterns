package creational;

interface Sensor {
    void trigger();
}

class TemperatureSensor implements Sensor {
    public void trigger() { System.out.println("Сенсор: Температура змінилася."); }
}

class MotionSensor implements Sensor {
    public void trigger() { System.out.println("Сенсор: Виявлено рух!"); }
}

public abstract class SensorCreator {
    public abstract Sensor createSensor();

    public void installAndTest() {
        Sensor sensor = createSensor();
        System.out.println("Сенсор встановлено. Тестування...");
        sensor.trigger();
    }
}

class TemperatureSensorCreator extends SensorCreator {
    public Sensor createSensor() { return new TemperatureSensor(); }
}

class MotionSensorCreator extends SensorCreator {
    public Sensor createSensor() { return new MotionSensor(); }
}