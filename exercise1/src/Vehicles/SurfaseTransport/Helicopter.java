package Vehicles.SurfaseTransport;

import Interfase.Takeoff;

public class Helicopter extends SurfaceTransport implements Takeoff {

    public Helicopter(String engine, Integer maxSpeed, Integer displacement, Integer[] wheels, Integer[] shipPropellers) {
        super(engine, maxSpeed, displacement, wheels, shipPropellers);
    }

    @Override
    public void takeoff() {
        System.out.println("Helicopter осуществляет взлёт вертикально");
    }
}
