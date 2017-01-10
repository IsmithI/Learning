package com.learning.javaoop.vapestore.entities;

import com.learning.javaoop.vapestore.enums.Taste;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * Created by Smith on 25.10.2016.
 */
public class Liquid extends Item {

    private List<Taste> tastes;

    public Liquid(int price, String name, Taste... tastes) {
        super(name, price);
        this.tastes = new ArrayList<>();

        Collections.addAll(this.tastes, tastes);
    }

    public List<Taste> getTastes() {
        return tastes;
    }

    @Override
    public String toString() {
        return getName() +
                ", price = " + getPrice() + "$" +
                ", testes = " + tastes;
    }
}
