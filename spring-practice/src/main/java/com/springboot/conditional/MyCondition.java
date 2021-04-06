package com.springboot.conditional;


import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
import org.springframework.util.StringUtils;

/**
 * Created by Cherie on 2021/04/06
 **/
public class MyCondition implements Condition {
    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
        String[] properties = (String[]) metadata.getAnnotationAttributes("com.springboot.conditional.MyConditionAnnotation").get("value");
        for (String property : properties) {
            if (!StringUtils.hasLength(context.getEnvironment().getProperty(property))) {
                return false;
            }
        }
        return true;
    }
}
