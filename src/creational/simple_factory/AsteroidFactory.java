package creational.simple_factory;

import java.util.UUID;

public class AsteroidFactory {
    public Asteroid createAsteroid(String type, double mass) {
        String randomName = "AST-" + UUID.randomUUID().toString().substring(0, 5).toUpperCase();

        if ("ice".equalsIgnoreCase(type)) {
            return new IceAsteroid(randomName, mass, mass * 0.8, -150.5);
        } else if ("iron".equalsIgnoreCase(type)) {
            return new IronAsteroid(randomName, mass, 95.5, true);
        }
        throw new IllegalArgumentException("Невідомий тип: " + type);
    }
}