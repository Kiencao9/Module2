package BTVN_T3_24_12.Bai2;

public class Banana extends Fruit{
    public Banana() {
    }

    public Banana(String name, double weight, String taste, String color, double price) {
        super(name, weight, taste, color, price);
    }

    @Override
    public String toString() {
        return "Banana" + super.toString();
    }
}
