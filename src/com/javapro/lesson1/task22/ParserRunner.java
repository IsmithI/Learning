package com.javapro.lesson1.task22;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 * Created by smith on 10.01.17.
 */
public class ParserRunner {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("/media/smith/FC8C6E888C6E3D70/Java-projects/Learning/src/com/javapro/lesson1/task22/file.txt"));

        String result = "";

        while (sc.hasNext()) {
            result = result.concat(sc.nextLine());
        }

        Gson gson = new GsonBuilder().create();
        Myclass myclass = (Myclass) gson.fromJson(result, Myclass.class);

        System.out.println(myclass);
    }
}
