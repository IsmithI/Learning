package com.javapro.lesson1.reflection;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

/**
 * Created by smith on 11.12.16.
 */
public class ReflectionTest {
    public static void main(String[] args) {
        Class<?> cls = Reflection.class;
        int modifier = cls.getModifiers();

        if (Modifier.isPrivate(modifier))
            System.out.println("Private");

        try {
            Reflection obj = new Reflection();
            Field field = cls.getDeclaredField("a");
            field.setAccessible(true);
            System.out.println(field.getInt(obj));
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static final class Reflection {
        private int a = 5;
    }
}
