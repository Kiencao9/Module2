package BTVN_T3_24_12.Bai2;

import java.util.ArrayList;
import java.util.Scanner;

public class FruitManager {
    private ArrayList<Fruit> fruits;
    private Scanner scanner = new Scanner(System.in);

    public FruitManager() {
        this.fruits = new ArrayList<>();
    }

    public void displayAll() {
        for (Fruit fruit : fruits) {
            System.out.println(fruit);
        }
    }

    public void displayApple() {
        for (Fruit fruit : fruits) {
        }
    }

    public Fruit createFruit(int choice) {
        System.out.println("Nhập cân nặng(kg): ");
        double weight = scanner.nextDouble();
        System.out.println("Nhập vị");
        scanner.nextLine();
        String taste = scanner.nextLine();
        System.out.println("Nhập màu sắc:");
        String color = scanner.nextLine();
        System.out.println("Nhập giá tiền:");
        double price = scanner.nextDouble();
        if (choice == 1) {
            return new Apple(weight, taste, color, price);
        } else if (choice == 2) {
            return new Banana(weight, taste, color, price);
        } else if (choice == 3) {
            return new Lemon(weight, taste, color, price);
        }
        return null;
    }

    public void addFruit(Fruit fruit) {
        fruits.add(fruit);
    }

    public void displayByPrice() {

    }
}
