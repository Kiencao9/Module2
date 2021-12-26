package BTVN_T3_24_12.Bai2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FruitManager fruitManager = new FruitManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("----MENU----");
            System.out.println("1. Hiển thị tất cả các loại quả");
            System.out.println("2. Hiển thị tất cả quả táo");
            System.out.println("3. Hiển thị tất cả quả chuối");
            System.out.println("4. Hiển thị tất cả quả chanh");
            System.out.println("5. Hiển thị quả có giá cao nhất");
            System.out.println("6. Với 100000 bạn có thể mua được nhiều nhất");
            System.out.println("7. Thêm quả");
            System.out.println("8. Xóa quả");

            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    fruitManager.displayAll();
                    break;
                case 7:
                    int choice1;
                    do {
                        System.out.println("1. Thêm quả táo");
                        System.out.println("2. Thêm quả chuối");
                        System.out.println("3. Thêm quả chanh");
                        System.out.println("0. Quay lại MENU");
                        System.out.println("Nhập lựa chon:");
                        choice1 = scanner.nextInt();

                        switch (choice1) {
                            case 1:
                                Apple apple = (Apple) fruitManager.createFruit(choice1);
                                fruitManager.addFruit(apple);
                                break;
                            case 2:
                                Banana banana = (Banana) fruitManager.createFruit(choice1);
                                fruitManager.addFruit(banana);
                                break;
                            case 3:
                                Lemon lemon = (Lemon) fruitManager.createFruit(choice1);
                                fruitManager.addFruit(lemon);
                                break;
                        }
                    } while (choice1 != 0);
            }
        } while (choice != 0);
    }
}
