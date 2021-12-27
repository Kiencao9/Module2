package BTVN_T3_24_12.Bai2;

public class Apple extends Fruit {
    public Apple() {
    }

    public Apple(String name, double weight, String taste, String color, double price) {
        super(name, weight, taste, color, price);
    }

    @Override
    public String toString() {
        return "Apple:" + super.toString();
    }
}
