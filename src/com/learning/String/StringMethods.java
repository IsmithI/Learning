package com.learning.String;

/**
 * Created by smith on 07.12.16.
 */
public class StringMethods {
    public static void main(String[] args) {
        String a = "Bacon";
        String b = "monster";

        System.out.println(a.replace('B', 'F'));
        System.out.println(a);
        a = a.replace('B', 'F');
        System.out.println(a);
    }
}
