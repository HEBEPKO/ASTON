package Vehicles.WaterTransports;

import AreCommonClass.Person;
import Interfase.TransportsGoods;
import AreCommonClass.Propellers;

public class Tanker extends WaterTransport implements TransportsGoods {
    private Integer liftingCapacity;
    private Person[] shipCrew;

    public Tanker(String engine, Integer maxSpeed, Integer displacement, Propellers[] shipPropellers) {
        super(engine, maxSpeed, displacement, shipPropellers);
    }

    public Tanker(String engine, Integer maxSpeed, Integer displacement, Propellers[] shipPropellers, Integer liftingCapacity,Person[] shipCrew) {
        super(engine, maxSpeed, displacement, shipPropellers);
        this.liftingCapacity = liftingCapacity;
        this.shipCrew = shipCrew;
    }

    public Integer getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(Integer liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void transportsGoods() {
        System.out.println("Этот Tanker перевозит до 100т. грузов");
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append("Tanker{").append("liftingCapacity=")
                .append(liftingCapacity).append("shipCrew= ").append(shipCrew).append("} ").append(super.toString()));
    }
}
