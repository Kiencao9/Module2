package BTVN_T3_24_12.Bai2;

public class Lemon extends Fruit{
    public Lemon() {
    }

    public Lemon(double weight, String taste, String color, double price) {
        super(weight, taste, color, price);
    }

    @Override
    public String toString() {
        return "Lemon" + super.toString();
    }
}