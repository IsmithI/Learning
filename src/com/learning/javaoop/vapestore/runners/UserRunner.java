package com.learning.javaoop.vapestore.runners;

import com.learning.javaoop.vapestore.Cart;
import com.learning.javaoop.vapestore.User;

/**
 * Created by Smith on 23.10.2016.
 */
public class UserRunner {

    public static void main(String[] args) {

        User user = new User("John", 123456789, "john@mail.com");

        Cart cart = Cart.getCart();

        cart.printCart();

        user.setCart(cart);
    }

}
