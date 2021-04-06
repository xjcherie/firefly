package javademo.bytebuddy;

import net.bytebuddy.ByteBuddy;
import net.bytebuddy.asm.Advice;
import net.bytebuddy.matcher.ElementMatchers;

public class HelloByteBuddy {

    @Log
    public String sayHello(String value) {
        System.out.println("Hello: " + value);
        return value;
    }

    public String sayHi(String value) {
        System.out.println("Hi: " + value);
        return value;
    }

    public static void main(String[] args) throws Exception {
        HelloByteBuddy hello = new ByteBuddy()
                .subclass(HelloByteBuddy.class)
                .method(ElementMatchers.any())
                .intercept(Advice.to(LoggerAdvisor.class))
                .make()
                .load(HelloByteBuddy.class.getClassLoader())
                .getLoaded()
                .newInstance();
        hello.sayHello("A");
        hello.sayHi("B");
    }
}
