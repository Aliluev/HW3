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
        System.out.println(myLinkedList.toString());
    }

}
