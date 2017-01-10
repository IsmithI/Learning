package com.javapro.lesson1.task22;

import java.util.Arrays;

/**
 * Created by smith on 10.01.17.
 */
public class Myclass {

    private String name;
    private String surname;
    private String[] phones = new String[]{};
    private String[] sites = new String[]{};
    private Address address;

    private class Address {
        private String country;
        private String city;
        private String street;

        @Override
        public String toString() {
            return "Address{" +
                    "country='" + country + '\'' +
                    ", city='" + city + '\'' +
                    ", street='" + street + '\'' +
                    '}';
        }
    }

    @Override
    public String toString() {
        return "Myclass{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phones=" + Arrays.toString(phones) +
                ", sites=" + Arrays.toString(sites) +
                ", address=" + address +
                '}';
    }
}
