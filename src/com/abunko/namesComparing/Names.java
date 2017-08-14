package com.abunko.namesComparing;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Andrew on 26.07.2017.
 */
public class Names {
    private List<String> names;

    public Names(List<String> names) {
        this.names = names;
    }

    public void addElement(String str){
        names.add(str);
    }

    public void addAll(List<String> strings){
        strings.stream().forEach(s -> addElement(s));
    }

    public List<String> sorting(Comparator<String> comparator) {
        Collections.sort(names, comparator);
        return names;
    }

    public List<String> reversSorting(Comparator<String> comparator){
        Collections.sort(names, comparator.reversed());
        return names;
    }

    public String minName(){
        return Collections.min(names);
    }

    @Override
    public String toString() {
        return String.valueOf(names);
    }
}
