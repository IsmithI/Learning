package com.learning.String;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;

public class StringLearn {

    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException{

        StringBuffer sb = new StringBuffer(reader.readLine());

        String a = sb.toString();
        String b = sb.reverse().toString();

        System.out.println(((Objects.equals(a, b)) ? "P" : "Not a p") + "olindrome");

        StringBuffer output = new StringBuffer(110);
        int count = 100;
        output.append("Some text");
        for(int i = 0; i < count; i++) {
            output.append(i);
        }
        System.out.println(output);
    }
}
