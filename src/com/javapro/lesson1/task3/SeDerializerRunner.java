package com.javapro.lesson1.task3;

import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static com.sun.javafx.PlatformUtil.isUnix;
import static com.sun.javafx.PlatformUtil.isWindows;

/**
 * Created by smith on 16.12.16.
 */
public class SeDerializerRunner {

    public static String filename;

    public static void main(String[] args) throws IOException, IllegalAccessException, ClassNotFoundException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter username: ");
        String uname = sc.nextLine();

        if (isWindows())
            filename = "C:\\tmp.out";
        else if (isUnix())
            filename = "/home/"+uname+"/tmp.out";

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

        try {
            serialize(tmp, tc);
            deserialize(filename);
        }
        finally {
            sc.close();
        }
    }

    public static void serialize(List<Field> fields, TestClass tc) throws IOException, IllegalAccessException {
        FileOutputStream fOut = new FileOutputStream(filename);
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
