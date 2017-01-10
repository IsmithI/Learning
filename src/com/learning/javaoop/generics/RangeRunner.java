package com.learning.javaoop.generics;

import java.lang.reflect.ParameterizedType;

/**
 * Created by smith on 10/17/16.
 */
final class Range<T extends Number> {
    private final Pair<T, T> range;

    public Range(Pair<T, T> range) {
        if (!rangeIsValid(range)) throw new IllegalArgumentException("Starting number must be lower than ending number");
        this.range = range;
    }

    private boolean rangeIsValid(Pair<T, T> range) {
        if (range.getRight() instanceof Integer) {
            if (range.getLeft().intValue() >= range.getRight().intValue()) return false;
        }
        else if (range.getRight() instanceof Float) {
            if (range.getLeft().floatValue() >= range.getRight().floatValue()) return false;
        }
        else if (range.getRight() instanceof Short) {
            if (range.getLeft().shortValue() >= range.getRight().shortValue()) return false;
        }
        else if (range.getRight() instanceof Byte) {
            if (range.getLeft().byteValue() >= range.getRight().byteValue()) return false;
        }
        else if (range.getRight() instanceof Double) {
            if (range.getLeft().doubleValue() >= range.getRight().doubleValue()) return false;
        }
        else if (range.getRight() instanceof Long) {
            if (range.getLeft().longValue() >= range.getRight().longValue()) return false;
        }
        return true;
    }

    public Pair<T, T> getRange() {
        return range;
    }

    public T getStart() {
        return range.getLeft();
    }

    public T getEnd() {
        return range.getRight();
    }

    @Override
    public String toString() {
        return "Range{" +
                "range=" + range.getLeft() +
                ";"+ range.getRight() +'}';
    }
}

public class RangeRunner {
    public static void main(String[] args) {
        Range<Integer> range = new Range<>(new Pair<>(15, 10));
        System.out.println(range);
    }
}
