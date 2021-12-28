package Bai17.baitap;

import java.io.Serializable;

public class SP implements Serializable {
    private int id;
    private String name;
    private String hang;
    private double price;
    private String comment;
    private static int idNumber = 1;


    public SP() {
    }

    public SP(String name, String hang, double price, String comment) {
        this.id = idNumber++;
        this.name = name;
        this.hang = hang;
        this.price = price;
        this.comment = comment;
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

    public String getHang() {
        return hang;
    }

    public void setHang(String hang) {
        this.hang = hang;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public static int getIdNumber() {
        return idNumber;
    }

    public static void setIdNumber(int idNumber) {
        SP.idNumber = idNumber;
    }

    @Override
    public String toString() {
        return "SP{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", hang='" + hang + '\'' +
                ", price=" + price +
                ", comment='" + comment + '\'' +
                '}';
    }
}
