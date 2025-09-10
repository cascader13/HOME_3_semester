package vehicles;

public class Car extends Vehicle {

    @Override
    public String vehicleType() {
        return "Car";
    }


    public Car(String model, String license, String color, Integer year, String ownerName, String insuranceNumber, String engineType) {
        setModel(model);
        setLicense(license);
        setColor(color);
        setYear(year);
        setOwnerName(ownerName);
        setInsuranceNumber(insuranceNumber);
        setEngineType(engineType);
    }

    public void ToString(){
        String s = String.format("car1: %s %s %s %d %s %s %s\n", getModel(), getLicense(), getColor(), getYear(), getOwnerName(), getInsuranceNumber(), getEngineType());
        System.out.println(s);
    }


}
