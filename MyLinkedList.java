package com.mycompany.collection;

import java.util.Iterator;

public class MyLinkedList<E> implements ILinkedList<E> {

    public class Node<E>{
        E data;
        Node<E> next;
        Node<E> prev;
    }


    @Override
    public void add(E element) {

    }

    @Override
    public void add(int index, E element) {

    }

    @Override
    public void clear() {

    }

    @Override
    public E get(int index) {
        return null;
    }

    @Override
    public int indexOf(E element) {
        return 0;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public void set(int index, E element) {

    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public <E1> E1[] toArray(E1[] e) {
        return null;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public Iterator<E> iterator() {
        return null;
    }
}
