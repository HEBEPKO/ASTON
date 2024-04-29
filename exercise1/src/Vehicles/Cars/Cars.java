package Vehicles.Cars;

import AreCommonClass.Wheels;
import Vehicles.Vehicles;

import java.util.Arrays;

public class Cars extends Vehicles {
    private Wheels[] wheels;
    public Cars(String engine, Integer maxSpeed) {
        super(engine, maxSpeed);
    }

    public Cars(String engine, Integer maxSpeed, Wheels[] wheels) {
        super(engine, maxSpeed);
        this.wheels = wheels;
    }

    public Wheels[] getWheels() {
        return wheels;
    }

    public void setWheels(Wheels[] wheels) {
        this.wheels = wheels;
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append("Cars{").append("wheels=")
                .append(Arrays.toString(wheels)).append("} ").append(super.toString()));
    }
}
