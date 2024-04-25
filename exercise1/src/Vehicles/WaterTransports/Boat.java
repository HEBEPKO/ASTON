package Vehicles.WaterTransports;

import AreCommonClass.Person;
import AreCommonClass.Propellers;

import java.util.Arrays;

public class Boat extends WaterTransport{
    private Person[] shipCrew;
    private Integer passengerCapacity;

    public Boat(String engine, Integer maxSpeed, Integer displacement, Propellers[] shipPropellers) {
        super(engine, maxSpeed, displacement, shipPropellers);
    }

    public Boat(String engine, Integer maxSpeed, Integer displacement, Propellers[] shipPropellers, Person[] shipCrew, Integer passengerCapacity) {
        super(engine, maxSpeed, displacement, shipPropellers);
        this.shipCrew = shipCrew;
        this.passengerCapacity = passengerCapacity;
    }

    public Person[] getShipCrew() {
        return shipCrew;
    }

    public void setShipCrew(Person[] shipCrew) {
        this.shipCrew = shipCrew;
    }

    public Integer getPassengerCapacity() {
        return passengerCapacity;
    }

    public void setPassengerCapacity(Integer passengerCapacity) {
        this.passengerCapacity = passengerCapacity;
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append("Boat{").append("shipCrew=").append(Arrays.toString(shipCrew))
                .append(", passengerCapacity=").append(passengerCapacity).append("} ").append(super.toString()));
    }
}
