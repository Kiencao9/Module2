package MinitestT2.manager;

import MinitestT2.model.Student;

import java.util.List;
import java.util.Scanner;

public class Manager implements IManager<Student>{

//    List<Student> students = new ArrayList<>();

    Scanner scanner = new Scanner(System.in);
    @Override
    public void add(List<Student> students) {

        System.out.println("Nhập name");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        System.out.println("Nhập name");
        double avgScore = scanner.nextDouble();
        Student student = new Student(name, age, avgScore);
        students.add(student);
    }

    @Override
    public void display(List<Student> students) {
        for (Student student: students) {
            System.out.println(student);
        }
    }

    @Override
    public void delete(List<Student> students, int index) {
        for (int i = 0; i < students.size(); i++) {
            if (i == index) {
                students.remove(i);
                break;
            }
        }
    }

    @Override
    public void edit(List<Student> students, int index) {
        for (int i = 0; i < students.size(); i++) {
            if (i == index) {
                System.out.println("Nhập name");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi");
                int age = scanner.nextInt();
                System.out.println("Nhập name");
                double avgScore = scanner.nextDouble();
                students.get(i).getName(name);
                students.get(i).getAge(age);
                students.get(i).getAvgScore(avgScore);
            }
        }
    }
}
