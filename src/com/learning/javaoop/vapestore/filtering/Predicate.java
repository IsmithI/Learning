package com.learning.javaoop.vapestore.filtering;

/**
 * Created by smith on 05.11.16.
 */
public interface Predicate<T> {
    boolean apply(T elem);
}
