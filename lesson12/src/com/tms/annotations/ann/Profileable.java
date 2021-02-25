package com.tms.annotations.ann;

import java.lang.annotation.*;

@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Inherited
public @interface Profileable {

    boolean execute() default false;
    String desc();

}
