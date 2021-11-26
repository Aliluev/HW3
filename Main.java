package com.mycompany.collection;

import javax.swing.text.html.HTMLDocument;
import java.util.Iterator;

public class Main {

    public static void main(String[] args) {
        MyLinkedList<String> myLinkedList=new MyLinkedList<>();
        myLinkedList.insertFirst ("first");
        myLinkedList.insertFirst("second");
        myLinkedList.insertFirst("third");
        myLinkedList.insertLast("4");
        myLinkedList.insertBetween(2,"between");
        myLinkedList.clear(1);
        System.out.println(myLinkedList.get(1));
        System.out.println(myLinkedList.indexOf("4"));
        System.out.println(myLinkedList.toString()+" -----до set-----");
        myLinkedList.set(1,"ra-ta-ta");
        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.toArray().toString());
        myLinkedList.forEach(System.out::println);
        System.out.println(myLinkedList.remove(1));
        

        //---------------List-----------------------

        System.out.println("Lists:");
        com.mycompany.collection.TestCollectionClass.TestOfLists testOfLists = new TestCollectionClass().new TestOfLists();
        testOfLists.addingOfLists();
        testOfLists.addingCompareOfLists();
        testOfLists.removingCompareOfLists();
        testOfLists.indexOfCompareOfLists();
        System.out.println(testOfLists.arrayList.size());
        System.out.println(testOfLists.linkedList.size());
        System.out.println("");

        //---------------Set-----------------------

        System.out.println("Sets:");
        com.mycompany.collection.TestCollectionClass.TestOfSets testOfSets = new TestCollectionClass().new TestOfSets();
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
        com.mycompany.collection.TestCollectionClass.TestOfMaps testOfMaps = new TestCollectionClass().new TestOfMaps();
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
    
