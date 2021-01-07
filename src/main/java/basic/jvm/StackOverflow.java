package basic.jvm;

/**
 * create by cherie on 03/03/2019.
 * 测试栈溢出
 * 1. 每次运行栈的深度都是不一样
 */
public class StackOverflow {

    private static int index = 1;

    private void call() {
        index++;
        call();
    }

    public static void main(String[] args) {
        StackOverflow stack = new StackOverflow();
        try {
            stack.call();
        } catch (Throwable e) {
            System.out.println("Stack deep : " + index);
            e.printStackTrace();
        }
    }
}
