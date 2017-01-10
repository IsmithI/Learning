package com.learning.javaoop.vapestore.entities;

import com.learning.javaoop.vapestore.enums.Color;
import com.learning.javaoop.vapestore.enums.Material;

import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by Smith on 25.10.2016.
 */
public class Cigarette extends Item {

    private Color color;
    private Material material;
    private double power;

    public Cigarette(int price, String name, Color color, Material material, double power) {
        super(name, price);
        this.color = color;
        this.material = material;
        this.power = power;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

    public double getPower() {
        return power;
    }

    public void setPower(double power) {
        this.power = power;
    }

    @Override
    public String toString() {
        return getName() +
                ", price = " + getPrice() + "$" +
                ", color = " + color +
                ", material = " + material +
                ", power = " + power;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Cigarette cigarette = (Cigarette) o;

        if (Double.compare(cigarette.power, power) != 0) return false;
        if (color != cigarette.color) return false;
        return material == cigarette.material;

    }

    @Override
    public int hashCode() {
        int result;
        long temp;
        result = color.hashCode();
        result = 31 * result + material.hashCode();
        temp = Double.doubleToLongBits(power);
        result = 31 * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
}
