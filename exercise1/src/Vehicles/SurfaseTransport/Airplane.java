package Vehicles.SurfaseTransport;

import Interfase.Takeoff;
import Interfase.TransportsGoods;
import Vehicles.Person;

public class Airplane extends SurfaceTransport implements TransportsGoods, Takeoff {
    private Person[] airplaneCrew;

    public Airplane(String engine, Integer maxSpeed, Integer displacement) {
        super(engine, maxSpeed, displacement);
    }

    public Airplane(String engine, Integer maxSpeed, Integer displacement, Integer[] wheels, Integer[] shipPropellers) {
        super(engine, maxSpeed, displacement, wheels, shipPropellers);
    }



    @Override
    public void transportsGoods() {
        System.out.println("Этот Airplane перевозит грузы до 40т.");
    }

    @Override
    public void takeoff() {
        System.out.println("Helicopter осуществляет взлёт горизонтально с использованием взлётной полосы");
    }
}
