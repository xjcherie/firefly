package spring.aop;

import org.junit.Test;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Created by Cherie on 2020/11/03
 **/
@EnableAspectJAutoProxy
public class PersonService {

    public void sayHello() {
        System.out.println("Hello world!");
    }

    @Test
    public void test() {
        this.sayHello();
    }

}
