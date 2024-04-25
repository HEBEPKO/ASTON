package Vehicles.Cars;

import AreCommonClass.Wheels;
import Vehicles.Vehicles;

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
}
