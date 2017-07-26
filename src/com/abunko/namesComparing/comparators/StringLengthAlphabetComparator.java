package com.abunko.namesComparing.comparators;

import java.util.Comparator;

/**
 * Created by Andrew on 26.07.2017.
 */
public class StringLengthAlphabetComparator implements Comparator<String>{

    @Override
    public int compare(String o1, String o2) {
        int n1 = o1.length();
        int n2 = o2.length();
         if ((n1 - n2) > 0) return 1;
         else if ((n1 - n2) < 0) return -1;
         else {
            return o1.compareToIgnoreCase(o2);
         }
    }
}
