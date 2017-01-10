package com.learning.javaoop.vapestore.entities;

/**
 * Created by Smith on 25.10.2016.
 */
public class CartItem {

    private int count;
    private Item item;

    public CartItem(Item item, int count) {
        this.item = item;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void addCount(int count) {
        this.count += count;
    }

    public void removeCount(int count) {
        this.count -= count;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "CartItem{" +
                "count=" + count +
                ", item=" + item +
                '}';
    }
}
