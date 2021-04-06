package javademo.proxy.dynamicProxy;

import javademo.proxy.Hello;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * JDK原生动态代理
 * 实现接口InvocationHandler，
 * 方法调用会被转发到该类的invoke()方法
 */
public class HelloDynamicProxy implements InvocationHandler {
    private Hello hello;

    public HelloDynamicProxy(Hello hello) {
        this.hello = hello;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if ("sayHello".equals(method.getName())) {
            System.out.println("You said: " + Arrays.toString(args));
        }
        return method.invoke(hello, args);
    }
}