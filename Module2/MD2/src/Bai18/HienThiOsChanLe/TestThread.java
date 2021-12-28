package Bai18.HienThiOsChanLe;

public class TestThread {
    public static void main(String[] args) {
        OddThread oddThread = new OddThread();
        EvenThread evenThread = new EvenThread();
        oddThread.start();
        try {
            oddThread.join(100);
        } catch (Exception e) {
            System.out.println(e);
        }

        evenThread.start();
    }
}
