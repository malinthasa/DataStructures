package com.malintha.datastructures.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by malintha on 3/24/17.
 */
public class TestHashSet {
    public static void main(String[] args) {

        //need to add only identical users
        HashSet<Singer> registeredCompetitors = new HashSet<Singer>();
        registeredCompetitors.add(new Singer("malintha",34,"ABC"));
        registeredCompetitors.add(new Singer("ada",34,"ABC"));
        registeredCompetitors.add(new Singer("tr",34,"ABC"));

        for(Singer s:registeredCompetitors){
            System.out.println(s.getName());
        }



        // in addition to identical users, we have to preserve firstcome first serve seats
        LinkedHashSet<Person> audience = new LinkedHashSet<Person>();
        audience.add(new Person("malintha","123"));
        audience.add(new Person("adikari","129"));
        audience.add(new Person("Adi","123"));

        for(Person p: audience){
            System.out.println(p.getName());
        }

    }
}
