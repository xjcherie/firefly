package javademo.proxy.staticProxy;

import javademo.proxy.Hello;
import javademo.proxy.HelloImpl;

public class HelloStaticProxy implements Hello {

    private Hello hello = new HelloImpl();

    @Override
    public String sayHello(String str) {
        return hello.sayHello(str);
    }
}
