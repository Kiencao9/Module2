package Bai17.baitap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SPManager spManager = new SPManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("----MENU----");
            System.out.println("1. Thêm sản phẩm");
            System.out.println("2. Hiển thị sản phẩm");
            System.out.println("3. Tìm kiếm sản phẩm");
            System.out.println("0. Quay lại MENU");
            System.out.println("Mời nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    spManager.addSP();
                    break;
                case 2:
                    spManager.displayAll();
                    break;
                case 3:
                    System.out.println("Nhập id muốn tìm: ");
                    int id = scanner.nextInt();
                    spManager.searchById(id);
                    break;

            }
        } while (choice != 0);
    }

}
