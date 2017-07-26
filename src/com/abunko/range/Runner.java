package com.abunko.range;


/**
 * Created by Andrew on 26.07.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Integer i = 5;
        Integer i1 = 9;
        Range pair = new Range(i, i1);

        System.out.println(pair);

        i1  =3;
        pair = new Range(i, i1);

    }
}
