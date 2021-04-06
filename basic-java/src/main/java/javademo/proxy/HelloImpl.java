package javademo.proxy;

public class HelloImpl implements Hello {

    @Override
    public String sayHello(String str) {
        return "HelloImp: " + str;
    }

}
