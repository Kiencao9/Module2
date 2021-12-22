package BaiTap_22_12;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ManagerHuman managerHuman = new ManagerHuman();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("-----MENU-----");
            System.out.println("1. Hiển thị tất cả người");
            System.out.println("2. Hiển thị tất cả nam");
            System.out.println("3. Hiển thị tất cả nữ");
            System.out.println("4. Hiển thị tất cả người dưới 20 tuổi");
            System.out.println("5. Thêm một người");
            System.out.println("6. Xóa một người trong danh sách");
            System.out.println("7. Sửa một người trong danh sách");
            System.out.println("8. Hiển thị tất cả người theo tên");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    managerHuman.displayHuman();
                    break;
                case 2:
                    managerHuman.displayByGender1();
                    break;
                case 3:
                    managerHuman.displayByGender2();
                    break;
                case 4:
                    managerHuman.displayByAge();
                    break;
                case 5:
                    managerHuman.addHuman();
                    break;
                case 6:
                    managerHuman.deleteByName();
                    break;
                case 7:
                    managerHuman.editHumanByName();
                    break;
                case 8:
                    managerHuman.searchByName();
                    break;
            }
        } while (choice != 0);
    }
}
