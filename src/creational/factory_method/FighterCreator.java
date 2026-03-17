package creational.factory_method;
import java.util.UUID;

public class FighterCreator extends SpaceshipCreator {
    @Override
    public Spaceship createShip() {
        String randomCallsign = "Viper-" + UUID.randomUUID().toString().substring(0, 4);
        return new FighterShip(randomCallsign, 150.5, 6, 9.8);
    }
}