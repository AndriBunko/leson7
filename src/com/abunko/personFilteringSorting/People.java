package com.abunko.personFilteringSorting;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Andrew on 26.07.2017.
 */
public class People {
    private  List<Person> people = new ArrayList<>();


    public void addPerson(Person person){
        people.add(person);
    }

    public List<Person> filteringSorting(){
        return people.stream().filter(person -> (person.getAge() <= 17) &&
                (person.getAge() >= 12)).sorted(new AgeComparator()).collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return String.valueOf(people);
    }
}
