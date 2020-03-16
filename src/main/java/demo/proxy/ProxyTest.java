package demo.proxy;

import demo.proxy.cglibProxy.HelloCglib;
import demo.proxy.cglibProxy.HelloCglibProxy;
import demo.proxy.dynamicProxy.HelloDynamicProxy;
import demo.proxy.staticProxy.HelloStaticProxy;
import net.sf.cglib.proxy.Enhancer;
import org.junit.Test;

import java.lang.reflect.Proxy;

public class ProxyTest {

    @Test
    public void testStaticProxy() {
        Hello hello = new HelloStaticProxy();
        System.out.println(hello.sayHello("Hello, world!’"));
    }

    @Test
    public void testDynamicProxy() {
        Hello hello = (Hello) Proxy.newProxyInstance(
                getClass().getClassLoader(),
                new Class<?>[]{Hello.class},
                new HelloDynamicProxy(new HelloImpl()));
        System.out.println(hello.sayHello("Hello, world!’"));
    }

    @Test
    public void testCglibProxy() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(HelloCglib.class);
        enhancer.setCallback(new HelloCglibProxy());

        HelloCglib hello = (HelloCglib) enhancer.create();
        System.out.println(hello.sayHello("Hello, world!"));
    }
}
