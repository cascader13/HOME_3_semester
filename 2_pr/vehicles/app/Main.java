package vehicles.app;


import vehicles.Car;
import vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Alex", "1", "Gazoline");
        ElectricCar car2 = new ElectricCar("Dmitriy", "2", 100);
        System.out.println(String.format("car1: %s %s %s\n", car1.getOwnerName(), car1.getInsuranceNumber(), car1.getEngineType()));
        System.out.println(String.format("car1: %s %s %s %d\n", car2.getOwnerName(), car2.getInsuranceNumber(), car2.getEngineType(), car2.getBatteryCapacity()));
    }

}