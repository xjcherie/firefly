package basic.proxy.staticProxy;

import basic.proxy.Hello;
import basic.proxy.HelloImpl;

public class HelloStaticProxy implements Hello {

    private Hello hello = new HelloImpl();

    @Override
    public String sayHello(String str) {
        return hello.sayHello(str);
    }
}
