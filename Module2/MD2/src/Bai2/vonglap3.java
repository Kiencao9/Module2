package Bai2;

public class vonglap3 {
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            boolean check = true;
            int k = 2;
            while (k <= Math.sqrt(i)){
                if (i % k == 0) {
                    check = false;
                    break;
                }
                k++;
            }
            if (check) {
                System.out.println(i);
            }
        }
    }
}
