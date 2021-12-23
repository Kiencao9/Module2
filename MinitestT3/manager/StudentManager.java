package MinitestT3.manager;

import MinitestT3.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void addStudent() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhâp tuổi: ");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm toán:");
        double mathScore = scanner.nextDouble();
        System.out.println("Nhập điểm lý: ");
        double physicScore = scanner.nextDouble();
        System.out.println("Nhập điểm hóa: ");
        double chemistryScore = scanner.nextDouble();
        Student student = new Student(name, age, mathScore, physicScore, chemistryScore);
        students.add(student);
    }

    public void delete() {
        System.out.println("Nhập id muốn xóa: ");
        int id = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
                break;
            }
        }
    }

    public void searchById() {
        int id = scanner.nextInt();
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                System.out.println(students.get(i));
            }
        }
    }

    public Student editById(int id) {
        Student editStudent = null;
        for (Student student : students) {
            if (student.getId() == id) {
                editStudent = student;
                break;
            }
        }
        if (editStudent != null) {
            System.out.println("Nhập tên mới:");
            String name = scanner.nextLine();
            editStudent.setName(name);
            System.out.println("Nhâp tuổi mới: ");
            int age = scanner.nextInt();
            editStudent.setAge(age);
            System.out.println("Nhập điểm toán mới:");
            double mathScore = scanner.nextDouble();
            editStudent.setMathScore(mathScore);
            System.out.println("Nhập điểm lý mới: ");
            double physicScore = scanner.nextDouble();
            editStudent.setPhysicScore(physicScore);
            System.out.println("Nhập điểm hóa mới: ");
            double chemistryScore = scanner.nextDouble();
            editStudent.setChemistryScore(chemistryScore);
            return editStudent;
        }
        return null;
    }

    public void sortByAVGScore() {
        students.sort((o1, o2) -> {
            if (o1.getAvgScore() < o2.getAvgScore()) {
                return 1;
            } else if (o1.getAvgScore() > o2.getAvgScore()) {
                return -1;
            }
            return 0;
        });
        System.out.println("Sắp xếp thành công");
    }

}
