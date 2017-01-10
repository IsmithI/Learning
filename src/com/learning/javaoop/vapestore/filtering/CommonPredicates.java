package com.learning.javaoop.vapestore.filtering;

import com.learning.javaoop.vapestore.entities.CartItem;
import com.learning.javaoop.vapestore.entities.Cigarette;
import com.learning.javaoop.vapestore.entities.Item;
import com.learning.javaoop.vapestore.entities.Liquid;

/**
 * Created by smith on 05.11.16.
 */
public class CommonPredicates {

    private CommonPredicates() {}

    public static Predicate<CartItem> inPriceRange(int min, int max) {
        return new Predicate<CartItem>() {
            @Override
            public boolean apply(CartItem elem) {
                return elem.getItem().getPrice() >= min && elem.getItem().getPrice() <= max;
            }
        };
    }

    public static Predicate<CartItem> hasName(String value) {
        return new Predicate<CartItem>() {
            @Override
            public boolean apply(CartItem elem) {
                return elem.getItem().getName().toLowerCase().contains(value.toLowerCase());
            }
        };
    }

    public static Predicate<CartItem> onlyCigarettes() {
        return new Predicate<CartItem>() {
            @Override
            public boolean apply(CartItem elem) {
                return elem.getItem() instanceof Cigarette;
            }
        };
    }

    public static Predicate<CartItem> onlyLiquids() {
        return new Predicate<CartItem>() {
            @Override
            public boolean apply(CartItem elem) {
                return elem.getItem() instanceof Liquid;
            }
        };
    }

}

