package com.bvan.javaoop.collections._2_iteration._4_number_generator;

import java.util.Iterator;

/**
 * @author Bohdan Vanchuhov
 */
public class NumberGenerator implements Iterable<Integer> {
    private int min;
    private int max;

    public NumberGenerator(int min, int max) {
        this.min = min;
        this.max = max;
    }

    class NumberGeneratorIterator implements Iterator<Integer> {
        private int current = min;

        @Override
        public boolean hasNext() {
            return current <= max;
        }

        @Override
        public Integer next() {
            return current++;
        }
    }

    @Override
    public Iterator<Integer> iterator() {
        return new NumberGeneratorIterator();
    }
}
