package com.abunko.namesComparing.comparators;

import java.util.Comparator;

/**
 * Created by Andrew on 26.07.2017.
 */
public class StringLengthComparator implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        return o1.length() - o2.length();
    }
}
