package com.abunko.namesComparing.comparators;

import java.util.Comparator;

/**
 * Created by Andrew on 26.07.2017.
 */
public class AlphabetComparator implements Comparator<String>{
    @Override
    public int compare(String s1, String s2) {
        return s1.compareToIgnoreCase(s2);
    }
}
