class MyThread1 extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Thead 1");
        }
    }
}

class MyThread2 implements Runnable {
    public void run() {
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println(e);
            }
            System.out.println("Thead 2");
        }
    }
}

public class ThreadDemo {
    public static void main(String[] args) {
        try {
            Thread t1 = new Thread(new MyThread1());
            Thread t2 = new Thread(new MyThread2());
            t1.start();
            t2.start();
            for (int i = 0; i < 5; i++) {
                System.out.println("Main Thread");
            }
            t2.join();
            t1.join();
        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
