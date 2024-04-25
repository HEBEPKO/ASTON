package Vehicles.Cars;

import AreCommonClass.Person;
import AreCommonClass.Wheels;
import Interfase.TransportsGoods;

public class Truck extends Cars implements TransportsGoods {
    private Person driver;
    private Integer liftingCapacity;
    public Truck(String engine, Integer maxSpeed, Wheels[] wheels) {
        super(engine, maxSpeed, wheels);
    }

    public Truck(String engine, Integer maxSpeed, Wheels[] wheels, Person driver, Integer liftingCapacity) {
        super(engine, maxSpeed, wheels);
        this.driver = driver;
        this.liftingCapacity = liftingCapacity;
    }

    public Person getDriver() {
        return driver;
    }

    public void setDriver(Person driver) {
        this.driver = driver;
    }

    public Integer getLiftingCapacity() {
        return liftingCapacity;
    }

    public void setLiftingCapacity(Integer liftingCapacity) {
        this.liftingCapacity = liftingCapacity;
    }

    @Override
    public void transportsGoods() {
        System.out.println("Сопособен перевезти до " + liftingCapacity + "т. грузов");
    }

    @Override
    public String toString() {
        return String.valueOf(new StringBuilder().append("Truck{").append("driver=").append(driver)
                .append(", liftingCapacity=").append(liftingCapacity).append("} ").append(super.toString()));
    }
}
