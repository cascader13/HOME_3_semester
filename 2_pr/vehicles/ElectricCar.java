package vehicles;

public class ElectricCar extends Car {
    Integer batteryCapacity;


    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public ElectricCar(String ownerName, String insuranceNumber, Integer batteryCapacity) {
        super(ownerName, insuranceNumber, "Electric");
        this.batteryCapacity = batteryCapacity;
    }
}
