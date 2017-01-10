package com.javapro.lesson1.task3;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

import static com.sun.javafx.PlatformUtil.isUnix;
import static com.sun.javafx.PlatformUtil.isWindows;

/**
 * Created by smith on 16.12.16.
 */
public class SeDerializerRunner {

    public static String filename;

    public static void main(String[] args) throws IOException, IllegalAccessException, ClassNotFoundException {
        if (isWindows()) {
            filename = "C:\\tmp.out";
        }
        else if (isUnix()) {
            filename = "/home/"
        }

        TestClass tc = new TestClass();

        Class<?> cls = TestClass.class;

        Field[] fields = cls.getDeclaredFields();
        List<Field> tmp = new ArrayList<>();
        for (Field field : fields) {
            if (field.isAnnotationPresent(Save.class)) {
                field.setAccessible(true);
                tmp.add(field);
            }
        }
        serialize(tmp, tc);

        deserialize("/home/smith/tmp.out");
    }

    public static void serialize(List<Field> fields, TestClass tc) throws IOException, IllegalAccessException {
        FileOutputStream fOut = new FileOutputStream("/home/smith/tmp.out");
        ObjectOutputStream oOut = new ObjectOutputStream(fOut);
        for (Field field : fields) {
            oOut.writeObject(field.get(tc));
        }
        oOut.flush();
        oOut.close();
    }

    public static void deserialize(String filename) throws IOException, ClassNotFoundException {
        FileInputStream fIn = new FileInputStream(filename);
        ObjectInputStream oIn = new ObjectInputStream(fIn);
        boolean read = true;
        while(read) {
            try {
                System.out.println(oIn.readObject());
            }
            catch (Exception e) {
                read = false;
            }
        }
    }
}
