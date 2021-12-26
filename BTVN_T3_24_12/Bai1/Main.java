package BTVN_T3_24_12.Bai1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        LaptopManager laptopManager = new LaptopManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("----MENU----");
            System.out.println("1. Thêm Laptop");
            System.out.println("2. Sửa Laptop");
            System.out.println("3. Xóa Laptop");
            System.out.println("4. Hiển thị tất cả Laptop");
            System.out.println("5. Hiển thị sản phẩm theo hãng");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    laptopManager.addLaptop();
                    break;
                case 2:
                    System.out.println("Nhập id muốn xóa");
                    int id = scanner.nextInt();
                    laptopManager.editById(id);
                    break;
                case 3:
                    System.out.println("Nhập id muốn sửa");
                    int id1 = scanner.nextInt();
                    laptopManager.deleteLaptopById(id1);
                    break;
                case 4:
                    laptopManager.displayAll();
                    break;
                case 5:
                    System.out.println("Nhập tên hãng muốn tìm");
                    String name = scanner.nextLine();
                    laptopManager.displayName(name);
                    break;
                case 6:
                    System.out.println("Nhập giá tối thiểu");
                    int price1 = scanner.nextInt();
                    System.out.println("Nhập giá tối đa");
                    int price2 = scanner.nextInt();
                    laptopManager.searchByPrice(price1, price2);
                    break;
                case 7:
                    System.out.println("Nhập tên hãng muốn tìm");
                    String name7 = scanner.nextLine();
                    laptopManager.searchByName(name7);
                    break;
                case 8:
                    System.out.println("Nhập màu sắc cần tìm");
                    String color = scanner.nextLine();
                    laptopManager.searchByColor(color);
                    break;
            }
        } while (choice != 0);
    }
}
