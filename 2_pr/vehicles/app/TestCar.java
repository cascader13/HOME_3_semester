package vehicles.app;

import vehicles.Car;
import vehicles.ElectricCar;
import vehicles.Vehicle;

public class TestCar {
    public static void main(String[] args) {
        Vehicle Car1 = new Car("BMV", "112", "red", 2015, "Lari", "3450", "Gazoline");
        Vehicle Car2 = new ElectricCar("Tesla", "204", "blue", 2020, "Ilon", "55423", 324);
        ((Car)Car1).ToString();
        ((ElectricCar)Car2).ToString();
        System.out.println(((Car)Car1).vehicleType());
        System.out.println(((ElectricCar)Car2).vehicleType());
    }
}
