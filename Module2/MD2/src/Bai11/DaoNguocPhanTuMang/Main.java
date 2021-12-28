package Bai11.DaoNguocPhanTuMang;

import java.util.Arrays;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        int[] intArray = new int[5];
        int num = 5;
        for (int i = 0; i < intArray.length && num > 0; i++) {
            intArray[i] = num;
        }
        System.out.println(Arrays.toString(intArray));

        for (int i = 0; i < intArray.length; i++) {
            stack.push(intArray[i]);
        }
        System.out.println(stack.toString());

        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = stack.pop();
        }
        System.out.println(Arrays.toString(intArray));

        // Dao nguoc chuoi trong mang
        Stack<String> wStack = new Stack<>();
        String wWord = "The quick brown fox jumps over the lazy dog";
        String[] wWordArr = wWord.split(" ");
        for (int i = 0; i < wWord.length(); i++) {
            wStack.push(wWordArr[i]);
        }
        System.out.println();
        System.out.println(wStack);

        for (int i = 0; i < wWord.length(); i++) {
            wWordArr[i] = wStack.pop();
        }
        System.out.println(Arrays.toString(wWordArr));
    }

}
