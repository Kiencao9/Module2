package BaiTapT3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("Menu:");
            System.out.println("1. Thêm con vật");
            System.out.println("5. Hiển thị con vật");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    int choice1;
                    do {
                        System.out.println("1. Mèo");
                        System.out.println("2. Chó");
                        System.out.println("3. Chuột");
                        System.out.println("Nhập lựa chọn");
                        choice1 = scanner.nextInt();
                        switch (choice1) {
                            case 1:
                                Cat cat = (Cat) manager.createAnimal(scanner, choice1);
                                manager.addAnimal(cat);
                                break;
                            case 2:
                                Dog dog = (Dog) manager.createAnimal(scanner, choice1);
                                manager.addAnimal(dog);
                                break;
                            case 3:
                                Mouse mouse = (Mouse) manager.createAnimal(scanner, choice1);
                                manager.addAnimal(mouse);
                                break;
                        }
                    } while (choice1 != 0);
                    break;
                case 5:
                    manager.displayAll();
            }
        } while (choice != 0);
    }
}
