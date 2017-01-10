package com.learning.javaoop.vapestore.sorting;

import com.learning.javaoop.vapestore.entities.CartItem;
import com.learning.javaoop.vapestore.entities.Liquid;

import java.util.Comparator;

/**
 * Created by smith on 10.11.16.
 */
public class LiquidComparators {

    private LiquidComparators() {}

    private static boolean itemIsALiquid(CartItem item) {
        return item.getItem() instanceof Liquid;
    }

    public static Comparator<CartItem> byTastesQuantity() {
        return new Comparator<CartItem>() {
            @Override
            public int compare(CartItem liquid, CartItem t1) {
                if (itemIsALiquid(liquid) && itemIsALiquid(t1)) {

                    if (((Liquid) liquid.getItem()).getTastes().size() > (((Liquid) t1.getItem()).getTastes().size()))
                        return 1;
                    else if (((Liquid) liquid.getItem()).getTastes().size() < (((Liquid) t1.getItem()).getTastes().size()))
                        return -1;
                    else return 0;

                }
                else return -1;
            }
        };
    }
}
