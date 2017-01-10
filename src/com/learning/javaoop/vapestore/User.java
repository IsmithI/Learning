package com.learning.javaoop.vapestore;

/**
 * Created by Smith on 23.10.2016.
 */
public class User {

    private String name;
    private int phoneNumber;
    private Cart cart;
    private String email;

    public User(String name, int phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;

        register();
        proceedToStore();
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    private void register() {
        System.out.println("User successfully created!");
    }

    private void proceedToStore() {
        System.out.println("Ready to purchase!");
    }

    public String getName() {
        return name;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public Cart getCart() {
        return cart;
    }

    public String getEmail() {
        return email;
    }
}
