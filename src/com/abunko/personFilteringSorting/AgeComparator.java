package com.abunko.personFilteringSorting;

import java.util.Comparator;

/**
 * Created by Andrew on 26.07.2017.
 */
public class AgeComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if ((o1.getAge() - o2.getAge()) > 0) return 1;
        else if ((o1.getAge() - o2.getAge()) < 0) return -1;
        else {
            String s1 = o1.getName();
            String s2 = o2.getName();
            return s1.compareToIgnoreCase(s2);
        }
    }
}
