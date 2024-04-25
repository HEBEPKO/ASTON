package Vehicles.SurfaseTransport;

import AreCommonClass.Propellers;
import AreCommonClass.Wheels;
import Interfase.TransportsGoods;
import Vehicles.Person;

public class TransportHelicopter extends Helicopter implements TransportsGoods {
    private Person[] helicopterCrew;

    public TransportHelicopter(String engine, Integer maxSpeed, Integer displacement, Wheels[] wheels, Propellers[] shipPropellers) {
        super(engine, maxSpeed, displacement, wheels, shipPropellers);
    }

    public TransportHelicopter(String engine, Integer maxSpeed, Integer displacement, Wheels[] wheels, Propellers[] shipPropellers, Person[] helicopterCrew) {
        super(engine, maxSpeed, displacement, wheels, shipPropellers);
        this.helicopterCrew = helicopterCrew;
    }

    @Override
    public void transportsGoods() {
        System.out.println("Этот Helicopter перевозит грузы до 10т.");
    }
}
