package BaiTap_22_12;

import java.util.ArrayList;
import java.util.Scanner;

public class ManagerHuman {
    ArrayList<Human> humans = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayHuman() {
        System.out.println(humans);
    }

    public void addHuman() {
        System.out.println("Nhập tên");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Nhập giới tính (nam or nữ)");
        String gender = scanner.nextLine();
        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();
        Human human = new  Human(name, age, gender, address);
        humans.add(human);
    }

    //hiển thi tất cả nam
    public void displayByGender1() {
//        String gender = "nam";
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getGender().equals("nam")) {
                System.out.println(humans.get(i));
            }
        }
    }

    //hiển thị tất cả nữ
    public void displayByGender2() {
//        String gender = "nữ";
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getGender().equals("nữ")) {
                System.out.println(humans.get(i));
            }
        }
    }

    //xóa theo tên
    public void deleteByName() {
        System.out.println("Nhập tên bạn muốn xóa");
        String name = scanner.nextLine();
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getName().equals(name)) {
                humans.remove(i);
            } else {
                System.out.println("Không có người này");
            }
        }
    }

    //hiển thị người dưới 20 tuổi
    public void displayByAge() {
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getAge() < 20) {
                System.out.println(humans.get(i));
            }
        }
    }

    //tìm kiếm theo tên
    public void searchByName() {
        String name = scanner.nextLine();
        for (int i = 0; i < humans.size(); i++) {
            if (humans.get(i).getName().equals(name)){
                System.out.println(humans.get(i));
            } else {
                System.out.println("Không tìm thấy người này");
            }
        }
    }

    //sửa theo tên
    public void editHumanByName() {

    }
}
