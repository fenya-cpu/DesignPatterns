package creational;

interface Camera { void record(); }
interface Display { void showVideo(); }

class XiaomiCamera implements Camera { public void record() { System.out.println("Xiaomi Камера записує."); } }
class XiaomiDisplay implements Display { public void showVideo() { System.out.println("Xiaomi Дисплей показує відео."); } }

class AppleCamera implements Camera { public void record() { System.out.println("Apple Камера записує у 4K."); } }
class AppleDisplay implements Display { public void showVideo() { System.out.println("Apple Дисплей показує відео з Retina."); } }

public interface EcosystemFactory {
    Camera createCamera();
    Display createDisplay();
}

class XiaomiFactory implements EcosystemFactory {
    public Camera createCamera() { return new XiaomiCamera(); }
    public Display createDisplay() { return new XiaomiDisplay(); }
}

class AppleFactory implements EcosystemFactory {
    public Camera createCamera() { return new AppleCamera(); }
    public Display createDisplay() { return new AppleDisplay(); }
}