package Vehicles.Cars;

import AreCommonClass.Person;
import AreCommonClass.Wheels;

public class Taxi extends Cars{
    private Person driver;
    private Integer passengerSeats;

    public Taxi(String engine, Integer maxSpeed, Wheels[] wheels) {
        super(engine, maxSpeed, wheels);
    }

    public Taxi(String engine, Integer maxSpeed, Wheels[] wheels, Person driver, Integer passengerSeats) {
        super(engine, maxSpeed, wheels);
        this.driver = driver;
        this.passengerSeats = passengerSeats;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public Integer getPassengerSeats() {
        return passengerSeats;
    }

    public void setPassengerSeats(Integer passengerSeats) {
        this.passengerSeats = passengerSeats;
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append("Taxi{").append("driver=").append(driver)
                .append(", passengerSeats=").append(passengerSeats).append("} ").append(super.toString()));
    }
}
