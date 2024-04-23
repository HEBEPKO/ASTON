package Vehicles;

public abstract class Vehicles {
    private String engine;
    private Integer maxSpeed;

    public Vehicles(String engine, Integer maxSpeed) {
        this.engine = engine;
        this.maxSpeed = maxSpeed;
    }

    public String getEngine() {
        return engine;
    }

    public Integer getMaxSpeed() {
        return maxSpeed;
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append("Vehicles{").append("engine='")
                .append(engine).append(", maxSpeed=").append(maxSpeed).append('}'));
    }
}
