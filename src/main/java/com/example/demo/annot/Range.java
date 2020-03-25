package com.example.demo.annot;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Range {
    int max() default Integer.MIN_VALUE ;
    int min() default Integer.MAX_VALUE ;
    String message() default "数值范围错误";
}
