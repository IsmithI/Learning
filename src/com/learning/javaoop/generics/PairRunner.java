package com.learning.javaoop.generics;

/**
 * Created by smith on 10/17/16.
 */
final class Pair<L, R> {

    private final L left;
    private final R right;

    public Pair(L left, R right) {
        this.left = left;
        this.right = right;
    }

    public L getLeft() {
        return left;
    }

    public R getRight() {
        return right;
    }
}

public class PairRunner {
    public static void main(String[] args) {
        Pair<Integer, String> pair = new Pair<>(10, "Text");
        Pair<String, Boolean> newPair = new Pair<>("New one", true);
    }
}
