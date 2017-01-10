package com.learning.javaoop.vapestore.filtering;

import com.learning.javaoop.vapestore.entities.CartItem;
import com.learning.javaoop.vapestore.entities.Cigarette;
import com.learning.javaoop.vapestore.enums.Color;
import com.learning.javaoop.vapestore.enums.Material;

import java.util.Arrays;

/**
 * Created by smith on 10.11.16.
 */
public class CigaretePredicates {

    private CigaretePredicates() {}

    private static boolean itemIsACigarette(CartItem item) {
        return item.getItem() instanceof Cigarette;
    }

    public static Predicate<CartItem> withColor(Color... colors) {
        return new Predicate<CartItem>() {
            @Override
            public boolean apply(CartItem elem) {
                return itemIsACigarette(elem) && Arrays.asList(colors).contains(((Cigarette) elem.getItem()).getColor());

            }
        };
    }

    public static Predicate<CartItem> powerIsInRange(double min, double max) {
        return new Predicate<CartItem>() {
            @Override
            public boolean apply(CartItem elem) {
                return itemIsACigarette(elem) && ((Cigarette) elem.getItem()).getPower() > min && ((Cigarette) elem.getItem()).getPower() < max;

            }
        };
    }

    public static Predicate<CartItem> withMaterial(Material... materials) {
        return new Predicate<CartItem>() {
            @Override
            public boolean apply(CartItem elem) {
                return itemIsACigarette(elem) && Arrays.asList(materials).contains(((Cigarette) elem.getItem()).getMaterial());

            }
        };
    }
}
