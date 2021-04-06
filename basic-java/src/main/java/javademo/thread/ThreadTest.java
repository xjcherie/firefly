package javademo.thread;

/**
 * Created by Cherie on 2020/12/09
 **/
public class ThreadTest {

    public static void main(String[] args) {
//        System.out.println(Runtime.getRuntime().availableProcessors());

        Thread thread = new Thread(() -> System.out.println("a thread"));
        System.out.println("begin");
        thread.start();
        System.out.println("end");
    }

}
