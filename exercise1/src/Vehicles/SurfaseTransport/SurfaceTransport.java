package Vehicles.SurfaseTransport;

import Vehicles.Vehicles;

import java.util.Arrays;

public class SurfaceTransport extends Vehicles {
    private Integer displacement;
    private Integer[] wheels;
    private Integer[] airplanePropellers;

    public SurfaceTransport(String engine, Integer maxSpeed,Integer displacement) {
        super(engine, maxSpeed);
        this.displacement = displacement;
    }

    public SurfaceTransport(String engine, Integer maxSpeed, Integer displacement, Integer[] wheels, Integer[] airplanePropellers) {
        super(engine, maxSpeed);
        this.displacement = displacement;
        this.wheels = wheels;
        this.airplanePropellers = airplanePropellers;
    }

    public Integer getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    public Integer[] getWheels() {
        return wheels;
    }

    public void setWheels(Integer[] wheels) {
        this.wheels = wheels;
    }

    public Integer[] getAirplanePropellers() {
        return airplanePropellers;
    }

    public void setAirplanePropellers(Integer[] airplanePropellers) {
        this.airplanePropellers = airplanePropellers;
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append("SurfaceTransport{").append("displacement=")
                .append(displacement).append(", wheels=").append(Arrays.toString(wheels))
                .append(", shipPropellers=").append(Arrays.toString(airplanePropellers)).append("} ")
                .append(super.toString()));
    }
}
