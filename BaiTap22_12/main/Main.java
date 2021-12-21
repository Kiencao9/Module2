package BaiTap22_12.main;

import BaiTap22_12.manager.ManagerCandy;
import BaiTap22_12.model.Candy;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerCandy managerCandy = new ManagerCandy();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("1. Hiển thị tất cả kẹo");
            System.out.println("2. Thêm kẹo vào danh sách");
            System.out.println("3. Xóa kẹo theo id");
            System.out.println("4. Sửa một viên kẹo theo id");
            System.out.println("5. Hiển thị viên kẹo theo id");
            System.out.println("6. Xóa tất cả viên kẹo có màu nhập từ bàn phím");
            System.out.println("Mời nhập lựa chọn");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    managerCandy.displayAll();
                    break;
                case 2:
                    Candy candy = (Candy) managerCandy.createCandy();
                    managerCandy.addCandy(candy);
                    break;
                case 3:
                    System.out.println("Nhập id muốn xóa");
                    int id = scanner.nextInt();
                    managerCandy.delete(id);
                    break;
                case 5:
                    System.out.println("Nhập id kẹo muốn tìm");
                    int id1 = scanner.nextInt();
                    managerCandy.displayById(id1);
                    break;
                case 6:

            }
        } while (choice != 0);
    }
}
