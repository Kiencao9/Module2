package MinitestT4;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentManager {
    public static final String PATH_NAME = "src/MinitestT4/student.csv";
    ArrayList<Student> students = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayAll() {
        for (Student student : students) {
            System.out.println(student);
        }
    }

    public void addStudent() {
        System.out.println("Nhập tên:");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi:");
        int age = scanner.nextInt();
        System.out.println("Nhập điểm Toán:");
        double mathPoint = scanner.nextDouble();
        System.out.println("Nhâp điểm Lý:");
        double physicPoint = scanner.nextDouble();
        System.out.println("Nhập điểm Hóa:");
        double chemistryPoint = scanner.nextDouble();
        scanner.nextLine();
        Student student = new Student(name , age, mathPoint, physicPoint, chemistryPoint);
        students.add(student);
    }

    public void deleteStudent(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                students.remove(i);
            }
        }
    }

    public void editStudent(int id) {
        Student student1 = null;
        for (Student student: students) {
            if (student.getId() == id) {
                student1 = student;
                break;
            }
        }
        if (student1 != null) {
            System.out.println("Nhập tên mới:");
            String name = scanner.nextLine();
            student1.setName(name);
            System.out.println("Nhập tuổi mới");
            int age = scanner.nextInt();
            student1.setAge(age);
            System.out.println("Nhập điểm Toán mới:");
            double mathPoint = scanner.nextDouble();
            student1.setMathPoint(mathPoint);
            System.out.println("Nhập điểm Lý mới:");
            double physicPoint = scanner.nextDouble();
            student1.setPhysicPoint(physicPoint);
            System.out.println("Nhập điểm Hóa mới;");
            double chemistryPoint = scanner.nextDouble();
            student1.setChemistryPoint(chemistryPoint);
        }

    }

    public void searchById(int id) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getId() == id) {
                System.out.println(i);
            }
        }
    }

    public void sortByAVGPoint5() {
        students.sort((o1, o2) -> {
            if (o1.getAvgPoint() < o2.getAvgPoint()) {
                return 1;
            } else if (o1.getAvgPoint() > o2.getAvgPoint()) {
                return -1;
            }
            return 0;
        });
        displayAll();
        System.out.println("Sắp xếp thành công");
    }


    public void sortByAVGPoint6() {
        students.sort((o1, o2) -> {
            if (o1.getAvgPoint() < o2.getAvgPoint()) {
                return -1;
            } else if (o1.getAvgPoint() > o2.getAvgPoint()) {
                return 1;
            }
            return 0;
        });
        displayAll();
        System.out.println("Sắp xếp thành công");
    }

    public void displayMaxPoint() {
        double maxPoint = 0;
        for (Student student : students) {
            if (student.getAvgPoint() > maxPoint) {
                maxPoint = student.getAvgPoint();
            }
        }
        System.out.println("Sinh viên có điểm trung bình cao nhất là");
        for (Student student : students) {
            if (student.getAvgPoint() == maxPoint) {
                System.out.println(student);
            }
        }
    }

    public void writeToFile(ArrayList<Student> students,String path) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path));
            for (Student student : students) {
                bufferedWriter.write(student.toString());
            }
            bufferedWriter.flush();
            bufferedWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public ArrayList<Student> readFile(String path) {
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
            String line ="";
            while ((line = bufferedReader.readLine()) != null) {
                String[] strings = line.split(",");
                students.add(new Student(strings[0], Integer.parseInt(strings[1]), Double.parseDouble(strings[2]), Double.parseDouble(strings[3]), Double.parseDouble(strings[4])));
            }
        }catch (IOException e) {
            System.err.println(e.getMessage());
        }
        return students;
    }
}
