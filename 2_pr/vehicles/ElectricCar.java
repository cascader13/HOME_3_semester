package vehicles;

public class ElectricCar extends Car {
    Integer batteryCapacity;

    @Override
    public String vehicleType(){
        return "Electric Car";
    }

    public Integer getBatteryCapacity() {
        return batteryCapacity;
    }

    public void setBatteryCapacity(Integer batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }

    public ElectricCar(String model, String license, String color, Integer year, String ownerName, String insuranceNumber, Integer batteryCapacity) {
        super(model, license, color, year, ownerName, insuranceNumber, "Electric");
        setBatteryCapacity(batteryCapacity);
    }

    @Override
    public void ToString(){
        String s = String.format("car2: %s %s %s %d %s %s %s %d\n", getModel(), getLicense(), getColor(), getYear(), getOwnerName(), getInsuranceNumber(), getEngineType(), getBatteryCapacity());
        System.out.println(s);
    }
}
