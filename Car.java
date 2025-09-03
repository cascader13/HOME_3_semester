public class Car {
    String model = "unknown";                                                               // Модель автомобиля
    String license = "unknown";                                                             // Номер автомобиля
    String color = "unknown";                                                               // Цвет автомобиля
    int year = 0;                                                                           // Год выпуска

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getLicense() {
        return license;
    }

    public void setLicense(String license) {
        this.license = license;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;

    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String model, String license, String color, int year){                        // Полный конструктор
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public Car(){}                                                                            // Default конструктор

    public Car(String model, int year){                                                       // конструктор модели машины
        this.model = model;
        this.year = year;
    }

    public void To_String(){
        String res = String.format("Model: %s, License: %s, Color: %s, Year: %d",
                this.model, this.license, this.color, this.year);
        System.out.println(res);
    }

    public final int AgeOfCar(){
        return 2025 - this.year;
    }

}
