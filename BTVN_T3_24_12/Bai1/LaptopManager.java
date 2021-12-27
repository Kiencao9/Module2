package BTVN_T3_24_12.Bai1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class LaptopManager {
    ArrayList<Laptop> laptops = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayAll() {
        for (Laptop laptop : laptops) {
            System.out.println(laptop);
        }
    }

    public void addLaptop() {
        System.out.println("Nhập tên hãng:");
        String name = scanner.nextLine();
        System.out.println("Nhập màu sắc sản phẩm: ");
        String color = scanner.nextLine();
        System.out.println("Nhập giá tiền sản phẩm:");
        int price = scanner.nextInt();
        System.out.println("Nhập số lượng sản phẩm:");
        int quantily = scanner.nextInt();
        Laptop laptop = new Laptop(name, color, price, quantily);
        laptops.add(laptop);
    }


    public Laptop deleteLaptopById(int id) {
        Laptop laptop = null;
        for (Laptop l : laptops) {
            if (l.getId() == id) {
                laptop = l;
                break;
            }
        }
        laptops.remove(laptop);
        return laptop;
    }

    public Laptop editById(int id) {
        Laptop laptop1 = null;
        for (Laptop laptop : laptops) {
            if (laptop.getId() == id) {
                laptop1 = laptop;
                break;
            }
        }
        if (laptop1 != null) {
            System.out.println("Nhập tên hãng mới:");
            String name = scanner.nextLine();
            laptop1.setName(name);
            System.out.println("Nhập màu sắc mới:");
            String color = scanner.nextLine();
            laptop1.setColor(color);
            System.out.println("Nhập giá mới:");
            int price = scanner.nextInt();
            laptop1.setPrice(price);
            System.out.println("Nhập số lượng mới:");
            int quantily = scanner.nextInt();
            laptop1.setQuantily(quantily);
            return laptop1;
        }
        return null;
    }


    public void displayName(String name) {
        for (int i = 0; i < laptops.size(); i++) {
            if (laptops.get(i).getName().equals(name)) {
                System.out.println(laptops.get(i));
            }
        }
    }
    public void searchByPrice(int price1, int price2) {
        for (int i = 0; i < laptops.size(); i++) {
            if (laptops.get(i).getPrice() > price1 && laptops.get(i).getPrice() < price2) {
                System.out.println(laptops.get(i));
            }
        }
    }

    public void searchByName(String name) {
        for (int i = 0; i < laptops.size(); i++) {
            if (laptops.get(i).getName().equals(name)) {
                System.out.println(laptops.get(i));
            }
        }
    }

    public void searchByColor(String color) {
        for (int i = 0; i < laptops.size(); i++) {
            if (laptops.get(i).getColor().equals(color)) {
                System.out.println(laptops.get(i));
            }
        }
    }

    public void readFile() {

    }
}
