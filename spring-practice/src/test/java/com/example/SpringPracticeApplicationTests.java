package com.example;

import com.springboot.SpringPracticeApplication;
import com.springboot.conditional.A;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.BeansException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by Cherie on 2021/04/06
 **/
@RunWith(SpringRunner.class)
@SpringBootTest(classes = {SpringPracticeApplication.class})
public class SpringPracticeApplicationTests implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext context) throws BeansException {
        applicationContext = context;
    }

    @Test
    public void testA() {
        System.out.println(applicationContext.getBean(A.class));
    }
}
