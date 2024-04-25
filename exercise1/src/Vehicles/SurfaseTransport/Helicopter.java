package Vehicles.SurfaseTransport;

import AreCommonClass.Propellers;
import AreCommonClass.Wheels;
import Interfase.Takeoff;

public class Helicopter extends SurfaceTransport implements Takeoff {

    public Helicopter(String engine, Integer maxSpeed, Integer displacement, Wheels[] wheels, Propellers[] shipPropellers) {
        super(engine, maxSpeed, displacement, wheels, shipPropellers);
    }

    @Override
    public void takeoff() {
        System.out.println("Helicopter осуществляет взлёт вертикально");
    }
}
