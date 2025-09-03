
public class Main {

    public static void main(String[] args) {
        Car car1 = new Car("УАЗ", "100123", "Red", 2010);
        Car car2 = new Car();
        Car car3 = new Car("marussia", 2015);
        car1.To_String();
        car2.To_String();
        car3.To_String();
        System.out.println("Age of car " + car3.AgeOfCar());
    }
}
