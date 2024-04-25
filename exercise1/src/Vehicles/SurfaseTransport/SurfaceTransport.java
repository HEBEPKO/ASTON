package Vehicles.SurfaseTransport;

import AreCommonClass.Propellers;
import AreCommonClass.Wheels;
import Vehicles.Vehicles;

import java.util.Arrays;

public class SurfaceTransport extends Vehicles {
    private Integer displacement;
    private Wheels[] wheels;
    private Propellers[] airplanePropellers;

    public SurfaceTransport(String engine, Integer maxSpeed, Integer displacement, Wheels[] wheels, Propellers[] shipPropellers) {
        super(engine, maxSpeed);
    }

    public SurfaceTransport(String engine, Integer maxSpeed, Wheels[] wheels, Propellers[] airplanePropellers) {
        super(engine, maxSpeed);
        this.wheels = wheels;
        this.airplanePropellers = airplanePropellers;
    }

    public Wheels[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheels[] wheels) {
        this.wheels = wheels;
    }

    public Propellers[] getAirplanePropellers() {
        return airplanePropellers;
    }

    public void setAirplanePropellers(Propellers[] airplanePropellers) {
        this.airplanePropellers = airplanePropellers;
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append("SurfaceTransport{").append(", wheels=").append(Arrays.toString(wheels))
                .append(", shipPropellers=").append(Arrays.toString(airplanePropellers)).append("} ")
                .append(super.toString()));
    }
}
