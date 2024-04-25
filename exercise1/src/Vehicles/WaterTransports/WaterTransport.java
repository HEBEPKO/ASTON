package Vehicles.WaterTransports;

import AreCommonClass.Propellers;
import Vehicles.Vehicles;

public class WaterTransport extends Vehicles {
    private Integer displacement;
    private Propellers[] shipPropellers;

    public WaterTransport(String engine, Integer maxSpeed) {
        super(engine, maxSpeed);
    }

    public WaterTransport(String engine, Integer maxSpeed, Integer displacement, Propellers[] shipPropellers) {
        super(engine, maxSpeed);
        this.displacement = displacement;
        this.shipPropellers = shipPropellers;
    }

    public Integer getDisplacement() {
        return displacement;
    }

    public void setDisplacement(Integer displacement) {
        this.displacement = displacement;
    }

    public Propellers[] getShipPropellers() {
        return shipPropellers;
    }

    public void setShipPropellers(Propellers[] shipPropellers) {
        this.shipPropellers = shipPropellers;
    }
}
