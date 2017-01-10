package com.javapro.lesson1.task1;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by smith on 10.12.16.
 */
public class TestRunner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        TestClass testClass = new TestClass();

        Class<?> cls = TestClass.class;

        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            if(method.isAnnotationPresent(Test.class)) {
                Test test = method.getAnnotation(Test.class);
                boolean res = (Boolean) method.invoke(testClass, test.a(), test.b());
                System.out.println(res);
            }
        }
    }

    static class TestClass {
        @Test(a = 5, b = 10)
        public static boolean test(int a, int b) {
            return a > b;
        }

    }
}

@Target(value = ElementType.METHOD)
@Retention(value = RetentionPolicy.RUNTIME)
@interface Test {
    int a();
    int b();
}
