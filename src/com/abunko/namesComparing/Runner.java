package com.abunko.namesComparing;

import com.abunko.namesComparing.comparators.*;


import java.util.ArrayList;

/**
 * Created by Andrew on 26.07.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Names names = new Names(new ArrayList<>());

        names.addElement("cdfds");
        names.addElement("fw");
        names.addElement("adsg");
        names.addElement("Bw");

        System.out.println(names);

        names.sorting(new AlphabetComparator());
        System.out.println(names);

        names.reversSorting(new AlphabetComparator());
        System.out.println(names);

        System.out.println(names.minName());

        names.sorting(new StringLengthComparator());
        System.out.println(names);

        names.sorting(new StringLengthAlphabetComparator());
        System.out.println(names);

        System.out.println(names.reversSorting(new StringLengthAlphabetComparator()));

    }
}
