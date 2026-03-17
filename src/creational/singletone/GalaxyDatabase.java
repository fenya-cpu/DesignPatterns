package creational.singletone;
import java.time.LocalDateTime;

public final class GalaxyDatabase {
    private static volatile GalaxyDatabase instance;
    private final String connectionUrl;
    private final int maxConnections;
    private int activeConnections;
    private LocalDateTime lastSyncTime;

    private GalaxyDatabase() {
        this.connectionUrl = "jdbc:galaxy://milkyway.db:5432";
        this.maxConnections = 1000;
        this.activeConnections = 0;
        this.lastSyncTime = LocalDateTime.now();
    }

    public static GalaxyDatabase getInstance() {
        if (instance == null) {
            synchronized (GalaxyDatabase.class) {
                if (instance == null) {
                    instance = new GalaxyDatabase();
                }
            }
        }
        return instance;
    }

    public void connect() {
        if (activeConnections < maxConnections) {
            activeConnections++;
            System.out.println("Підключено до: " + connectionUrl + ". Активних з'єднань: " + activeConnections);
        } else {
            System.out.println("Помилка: досягнуто ліміт підключень!");
        }
    }

    public LocalDateTime getLastSyncTime() { return lastSyncTime; }
}