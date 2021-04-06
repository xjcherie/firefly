package com.springboot.conditional;

import org.springframework.context.annotation.Conditional;

import java.lang.annotation.*;

/**
 * Created by Cherie on 2021/04/06
 **/
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Conditional(MyCondition.class)
public @interface MyConditionAnnotation {

    String[] value() default {};
}
