package BTVN_T3_24_12.Bai1;

public class Laptop {
    private int id;
    private String name;
    private String color;
    private int price;
    private int quantily;
    private static int idNumber = 1;

    public Laptop() {
    }

    public Laptop(String name, String color, int price, int quantily) {
        this.id = idNumber++;
        this.name = name;
        this.color = color;
        this.price = price;
        this.quantily = quantily;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        Laptop.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", color='" + color + '\'' +
                ", price=" + price +
                ", quantily=" + quantily +
                '}';
    }
}
