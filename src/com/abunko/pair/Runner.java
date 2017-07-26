package com.abunko.pair;

/**
 * Created by Andrew on 23.07.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Pair pair = new Pair("left", "right");
        Pair pair1 = new Pair(3,4);

        System.out.println(pair.getLeft() + " " + pair1.getLeft());
        System.out.println(pair.getRight() + " " + pair1.getRight());

    }
}
