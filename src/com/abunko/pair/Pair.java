package com.abunko.pair;

/**
 * Created by Andrew on 23.07.2017.
 */
public final class Pair <L, R>{
    private final L left;
    private  final R right;

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
