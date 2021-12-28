package Bai1;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        String number1 = "1";
        int number2 = 12;
        System.out.println(number1 + number2);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần đọc");
        int so = scanner.nextInt();

        if (so >= 10) {
            while (so >= 10) {
                show(so % 10);
                so = so / 10;
            }
            show(1);
        } else {
            show(so);
        }
    }
    public static void show(int so) {
        switch (so) {
            case 0:
                System.out.println("không ");
                break;
            case 1:
                System.out.println("một ");
                break;
            case 2:
                System.out.println("hai ");
                break;
            case 3:
                System.out.println("ba ");
                break;
            case 4:
                System.out.println("bốn ");
                break;
            case 5:
                System.out.println("năm ");
                break;
            case 6:
                System.out.println("sáu ");
                break;
            case 7:
                System.out.println("bảy ");
                break;
            case 8:
                System.out.println("tám ");
                break;
            case 9:
                System.out.println("chín ");
                break;
        }
    }
}
