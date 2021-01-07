package basic.thread;

import java.util.concurrent.LinkedTransferQueue;

/**
 * Created by Cherie on 2020/12/09
 **/
public class LinkedTransferQueueTest {
    private static LinkedTransferQueue<Character> linkedC = new LinkedTransferQueue<>();
    private static LinkedTransferQueue<Character> linkedN = new LinkedTransferQueue<>();

    public static void main(String[] args) {
        String firstStr = "ABCDEFGHI";
        String secondStr = "123456789";

        char[] firstChars = firstStr.toCharArray();
        char[] secondChars = secondStr.toCharArray();
        Thread t1 = new Thread(() -> {
            for (char caa : firstChars) {
                try {
                    linkedC.put(caa);
                    char a = linkedN.take();
                    System.out.print(a);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread t2 = new Thread(() -> {
            for (char naa : secondChars) {
                try {
                    char b = linkedC.take();
                    System.out.print(b);
                    linkedN.put(naa);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        t1.start();
        t2.start();

    }
}
