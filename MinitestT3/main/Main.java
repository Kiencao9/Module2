package MinitestT3.main;

import MinitestT3.manager.StudentManager;
import MinitestT3.model.Student;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("----MENU----");
            System.out.println("1. Hiển thị sinh viên");
            System.out.println("2. Thêm sinh viên");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Tìm kiếm sinh viên");
            System.out.println("5. Sắp xếp theo điểm trung bình");
            System.out.println("6. Tìm sinh viên có điểm cao nhất");
            System.out.println("0.Quay lại MENU");
            System.out.println("Mời nhập lựa chọn");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    studentManager.displayAll();
                    break;
                case 2:
                    studentManager.addStudent();
                    break;
                case 3:
                    System.out.println("Nhập id muốn sửa");
                    int id = scanner.nextInt();
                    studentManager.editById(id);
                    break;
                case 4:
                    studentManager.delete();
                    break;
                case 5:
                    studentManager.searchById();
                    break;
                case 6:

            }
        } while (choice != 0);
    }
}
