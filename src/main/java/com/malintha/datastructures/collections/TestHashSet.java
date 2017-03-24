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

        // in addition to identical users, we have to preserve firstcome first serve seats
        LinkedHashSet<Person> audience = new LinkedHashSet<Person>();
    }
}
