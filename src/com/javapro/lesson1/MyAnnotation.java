package com.javapro.lesson1;

import java.lang.annotation.*;

/**
 * Created by smith on 10.12.16.
 */
@Inherited
@Target(value = ElementType.TYPE) //тип метод поле
@Retention(value = RetentionPolicy.RUNTIME)
public @interface MyAnnotation {
    String param1() default "string";
    String param2();
}
