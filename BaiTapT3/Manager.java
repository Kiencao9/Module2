package BaiTapT3;

import java.lang.invoke.MutableCallSite;
import java.util.ArrayList;
import java.util.Scanner;

public class Manager {
    private ArrayList<Animal>  animals;
    private Scanner scanner = new Scanner(System.in);

    public Manager() {
        this.animals = new ArrayList<>();
    }

    public void displayAll() {
        for (Animal a : animals) {
            System.out.println(a);
        }
    }

    public Animal createAnimal(Scanner scanner, int choice) {
        scanner.nextLine();
        System.out.println("Nhập tên: ");
        String name =  scanner.nextLine();
        System.out.println("Nhập tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Nhập cân nặng");
        double weight = scanner.nextInt();
        if (choice == 1) {
            System.out.println("nhảy");
            String climb = scanner.nextLine();
            return new Cat(name, age, weight,climb);
        } else if (choice == 2) {
            System.out.println("Ăn");
            String eat = scanner.nextLine();
            return new Dog(name, age, weight, eat);
        } else if (choice == 3) {
            System.out.println("Đào");
            String dig = scanner.nextLine();
            return new Mouse(name, age, weight, dig);
        }
        return null;
    }

    public void addAnimal(Animal animal) {
        animals.add(animal);
    }
}
