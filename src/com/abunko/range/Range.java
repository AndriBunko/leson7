package com.abunko.range;

/**
 * Created by Andrew on 26.07.2017.
 */
public class Range<T extends Number & Comparable> {
    private final T begin;
    private final T end;

    public Range(T begin, T end) {
        isRangeCorrect(begin, end);
        this.begin = begin;
        this.end = end;
    }

    private  <T extends Number & Comparable> void isRangeCorrect(T begin, T end) {
        if (begin.compareTo(end) > 0)
            throw new IllegalArgumentException("low level > top level");
    }

    @Override
    public String toString() {
        return "Range{" +
                "begin=" + begin +
                ", end=" + end +
                '}';
    }
}
