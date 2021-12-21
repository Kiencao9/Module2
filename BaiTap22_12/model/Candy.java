package BaiTap22_12.model;

public class Candy {
    private int id;
    private String color;
    private String nature;
    private int quantily;
    private double price;
    private static int idNumber = 1;

    public Candy() {
    }

    public Candy(String color, String nature, int quantily, double price) {
        this.id = idNumber++;
        this.color = color;
        this.nature = nature;
        this.quantily = quantily;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getNature() {
        return nature;
    }

    public void setNature(String nature) {
        this.nature = nature;
    }

    public int getQuantily() {
        return quantily;
    }

    public void setQuantily(int quantily) {
        this.quantily = quantily;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        Candy.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "Candy{" +
                "id =" + id +
                ", color='" + color + '\'' +
                ", nature='" + nature + '\'' +
                ", quantily=" + quantily +
                ", price=" + price +
                '}';
    }
}
