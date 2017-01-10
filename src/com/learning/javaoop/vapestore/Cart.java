package com.learning.javaoop.vapestore;

import com.learning.javaoop.vapestore.entities.CartItem;
import com.learning.javaoop.vapestore.entities.Item;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by Smith on 23.10.2016.
 */
public class Cart {

    private static Cart cart = new Cart();

    private List<CartItem> items;

    private Cart(){
        items = new ArrayList<>();
    }

    public static Cart getCart() {
        return cart;
    }

    void addItem(Item item) {

        for (CartItem cartItem : items) {
            if (cartItem.getItem().equals(item)) {
                cartItem.addCount(1);
            }
        }
        items.add(new CartItem(item, 1));
    }

    void removeItem(Item item) {
        if (items.isEmpty()) return;

        Iterator<CartItem> iter = items.iterator();

        while (iter.hasNext()) {
            CartItem itemTmp = iter.next();
            if (itemTmp.getItem().equals(item)) {

                if (itemTmp.getCount() > 1) {
                    itemTmp.addCount(-1);
                    return;
                }
                else {
                    iter.remove();
                    return;
                }

            }
        }
    }

    public void buy() {
        System.out.println("Purchase successful!");
    }

    public void printCart() {
        System.out.println("Products added to cart: ");
        for (CartItem item : items) {
            System.out.println(item);
        }
    }

    @Override
    public String toString() {
        return "Cart{" +
                "entities=" + items +
                '}';
    }

    public List<CartItem> getItems() {
        return items;
    }
}
