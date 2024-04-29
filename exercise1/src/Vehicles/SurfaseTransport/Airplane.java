package Vehicles.SurfaseTransport;

import AreCommonClass.Propellers;
import AreCommonClass.Wheels;
import Interfase.Takeoff;
import Interfase.TransportsGoods;
import AreCommonClass.Person;

public class Airplane extends SurfaceTransport implements TransportsGoods, Takeoff {
    private Person[] airplaneCrew;

    public Airplane(String engine, Integer maxSpeed, Integer displacement) {
        super(engine, maxSpeed, displacement);
    }

    public Airplane(String engine, Integer maxSpeed, Wheels[] wheels, Propellers[] airplanePropellers, Person[] airplaneCrew) {
        super(engine, maxSpeed, wheels, airplanePropellers);
        this.airplaneCrew = airplaneCrew;
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
