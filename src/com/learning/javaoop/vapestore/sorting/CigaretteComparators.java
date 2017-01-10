package com.learning.javaoop.vapestore.sorting;

import com.learning.javaoop.vapestore.entities.CartItem;
import com.learning.javaoop.vapestore.entities.Cigarette;
import com.learning.javaoop.vapestore.entities.Item;

import java.util.Comparator;

/**
 * Created by smith on 05.11.16.
 */
public class CigaretteComparators {

    private CigaretteComparators() {}

    private static boolean itemIsACigarette(Item item) {
        return item instanceof Cigarette;
    }

    public static Comparator<CartItem> byColor() {
        return new Comparator<CartItem>() {
            @Override
            public int compare(CartItem cigarette, CartItem t1) {
                if (itemIsACigarette(cigarette.getItem()) && itemIsACigarette(t1.getItem()))
                return ((Cigarette) cigarette.getItem()).getColor().compareTo(((Cigarette) t1.getItem()).getColor());
                else return 0;
            }
        };
    }

    public static Comparator<CartItem> byMaterial() {
        return new Comparator<CartItem>() {
            @Override
            public int compare(CartItem cigarette, CartItem t1) {
                if (itemIsACigarette(cigarette.getItem()) && itemIsACigarette(t1.getItem()))
                return ((Cigarette) cigarette.getItem()).getMaterial().compareTo(((Cigarette) t1.getItem()).getMaterial());
                else return 0;
            }
        };
    }

    public static Comparator<CartItem> byPower() {
        return new Comparator<CartItem>() {
            @Override
            public int compare(CartItem cigarette, CartItem t1) {
                if (itemIsACigarette(cigarette.getItem()) && itemIsACigarette(t1.getItem()))
                return Double.compare(((Cigarette) cigarette.getItem()).getPower(), ((Cigarette) (t1.getItem())).getPower());
                else return 0;
            }
        };
    }

}
