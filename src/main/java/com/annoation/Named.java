package com.annoation;

import java.lang.annotation.*;

@Documented
@Target({ElementType.TYPE, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface Named {
    String value();
}
