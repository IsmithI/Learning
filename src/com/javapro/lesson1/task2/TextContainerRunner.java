package com.javapro.lesson1.task2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Created by smith on 16.12.16.
 */
public class TextContainerRunner {
    public static void main(String[] args) throws InvocationTargetException, IllegalAccessException {
        Container c = new Container();

        Class<?> cls = Container.class;
        Method[] methods = cls.getDeclaredMethods();

        for (Method method : methods) {
            if(method.isAnnotationPresent(Save.class)) {
                Save tmp = method.getAnnotation(Save.class);
                method.invoke(c, "/home/smith/task2.txt", "some text");
            }
        }
    }
}
