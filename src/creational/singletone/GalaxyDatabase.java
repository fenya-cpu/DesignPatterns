package creational.singletone;
import java.time.LocalDateTime;

public final class GalaxyDatabase {
    private static volatile GalaxyDatabase instance;
    private LocalDateTime lastSyncTime;

    private GalaxyDatabase() {
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


    public LocalDateTime getLastSyncTime() {
        return lastSyncTime;
    }
}