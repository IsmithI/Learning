package com.learning.javaoop.comparision;

import java.util.*;

/**
 * Created by Smith on 22.10.2016.
 */
public class ComparingRunner {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Bob");
        names.add("Mark");
        names.add("Phill");
        names.add("Diana");
        names.add("Fiona");
        names.add("Klark");

        System.out.println(names);

        sortByName(names);
        System.out.println(names);

        sortByNameReverse(names);
        System.out.println(names);

        System.out.println(findMinNameByAlphabet(names));

        sortByLetterNumber(names);
        System.out.println(names);

        sortByLetterAndName(names);
        System.out.println(names);
    }

    private static void sortByLetterNumber(List<String> list) {
        Collections.sort(list, compareByLetterNumber);
    }

    private static String  findMinNameByAlphabet(List<String> list) {
        return Collections.min(list);
    }

    public static void sortByName(List<String> list) {
        Collections.sort(list);
    }

    public static void sortByNameReverse(List<String> list) {
        Collections.sort(list, Comparator.reverseOrder());
    }

    public static void sortByLetterAndName(List<String> list) {
        Collections.sort(list, compareByLetterNumberAndNameReverse);
    }


    public static Comparator<String> compareByLetterNumber = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            return o1.length() - o2.length();
        }
    };

    public static Comparator<String> compareByLetterNumberAndNameReverse = new Comparator<String>() {
        @Override
        public int compare(String o1, String o2) {
            int res = o1.length() - o2.length();

            if (res == 0) res = o2.compareTo(o1);
            return res;
        }
    };

}
