package BaiTap29_12;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viêm");
            System.out.println("3. Sửa thông tin sinh viên");
            System.out.println("4. Hiển thị tất cả sinh viên");
            System.out.println("5. Hiển thị sinh viên có điểm TB trên 7.5");
            System.out.println("6. Hiển thị xếp loại sinh viên");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    System.out.println("Nhập tên sinh viên muốn xóa");
                    String name = scanner.nextLine();
                    studentManager.deleteStudent(name);
                    break;
                case 3:
                    System.out.println("Nhập tên muốn sửa:");
                    String name3 = scanner.nextLine();
                    studentManager.editByName(name3);
                    break;
                case 4:
                    studentManager.displayAll();
                    break;
                case 5:
                    studentManager.displayByScore();
                    break;
                case 6:
                    studentManager.displayStudent();
                    break;
            }
        } while ( choice != 0);
    }
}
