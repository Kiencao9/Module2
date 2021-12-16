package MinitestT2.main;

import BTVN.controller.StudentManager;
import MinitestT2.manager.Manager;
import MinitestT2.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        students.add(new Student("A", 18, 8));
        students.add(new Student("B", 18, 9));

        while (true) {
            System.out.println("1. Hiển thị tất cả người");
            System.out.println("2. Thêm người");
            System.out.println("3. Tìm vị trí một người");
            System.out.println("4. Xóa 1 người");
            System.out.println("5. Sửa thông tin một người");
            System.out.println("6. Sắp xếp theo điểm");
            System.out.println("7. Tính tổng điểm");
            int choice = scanner.nextInt();
            Manager manager = new Manager();

            switch (choice) {
                case 1:
                    manager.display(students);
                    break;
                case 2:
                    manager.add(students);
                    break;
                case 3:
                    break;
                case 4:
                    manager.delete(students);
                    break;

            }
        }




    }


}
