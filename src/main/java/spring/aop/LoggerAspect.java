package spring.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

/**
 * Created by Cherie on 2020/11/03
 **/
@Aspect
@Component
public class LoggerAspect {

    private static final String POINT = "execution(* spring.aop.PersonService)";

    @Around(POINT)
    public void doAround(JoinPoint jp) {
        long startTime = System.currentTimeMillis();
        System.out.println("=========执行中通知==========");
        String name = jp.getSignature().toShortString();
        System.out.println(name + " " + (System.currentTimeMillis() - startTime));
    }

}
