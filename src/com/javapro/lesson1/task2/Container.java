package com.javapro.lesson1.task2;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by smith on 16.12.16.
 */
@SaveTo(path = "/home/smith/task2.txt")
public class Container {
    String text = "some text";
    @Save
    public void save(String filename, String text) {
        File file = new File(filename);
        try {
            if(!file.exists()) {
                file.createNewFile();
            }
            PrintWriter out = new PrintWriter(file.getAbsoluteFile());
            try {
                out.write(text);
            }
            finally {
                System.out.println("File is saved to " + filename);
                out.close();
            }

        }
        catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
