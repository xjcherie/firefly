package basic.proxy;

import basic.proxy.cglibProxy.HelloCglib;
import basic.proxy.cglibProxy.HelloCglibProxy;
import basic.proxy.dynamicProxy.HelloDynamicProxy;
import basic.proxy.staticProxy.HelloStaticProxy;
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
