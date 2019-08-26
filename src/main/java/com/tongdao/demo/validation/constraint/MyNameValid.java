package com.tongdao.demo.validation.constraint;

import com.tongdao.demo.validation.validator.MyNameValidator;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Author: will.Wang
 * @Version: V-1.0
 * @Date: 19-8-19 上午11:21
 * @Description:
 */
@Target({ElementType.METHOD, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = MyNameValidator.class)
public @interface MyNameValid {

    // 验证不通过的消息 default 为默认值
    String message() default "{default message}";
    // 最小长度, 默认0
    long minLength() default 2;
    // 正则表达式, 默认空
    String regexp() default "";
    // 是否必填,默认false
    boolean required() default true;

    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};

}
