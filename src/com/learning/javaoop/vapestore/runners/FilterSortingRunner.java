package com.learning.javaoop.vapestore.runners;

import com.learning.javaoop.vapestore.entities.CartItem;
import com.learning.javaoop.vapestore.entities.Cigarette;
import com.learning.javaoop.vapestore.entities.Liquid;
import com.learning.javaoop.vapestore.enums.Color;
import com.learning.javaoop.vapestore.enums.Material;
import com.learning.javaoop.vapestore.enums.Taste;
import com.learning.javaoop.vapestore.filtering.CigaretePredicates;
import com.learning.javaoop.vapestore.filtering.CommonPredicates;
import com.learning.javaoop.vapestore.filtering.MultiPredicates;
import com.learning.javaoop.vapestore.sorting.LiquidComparators;

import java.util.ArrayList;
import java.util.List;

import static com.learning.javaoop.vapestore.filtering.CigaretePredicates.*;
import static com.learning.javaoop.vapestore.filtering.CommonPredicates.*;
import static com.learning.javaoop.vapestore.filtering.Filter.filter;
import static com.learning.javaoop.vapestore.filtering.MultiPredicates.*;
import static com.learning.javaoop.vapestore.sorting.CigaretteComparators.byPower;
import static com.learning.javaoop.vapestore.sorting.CommonComparators.byPrice;
import static com.learning.javaoop.vapestore.sorting.LiquidComparators.*;

/**
 * Created by smith on 05.11.16.
 */
public class FilterSortingRunner {

    public static void main(String[] args) {
        List<CartItem> products = createItems();
        printItems(products);

//        products = filter(products, onlyCigarettes());
        products = filter(products, allOf(inPriceRange(1, 100)));
        products.sort(byTastesQuantity());
        products.sort(byPrice());


        System.out.println();
        printItems(products);
    }


    private static List<CartItem> createItems() {
        List<CartItem> items = new ArrayList<>();

        items.add(new CartItem(new Cigarette(100, "Cigarette 1", Color.RED, Material.IRON, 4d), 1));
        items.add(new CartItem(new Cigarette(200, "Cigarette 2", Color.DEEP_BLUE, Material.STAINLESS_STEEL, 6), 3));
        items.add(new CartItem(new Cigarette(150, "Cigarette 3", Color.BLACK, Material.COPPER, 5.5d), 2));
        items.add(new CartItem(new Liquid(10, "Liquid 1", Taste.BANANA, Taste.BUNS), 10));
        items.add(new CartItem(new Liquid(15, "Liquid 2", Taste.COCOA), 5));
        items.add(new CartItem(new Cigarette(175, "Cigarette 4", Color.DUSTY, Material.COPPER, 3d), 1));

        return items;
    }

    private static void printItems(List<CartItem> products) {
        for (CartItem item : products) {
            System.out.println(item);
        }
    }
}
