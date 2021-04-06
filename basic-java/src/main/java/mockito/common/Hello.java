package mockito.common;

public class Hello {

    public String sayHello() {
        return "Hello";
    }

    public String sayHi() {
        throw new RuntimeException();
    }

}
