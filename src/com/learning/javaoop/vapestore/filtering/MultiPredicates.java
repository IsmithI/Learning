package com.learning.javaoop.vapestore.filtering;

/**
 * Created by smith on 10.11.16.
 */
public class MultiPredicates {

    private MultiPredicates() {}

    public static <T> Predicate<T> allOf(Predicate<T>... predicates) {
        return new Predicate<T>() {
            @Override
            public boolean apply(T elem) {
                for (Predicate<T> predicate : predicates) {
                    if (!predicate.apply(elem)) {
                        return false;
                    }
                }
                return true;
            }
        };
    }
}
