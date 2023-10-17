package org.example.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.TYPE}) // TYPE: class,interface,enum 에 붙을 수 있는 annotation
@Retention(RetentionPolicy.RUNTIME)
public @interface Controller {
}
