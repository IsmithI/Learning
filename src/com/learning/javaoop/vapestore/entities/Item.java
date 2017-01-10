package com.learning.javaoop.vapestore.entities;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Smith on 25.10.2016.
 */
public class Item {

    private static final long id = ThreadLocalRandom.current().nextLong(Long.MAX_VALUE);

    private String name;
    private int price;

    public Item(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }
}
