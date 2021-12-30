package MinitestT4;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();
        Scanner scanner = new Scanner(System.in);

        int choice;
        do {
            System.out.println("MENU");
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Sửa thông tin sinh viên");
            System.out.println("3. Xóa sinh viên");
            System.out.println("4. Tìm kiếm sinh viên");
            System.out.println("5. Danh sách sinh viên theo điểm trung bình giảm dần");
            System.out.println("6. Danh sách sinh viên theo điểm trung bình tăng dần");
            System.out.println("7. Sinh viên có diểm trung bình cao nhất");
            System.out.println("8. Ghi File");
            System.out.println("9. Đọc File");
            System.out.println("10. Hiển thị tất cả sinh viên");
            System.out.println("0. Quay lại MENU");
            System.out.println("Mời nhập lựa chọn: ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    studentManager.addStudent();
                    break;
                case 2:
                    System.out.println("Nhập id sinh viên muốn sửa:");
                    scanner.nextInt();
                    int id = scanner.nextInt();
                    studentManager.editStudent(id);
                    break;
                case 3:
                    System.out.println("Nhập id sinh viên muốn xóa:");
                    scanner.nextInt();
                    int idDelete = scanner.nextInt();
                    studentManager.deleteStudent(idDelete);
                    break;
                case 4:
                    System.out.println("Nhập id sinh viên muốn tìm:");
                    scanner.nextInt();
                    int idSearch = scanner.nextInt();
                    studentManager.searchById(idSearch);
                    break;
                case 5:
                    studentManager.sortByAVGPoint5();
                    break;
                case 6:
                    studentManager.sortByAVGPoint6();
                    break;
                case 7:
                    studentManager.displayMaxPoint();
                    break;
                case 8:
                    studentManager.writeToFile(studentManager.students, StudentManager.PATH_NAME);
                    break;
                case 9:
                    ArrayList<Student> students = studentManager.readFile(StudentManager.PATH_NAME);
                    students.forEach(System.out::println);
                    break;
                case 10:
                    studentManager.displayAll();
                    break;
            }
        } while (choice != 0);
    }
}
