package creational;

public class BulbConfig implements Cloneable {
    private String color;
    private int brightness;

    public BulbConfig(String color, int brightness) {
        this.color = color;
        this.brightness = brightness;
    }

    public void setColor(String color) { this.color = color; }
    public void setBrightness(int brightness) { this.brightness = brightness; }

    @Override
    public BulbConfig clone() {
        try {
            return (BulbConfig) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override
    public String toString() {
        return "Колір: " + color + ", Яскравість: " + brightness + "%";
    }
}