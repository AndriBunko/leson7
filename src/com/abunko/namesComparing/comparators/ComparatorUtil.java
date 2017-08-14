package com.abunko.namesComparing.comparators;

import java.util.Comparator;

/**
 * Created by Andrew on 14.08.2017.
 */
public final class ComparatorUtil {
    private ComparatorUtil() {
    }

    public static Comparator<String> alphabetComparator(){
        return (o1, o2) -> o1.compareToIgnoreCase(o2);
    }

    public static Comparator<String> lengthAlphabetComparator(){
        return (o1, o2) -> {int n1 = o1.length();
            int n2 = o2.length();
            if ((n1 - n2) > 0) return 1;
            else if ((n1 - n2) < 0) return -1;
            else {
                return o1.compareToIgnoreCase(o2);
            }
        };
    }

    public static Comparator<String> lengthComparator(){
        return (o1, o2) ->  o1.length() - o2.length();
    }
}
