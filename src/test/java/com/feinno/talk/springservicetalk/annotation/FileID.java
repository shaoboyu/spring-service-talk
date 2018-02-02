package com.feinno.talk.springservicetalk.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * Created by yushaobo on 18-2-2.
 */
//变量级别注解
@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface FileID {
    int id();
}
