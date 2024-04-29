import AreCommonClass.Wheels;
import Vehicles.Cars.Cars;

public class Main {
    public static void main(String[] args) {

        Cars newCar = new Cars("M60",180, new Wheels[]{new Wheels(21, "Bridgestone"),
                new Wheels(21, "Bridgestone"),new Wheels(21, "Bridgestone"),
                new Wheels(21, "Bridgestone")});
        System.out.println(newCar);
    }
}