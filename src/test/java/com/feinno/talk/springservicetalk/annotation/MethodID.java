package com.feinno.talk.springservicetalk.annotation;

import java.lang.annotation.*;

/**
 * Created by yushaobo on 18-2-2.
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface MethodID {
    String methodName() default "hello";
}
