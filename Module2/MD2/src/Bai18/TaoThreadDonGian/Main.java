package Bai18.TaoThreadDonGian;

public class Main {
    public static void main(String[] args) {
        NumberGenerator numberGenerator1 = new NumberGenerator();
        numberGenerator1.start();
        numberGenerator1.hashCode();

        NumberGenerator numberGenerator2 = new NumberGenerator();
        numberGenerator2.start();
        numberGenerator2.hashCode();

        System.out.println("-------------");
    }
}
