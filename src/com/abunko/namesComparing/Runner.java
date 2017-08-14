package com.abunko.namesComparing;

import com.abunko.namesComparing.comparators.*;


import java.util.ArrayList;
import java.util.Collections;

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

        System.out.println(names.sorting(new AlphabetComparator()));
        System.out.println(names.sorting(ComparatorUtil.alphabetComparator()));

        System.out.println(names.reversSorting(new AlphabetComparator()));
        System.out.println(names.reversSorting(ComparatorUtil.alphabetComparator()));

        System.out.println(names.minName());

        System.out.println(names.sorting(new StringLengthComparator()));
        System.out.println(names.sorting(ComparatorUtil.lengthComparator()));

        System.out.println(names.sorting(new StringLengthAlphabetComparator()));
        System.out.println(names.sorting(ComparatorUtil.lengthAlphabetComparator()));

        System.out.println(names.reversSorting(new StringLengthAlphabetComparator()));

    }
}
