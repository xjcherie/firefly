package com.springboot.conditional;

import org.springframework.stereotype.Component;

/**
 * Created by Cherie on 2021/04/06
 **/
@Component
@MyConditionAnnotation({"com.example.condition1", "com.example.condition2"})
public class A {
}
