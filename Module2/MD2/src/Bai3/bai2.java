package Bai3;

import java.util.Scanner;

public class bai2 {
    public static void main(String[] args) {
        int[] number = {10, 4, 6, 7, 8};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số cần chèn");
        int x = scanner.nextInt();
        System.out.println("Nhập vị trí cần chèn");
        int index = scanner.nextInt();

        if (index <= -1 && index >= number.length) {
            System.out.println("Không chèn được phần tử vào mảng");
        } else {
        number[index] = x;
        }
        for (int i = index; i < number.length + 1; i++) {

        }
    }
}
