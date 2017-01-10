package com.javapro.lesson1.task2;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import static com.sun.javafx.PlatformUtil.isUnix;
import static com.sun.javafx.PlatformUtil.isWindows;

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
                if (isUnix())
                    method.invoke(c, "/home/smith/task2.txt", "Hi! This is task 2 for javapro and you're unix user!");
                else if (isWindows())
                    method.invoke(c, "C:\\task2.txt", "Hi! This is task 2 for javapro and you're windows user!");
            }
        }
    }
}
