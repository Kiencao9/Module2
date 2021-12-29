package BaiTap29_12;

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
        System.out.println("Nhập tuổi:");
        int age = scanner.nextInt();
        System.out.println("Nhập giới tính:");
        scanner.nextLine();
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ:");
        String address = scanner.nextLine();
        System.out.println("Nhập điểm trung bình");
        double avgScore = scanner.nextDouble();
        scanner.nextLine();
        Student student = new Student(name, age, gender, address, avgScore);
        students.add(student);
    }

    public void deleteStudent(String name) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getName().equals(name)) {
                students.remove(i);
                break;
            }
        }
    }

    public void displayByScore() {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getAvgScore() > 7.5) {
                System.out.println(i);
            }
        }
    }

    public Student editByName(String name) {
        Student student1 = null;
        for (Student student : students) {
            if (student.getName().equals(name)) {
                student1 = student;
                break;
            }
        }
        if (student1 != null) {
            System.out.println("Nhập tên mới: ");
            String name1 = scanner.nextLine();
            student1.setName(name1);
            System.out.println("Nhập tuổi mới: ");
            int age = scanner.nextInt();
            student1.setAge(age);
            System.out.println("Nhập giới tính:");
            String gender = scanner.nextLine();
            student1.setGender(gender);
            System.out.println("Nhập địa chỉ:");
            String address = scanner.nextLine();
            student1.setAddress(address);
            System.out.println("Nhập điểm trung bình:");
            double avgScore = scanner.nextDouble();
            student1.setAvgScore(avgScore);
            return student1;
        }
        return null;
    }

    public void displayStudent() {
        for (int i = 0; i < students.size(); i++) {
            if(students.get(i).getAvgScore() >= 8) {
                System.out.println(students.get(i).getName() + " - " + students.get(i).getAvgScore() + " - "+ "Loại Giỏi");
            } else if (students.get(i).getAvgScore() < 8 && students.get(i).getAvgScore() >= 6) {
                System.out.println(students.get(i).getName() + " - " + students.get(i).getAvgScore() + " - "+ "Loại Khá");
            } else if (students.get(i).getAvgScore() < 6 && students.get(i).getAvgScore() >= 4.5) {
                System.out.println(students.get(i).getName() + " - " + students.get(i).getAvgScore() + " - " + "Loại Trung Bình");
            } else if (students.get(i).getAvgScore() < 4.5) {
                System.out.println(students.get(i).getName() + " - " + students.get(i).getAvgScore() + " - " + "Loại Yếu");
            }
        }
    }

}
