package creational.builder;
public class SpaceStation {
    private final String stationName;
    private final int crewCapacity;
    private final double shieldStrength;
    private final boolean hasHyperdrive;
    private final int weaponBays;
    private final String lifeSupportSystemLevel;

    private SpaceStation(Builder builder) {
        this.stationName = builder.stationName;
        this.crewCapacity = builder.crewCapacity;
        this.shieldStrength = builder.shieldStrength;
        this.hasHyperdrive = builder.hasHyperdrive;
        this.weaponBays = builder.weaponBays;
        this.lifeSupportSystemLevel = builder.lifeSupportSystemLevel;
    }

    @Override
    public String toString() {
        return "SpaceStation{" +
                "Name='" + stationName + '\'' +
                ", Crew=" + crewCapacity +
                ", Shields=" + shieldStrength +
                ", Hyperdrive=" + hasHyperdrive +
                ", Weapons=" + weaponBays +
                ", LifeSupport='" + lifeSupportSystemLevel + '\'' +
                '}';
    }

    public static class Builder {
        private String stationName = "Unknown Outpost";
        private int crewCapacity = 10;
        private double shieldStrength = 0.0;
        private boolean hasHyperdrive = false;
        private int weaponBays = 0;
        private String lifeSupportSystemLevel = "Basic";

        public Builder setStationName(String name)
        {
            this.stationName = name;
            return this;
        }

        public Builder setCrewCapacity(int capacity)
        {
            this.crewCapacity = capacity;
            return this;
        }

        public Builder setShieldStrength(double strength)
        {
            this.shieldStrength = strength;
            return this;
        }

        public Builder enableHyperdrive()
        {
            this.hasHyperdrive = true;
            return this;
        }

        public Builder setWeaponBays(int count)
        {
            this.weaponBays = count;
            return this;
        }

        public Builder setLifeSupport(String level)
        {
            this.lifeSupportSystemLevel = level;
            return this;
        }

        public SpaceStation build() {
            return new SpaceStation(this);
        }
    }
}