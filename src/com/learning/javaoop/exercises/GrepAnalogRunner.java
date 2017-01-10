package com.learning.javaoop.exercises;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class GrepAnalogRunner {

    private static Scanner scanner;

    public static void main(String[] args) throws IOException {
        File text = readFile("/media/smith/FC8C6E888C6E3D70/Java-projects/Learning/src/com/learning/javaoop/exercises/text.txt");
        scanner = new Scanner(text);

        grep("THIS", "bla");
    }

    private static void grep(String... w) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.toLowerCase();
            for (String s: w) {
                if (line.contains(s.toLowerCase())) {
                    System.out.println(line);
                }
            }
        }
    }

    private static void grep(String w) {
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            line = line.toLowerCase();
            if (line.contains(w.toLowerCase()))
                System.out.println(line);
        }
    }

    public static File readFile(String path) throws IOException {
        return new File(path);
    }
}
