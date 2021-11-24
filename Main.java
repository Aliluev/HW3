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
        System.out.println(myLinkedList.indexOf("4")); //equals доделать!!!!
        System.out.println(myLinkedList.toString()+" -----до set-----");
        myLinkedList.set(1,"ra-ta-ta");
        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.toArray().toString());
    }

}
