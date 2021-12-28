package Bai5.thuchanh2;

public class TestStaticProperty {
    public static void main(String[] args) {
        Car car1 = new Car("Maza 3", "Skyactiv 3");
        System.out.println(Car.numberOfCars);
        Car car2 = new Car("Mazada 6", "Skyactiv 6");
        System.out.println(Car.numberOfCars);
    }
}
