package Bai18.TaoThreadDonGian;

public class NumberGenerator implements Runnable{
    private Thread t;
    @Override
    public void run() {
        try {
            for (int i = 1; i < 10; i++) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            System.out.println("--------");
        }
    }

    public void start() {
        System.out.println("Starting");
        if (t == null) {
            t = new Thread(this);
            t.start();
        }
    }
}
