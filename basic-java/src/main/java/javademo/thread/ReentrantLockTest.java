package javademo.thread;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * Created by Cherie on 2020/12/09
 **/
public class ReentrantLockTest {
    private static Lock lock = new ReentrantLock();
    private static Condition c1 = lock.newCondition();
    private static Condition c2 = lock.newCondition();
    private static CountDownLatch count = new CountDownLatch(1);

    public static void main(String[] args) {
        String firstStr = "ABCDEFGHI";
        String secondStr = "123456789";

        char[] firstChars = firstStr.toCharArray();
        char[] secondChars = secondStr.toCharArray();
        Thread t1 = new Thread(() -> {
            try {
                lock.lock();
                count.countDown();
                for (char caa : firstChars) {
                    c1.signal();
                    System.out.print(caa);
                    c2.await();
                }
                c1.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
        Thread t2 = new Thread(() -> {
            try {
                count.await();
                lock.lock();
                for (char naa : secondChars) {
                    c2.signal();
                    System.out.print(naa);
                    c1.await();
                }
                c2.signal();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } finally {
                lock.unlock();
            }
        });
        t1.start();
        t2.start();

    }
}
