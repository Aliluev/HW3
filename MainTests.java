package com.mycompany.collection;

import com.mycompany.collection.test.TestCollectionClass;

public class MainTests {
    public static void main(String[] args) {
        //---------------List-----------------------

        System.out.println("Lists:");
        TestCollectionClass.TestOfLists testOfLists = new TestCollectionClass().new TestOfLists();
        testOfLists.addingOfLists();
        testOfLists.addingCompareOfLists();
        testOfLists.removingCompareOfLists();
        testOfLists.indexOfCompareOfLists();
        System.out.println(testOfLists.arrayList.size());
        System.out.println(testOfLists.linkedList.size());
        System.out.println("");

        //---------------Set-----------------------

        System.out.println("Sets:");
        TestCollectionClass.TestOfSets testOfSets = new TestCollectionClass().new TestOfSets();
        testOfSets.addingOfSets();
        testOfSets.addingCompareOfSets();
        testOfSets.removingCompareOfSets();
        testOfSets.containsCompareOfSets();
        System.out.println(testOfSets.hashSet.size());
        System.out.println(testOfSets.linkedhashSet.size());
        System.out.println(testOfSets.treeSet.size());
        System.out.println("");

        //---------------Map-----------------------

        System.out.println("Maps:");
        TestCollectionClass.TestOfMaps testOfMaps = new TestCollectionClass().new TestOfMaps();
        testOfMaps.addingOfMaps();
        testOfMaps.addingCompareOfMaps();
        testOfMaps.removingCompareOfSets();
        testOfMaps.getCompareOfSets();
        System.out.println(testOfMaps.hashMap.size());
        System.out.println(testOfMaps.linkedHashMap.size());
        System.out.println(testOfMaps.treeMap.size());
        System.out.println("");
    }
}
