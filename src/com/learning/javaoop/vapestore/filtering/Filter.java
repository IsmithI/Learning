package com.learning.javaoop.vapestore.filtering;

import com.learning.javaoop.vapestore.entities.CartItem;
import com.learning.javaoop.vapestore.entities.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by smith on 05.11.16.
 */
public class Filter {

    private Filter() {}

    public static <T> List<T> filter(List<T> elems, Predicate<T> predicate) {
        List<T> res = new ArrayList<T>();

        for (T elem : elems) {
            if (predicate.apply(elem)) {
                res.add(elem);
            }
        }

        return res;
    }

}
