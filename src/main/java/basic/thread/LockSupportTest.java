package basic.thread;

import java.util.concurrent.locks.LockSupport;

/**
 * Created by Cherie on 2020/12/09
 **/
public class LockSupportTest {

    private static Thread t1;
    private static Thread t2;

    public static void main(String[] args) {
        String str1 = "ABCDEFGHI";
        String str2 = "123456789";

        char[] chars1 = str1.toCharArray();
        char[] chars2 = str2.toCharArray();
        t1 = new Thread(() -> {
            for (char caa : chars1) {
                System.out.print(caa);
                LockSupport.unpark(t2);
                LockSupport.park();

            }
        });
        t2 = new Thread(() -> {
            for (char naa : chars2) {
                LockSupport.park();
                System.out.print(naa);
                LockSupport.unpark(t1);
            }
        });
        t1.start();
        t2.start();
    }
}
