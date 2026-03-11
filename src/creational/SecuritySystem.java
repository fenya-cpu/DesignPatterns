package creational;

public class SecuritySystem {
    private boolean hasAlarm;
    private int camerasCount;
    private boolean hasLaserGrid;

    private SecuritySystem(Builder builder) {
        this.hasAlarm = builder.hasAlarm;
        this.camerasCount = builder.camerasCount;
        this.hasLaserGrid = builder.hasLaserGrid;
    }

    public void showConfig() {
        System.out.println("Система безпеки: Сигналізація=" + hasAlarm + ", Камери=" + camerasCount + ", Лазери=" + hasLaserGrid);
    }

    public static class Builder {
        private boolean hasAlarm = false;
        private int camerasCount = 0;
        private boolean hasLaserGrid = false;

        public Builder addAlarm() { this.hasAlarm = true; return this; }
        public Builder addCameras(int count) { this.camerasCount = count; return this; }
        public Builder addLaserGrid() { this.hasLaserGrid = true; return this; }

        public SecuritySystem build() { return new SecuritySystem(this); }
    }
}