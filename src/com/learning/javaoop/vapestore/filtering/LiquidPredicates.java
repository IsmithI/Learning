package com.learning.javaoop.vapestore.filtering;

import com.learning.javaoop.vapestore.entities.CartItem;
import com.learning.javaoop.vapestore.entities.Liquid;
import com.learning.javaoop.vapestore.enums.Taste;

import java.util.Arrays;

/**
 * Created by smith on 10.11.16.
 */
public class LiquidPredicates {

    private LiquidPredicates() {}

    public static Predicate<CartItem> hasTastes(Taste... tastes) {
        return new Predicate<CartItem>() {
            @Override
            public boolean apply(CartItem elem) {
                if (elem.getItem() instanceof Liquid)
                    return ((Liquid) elem.getItem()).getTastes().containsAll(Arrays.asList(tastes));

                return false;
            }
        };
    }
}
