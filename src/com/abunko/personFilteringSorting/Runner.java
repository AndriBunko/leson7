package com.abunko.personFilteringSorting;

/**
 * Created by Andrew on 26.07.2017.
 */
public class Runner {
    public static void main(String[] args) {
        Person p = new Person("Olya", 24);
        Person p1 = new Person("Petya", 14);
        Person p2 = new Person("Oksana", 12);
        Person p3 = new Person("Olena", 12);
        Person p4 = new Person("Vlad", 17);
        Person p5 = new Person("Andrii", 17);

        People people = new People();
        people.addPerson(p);
        people.addPerson(p1);
        people.addPerson(p2);
        people.addPerson(p3);
        people.addPerson(p4);
        people.addPerson(p5);

        System.out.println(people);

        System.out.println(people.filteringSorting());

        String s = "Dsfds";
        String s1 = "dsfsdfsd";



    }
}
