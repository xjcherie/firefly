package basic.thread;

import java.util.concurrent.CountDownLatch;

/**
 * Created by Cherie on 2020/12/09
 **/
public class SynchronizedTest {

    private static CountDownLatch count = new CountDownLatch(1);

    public static void main(String[] args) {
        String fistStr = "ABCDEFGHI";
        String secondStr = "123456789";

        char[] ca = fistStr.toCharArray();
        char[] na = secondStr.toCharArray();
        Object lock = new Object();
        Thread t1 = new Thread(() -> {
            synchronized (lock) {
                count.countDown();
                for (char caa : ca) {
                    System.out.print(caa);
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                count.await();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            synchronized (lock) {
                for (char naa : na) {
                    System.out.print(naa);
                    lock.notify();
                    try {
                        lock.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                lock.notify();
            }
        });
        t1.start();
        t2.start();
    }
}
