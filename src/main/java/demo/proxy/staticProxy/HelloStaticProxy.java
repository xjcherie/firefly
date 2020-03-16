package demo.proxy.staticProxy;

import demo.proxy.Hello;
import demo.proxy.HelloImpl;

public class HelloStaticProxy implements Hello {

    private Hello hello = new HelloImpl();

    @Override
    public String sayHello(String str) {
        return hello.sayHello(str);
    }
}
