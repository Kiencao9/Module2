package BaiTap22_12.manager;

import BaiTap22_12.model.Candy;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.Callable;

public class ManagerCandy {
    private ArrayList<Candy> candies;
    private Scanner scanner = new Scanner(System.in);

    public ManagerCandy() {
        this.candies = new ArrayList<>();
    }

    public void displayAll() {
        for (Candy candy : candies) {
            System.out.println(candy);
        }
    }

    public Candy createCandy() {
        scanner.nextLine();
        System.out.println("Nhập màu sắc");
        String color = scanner.nextLine();
        System.out.println("Nhập tính chất");
        String nature = scanner.nextLine();
        System.out.println("Nhập số lượng");
        int quantily = scanner.nextInt();
        System.out.println("Nhập đơn giá");
        double price = scanner.nextDouble();
        return new Candy(color, nature, quantily, price);
    }

    public void addCandy(Candy candy) {
        candies.add(candy);
    }

    public Candy delete(int id) {
        Candy candy = null;
        for (Candy c : candies) {
            if (c.getId() == id) {
                candy = c;
            }
        }
        candies.remove(candy);
        return candy;
    }

    public void displayById(int id) {
        Candy candy = null;
        for (Candy c : candies) {
            if (c.getId() == id) {
                candy = c;
            }
            System.out.println(c);
        }
    }

}
