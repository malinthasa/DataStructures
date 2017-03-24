package com.malintha.datastructures.collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by malintha on 3/24/17.
 */
public class TestHashMap {

    public static void main(String[] args) {
        HashMap<MobileCustomer,Set> myHashMap = new HashMap<MobileCustomer, Set>();

        //Think you are doing a project. You are requested to maintain a list of
        //mobile phone numbers of every citizen in the country. Service providers provide list of phone numbers but
        //numbers are encoded.
        HashSet<String> phoneNumnbers = new HashSet<String>();
        phoneNumnbers.add("QWER1234");
        phoneNumnbers.add("YRRT545A");
        phoneNumnbers.add("3BGBHT5S");

        myHashMap.put(new MobileCustomer("88233455v", "Dialog"), phoneNumnbers);
    }
}
