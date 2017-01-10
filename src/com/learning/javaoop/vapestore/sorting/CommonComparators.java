package com.learning.javaoop.vapestore.sorting;

import com.learning.javaoop.vapestore.entities.CartItem;
import com.learning.javaoop.vapestore.entities.Item;

import java.util.Comparator;

/**
 * Created by smith on 05.11.16.
 */
public class CommonComparators {

    private CommonComparators() {}

    public static <T> Comparator<T> multiComparator(Comparator<T>... comparators) {
        return new Comparator<T>() {
            @Override
            public int compare(T t, T t1) {
                for (Comparator<T> comparator : comparators) {
                    int cmp = comparator.compare(t, t1);
                    if (cmp != 0) {
                        return cmp;
                    }
                }
                return 0;
            }
        };
    }

    public static Comparator<CartItem> byPrice() {
        return new Comparator<CartItem>() {
            @Override
            public int compare(CartItem item1, CartItem item2) {
                return Integer.compare(item1.getItem().getPrice(), item2.getItem().getPrice());
            }
        };
    }

    public static Comparator<CartItem> byName() {
        return new Comparator<CartItem>() {
            @Override
            public int compare(CartItem item1, CartItem item2) {
                return item1.getItem().getName().compareTo(item2.getItem().getName());
            }
        };
    }

    public static Comparator<CartItem> byProductsQuantity() {
        return new Comparator<CartItem>() {
            @Override
            public int compare(CartItem item, CartItem t1) {
                if (item.getCount() > t1.getCount()) return 1;
                else if (item.getCount() < t1.getCount()) return -1;
                else return 0;
            }
        };
    }


}
