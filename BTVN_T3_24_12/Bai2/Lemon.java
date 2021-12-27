package BTVN_T3_24_12.Bai2;

public class Lemon extends Fruit{
    public Lemon() {
    }

    public Lemon(String name, double weight, String taste, String color, double price) {
        super(name, weight, taste, color, price);
    }

    @Override
    public String toString() {
        return "Lemon" + super.toString();
    }
}
