package Bai17.baitap;

import java.util.ArrayList;
import java.util.Scanner;

public class SPManager {
    ArrayList<SP> sps = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void displayAll() {
        for (SP sp:sps) {
            System.out.println(sp);
        }
    }

    public void addSP() {
        System.out.println("Nhập tên sản phẩm: ");
        String name = scanner.nextLine();
        System.out.println("Nhập hãng sản xuất: ");
        String hang = scanner.nextLine();
        System.out.println("Nhập giá sản phẩm: ");
        double price = scanner.nextDouble();
        System.out.println("Nhập mô tả sản phẩm: ");
        scanner.nextLine();
        String comment = scanner.nextLine();
        SP sp = new SP(name, hang, price, comment);
        sps.add(sp);
    }

    public void searchById(int id) {
        for (int i = 0; i < sps.size(); i++) {
            if (sps.get(i).getId() == id) {
                System.out.println(sps.get(i));
            }
        }
    }

}
